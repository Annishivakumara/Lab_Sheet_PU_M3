import java.util.Scanner;
public class Mavenproject1
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String[] playlist = {"Imagine", "Bohemian Rhapsody", "Hotel California", "Stairway to Heaven"};
        for(String i:playlist)
            System.out.print(i+"\n");
        System.out.print("Enter song name:");
        String targetSong = sc.nextLine();
        int songIndex = -1;
        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i].equalsIgnoreCase(targetSong)) {
                songIndex = i;
                break;
            }
        }
        if (songIndex != -1)
            System.out.println("The song \"" + targetSong + "\" is at index " + songIndex);
        else
            System.out.println("The song \"" + targetSong + "\" is not found in the playlist.");
    }
} 
