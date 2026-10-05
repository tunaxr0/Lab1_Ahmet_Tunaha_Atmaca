

/**
 * PlaylistDemo.java
 * Driver program to test the updated Track class.
 * Name:        Ahmet Tunahan Atmaca
 * Student ID:  240444018
 * Date:        05.10.2026
 */

public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===\n");

        // --- 1. Default constructor ---
        Track track1 = new Track();
        System.out.println(track1.toString());
        System.out.println();

        // --- 2. Title-only constructor ---
        Track track2 = new Track("Yakamoz");
        System.out.println(track2.toString());
        System.out.println();
        // --- 3. Title + artist constructor ---
        Track track3 = new Track("Yediveren", "No1");
        System.out.println(track1.toString());
        System.out.println();

        // --- 4. Full constructor (Explicit track) ---
        Track track4 = new Track("Domdom", "Ibo", 177,true);
        System.out.println(track4.toString());
        System.out.println();

        // --- 5. Full constructor (Clean track) ---
        Track track5 = new Track("Training Season", "Dua Lipa", 129,false);
        System.out.println(track5.toString());
        System.out.println();

        // --- 6. Invalid duration test ---
        Track track6 = new Track("Season", "Dua Lipa", -50 ,true);
        System.out.println(track6.toString());
        System.out.println();

        // --- 7. Getter test ---
        System.out.println("Track4");
        System.out.println("Title: " + track4.getTitle());
        System.out.println("Artist: " + track4.getArtist());
        System.out.println("Duration (seconds): " + track4.getDurationSeconds());
        System.out.println("Formatted Duration: " + track4.getDurationFormatted());
        System.out.println("Is Explicit: " + track4.getIsExplicit());

    }
}