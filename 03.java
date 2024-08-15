import java.util.Scanner;
public class Mavenproject1
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String str1 = sc.nextLine();

        if (str1 == null || str1.isEmpty()) {
            System.out.println("Empty sentence.");
            return;
        }
        StringBuffer revstr = new StringBuffer();
        String[] words = str1.split(" ");
        for (int i = words.length - 1; i >= 0; i--) 
        {
            revstr.append(words[i]);
            if (i > 0) 
            {
                revstr.append(" ");
            }
        }
        System.out.println("Original sentence: " + str1);
        System.out.println("Reversed sentence: " + revstr.toString());
    }
} 
