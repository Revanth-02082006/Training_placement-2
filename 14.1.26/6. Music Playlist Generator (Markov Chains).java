import java.util.*;

public class PlaylistGenerator {
    static Map<String, List<String>> transitions = new HashMap<>();

    public static void train(String[] songs) {
        for (int i = 0; i < songs.length - 1; i++) {
            transitions.computeIfAbsent(songs[i], k -> new ArrayList<>()).add(songs[i+1]);
        }
    }

    public static String generate(String start, int length) {
        Random rand = new Random();
        StringBuilder playlist = new StringBuilder(start);
        String current = start;
        for (int i = 1; i < length; i++) {
            List<String> nextSongs = transitions.getOrDefault(current, Arrays.asList("RandomSong"));
            current = nextSongs.get(rand.nextInt(nextSongs.size()));
            playlist.append(" -> ").append(current);
        }
        return playlist.toString();
    }

    public static void main(String[] args) {
        String[] history = {"SongA","SongB","SongC","SongA","SongD","SongB"};
        train(history);
        System.out.println("Generated Playlist: " + generate("SongA", 6));
    }
}
