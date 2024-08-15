import java.util.Scanner;
public class Mavenproject1
{
    public static int findMin(int[][] numbers) {
        int min = numbers[0][0];
        for (int[] number : numbers) {
            for (int j : number) {
                if (j < min) {
                    min = j;
                }
            }
        }
        return min;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter Elements:");                
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                arr[i][j]=sc.nextInt();
        }
        System.out.print("Minimum Value:"+findMin(arr));
    }
} 
