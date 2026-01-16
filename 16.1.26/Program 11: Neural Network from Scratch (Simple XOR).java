import java.util.Random;

class NeuralNetwork {
    double[][] weightsInputHidden;
    double[] weightsHiddenOutput;
    double[] hiddenBias, outputBias;
    Random rand = new Random();

    public NeuralNetwork(int inputSize, int hiddenSize) {
        weightsInputHidden = new double[inputSize][hiddenSize];
        weightsHiddenOutput = new double[hiddenSize];
        hiddenBias = new double[hiddenSize];
        outputBias = new double[1];
        initWeights();
    }

    private void initWeights() {
        for (int i = 0; i < weightsInputHidden.length; i++)
            for (int j = 0; j < weightsInputHidden[0].length; j++)
                weightsInputHidden[i][j] = rand.nextDouble() - 0.5;
        for (int j = 0; j < weightsHiddenOutput.length; j++)
            weightsHiddenOutput[j] = rand.nextDouble() - 0.5;
    }

    private double sigmoid(double x) { return 1 / (1 + Math.exp(-x)); }

    public double train(double[][] inputs, double[] targets, int epochs, double lr) {
        double output = 0;
        for (int e = 0; e < epochs; e++) {
            for (int t = 0; t < inputs.length; t++) {
                double[] hidden = new double[weightsHiddenOutput.length];
                for (int j = 0; j < hidden.length; j++) {
                    hidden[j] = hiddenBias[j];
                    for (int i = 0; i < inputs[t].length; i++)
                        hidden[j] += inputs[t][i] * weightsInputHidden[i][j];
                    hidden[j] = sigmoid(hidden[j]);
                }
                output = outputBias[0];
                for (int j = 0; j < hidden.length; j++)
                    output += hidden[j] * weightsHiddenOutput[j];
                output = sigmoid(output);

                double error = targets[t] - output;
                for (int j = 0; j < hidden.length; j++)
                    weightsHiddenOutput[j] += lr * error * hidden[j];
                outputBias[0] += lr * error;

                for (int j = 0; j < hidden.length; j++) {
                    double hiddenError = error * weightsHiddenOutput[j];
                    for (int i = 0; i < inputs[t].length; i++)
                        weightsInputHidden[i][j] += lr * hiddenError * inputs[t][i];
                    hiddenBias[j] += lr * hiddenError;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        NeuralNetwork nn = new NeuralNetwork(2, 2);
        double[][] inputs = {{0,0},{0,1},{1,0},{1,1}};
        double[] targets = {0,1,1,0}; // XOR
        nn.train(inputs, targets, 5000, 0.1);
        for (int i = 0; i < inputs.length; i++) {
            System.out.println("Input: " + inputs[i][0] + "," + inputs[i][1]);
        }
    }
}
