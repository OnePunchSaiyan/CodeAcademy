import java.util.ArrayList;

public class Playlist {
    public static void main(String[] args) {

        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();


        desertIslandPlaylist.add("Bohemian Rhapsody");
        desertIslandPlaylist.add("Stairway to Heaven");
        desertIslandPlaylist.add("Hotel California");
        desertIslandPlaylist.add("Sweet Child O' Mine");
        desertIslandPlaylist.add("Imagine");
        desertIslandPlaylist.add("Billie Jean");


        System.out.println("Playlist: " + desertIslandPlaylist);


        System.out.println("Number of songs on playlist: " + desertIslandPlaylist.size());


        while (desertIslandPlaylist.size() > 5) {
            desertIslandPlaylist.remove(desertIslandPlaylist.size() - 1);
        }


        System.out.println("Trimmed playlist: " + desertIslandPlaylist);


        int indexA = desertIslandPlaylist.indexOf("Bohemian Rhapsody");
        int indexB = desertIslandPlaylist.indexOf("Hotel California");


        String tempA = desertIslandPlaylist.get(indexA);
        desertIslandPlaylist.set(indexA, desertIslandPlaylist.get(indexB));
        desertIslandPlaylist.set(indexB, tempA);


        System.out.println("Final playlist: " + desertIslandPlaylist);
    }
}
