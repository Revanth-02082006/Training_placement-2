import java.util.*;

class Individual {
    String genes;
    int fitness;

    public Individual(String genes, String target) {
        this.genes = genes;
        this.fitness = calcFitness(target);
    }

    private int calcFitness(String target) {
        int score = 0;
        for (int i = 0; i < target.length(); i++) {
            if (genes.charAt(i) == target.charAt(i)) score++;
        }
        return score;
    }
}

public class GeneticAlgorithm {
    private static final String TARGET = "HELLOJAVA";
    private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final Random rand = new Random();

    private static String randomGenes() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TARGET.length(); i++) {
            sb.append(CHARS.charAt(rand.nextInt(CHARS.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        List<Individual> population = new ArrayList<>();
        for (int i = 0; i < 100; i++) population.add(new Individual(randomGenes(), TARGET));

        int generation = 0;
        while (true) {
            population.sort((a, b) -> b.fitness - a.fitness);
            Individual best = population.get(0);
            System.out.println("Gen " + generation + ": " + best.genes + " (" + best.fitness + ")");
            if (best.fitness == TARGET.length()) break;

            List<Individual> newPop = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                String parent1 = population.get(rand.nextInt(50)).genes;
                String parent2 = population.get(rand.nextInt(50)).genes;
                String child = crossover(parent1, parent2);
                newPop.add(new Individual(mutate(child), TARGET));
            }
            population = newPop;
            generation++;
        }
    }

    private static String crossover(String a, String b) {
        int point = rand.nextInt(a.length());
        return a.substring(0, point) + b.substring(point);
    }

    private static String mutate(String genes) {
        char[] arr = genes.toCharArray();
        if (rand.nextDouble() < 0.1) {
            arr[rand.nextInt(arr.length)] = CHARS.charAt(rand.nextInt(CHARS.length()));
        }
        return new String(arr);
    }
}
