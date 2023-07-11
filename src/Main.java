import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        Random rnd = new Random();
        int[] dataPoints;

        //1a
        dataPoints = new int[100];

        // 1b
        for(int x = 0; x < dataPoints.length; x++)
        {
            dataPoints[x] = rnd.nextInt(100) + 1;
        }

        // 1c
        for(int x = 0; x < dataPoints.length; x++)
        {
            System.out.printf("|%3d ", dataPoints[x]);
        }

        //1d sum and ave
        int sum = 0;

        for(int x = 0; x < dataPoints.length; x++)
        {
            sum = sum += dataPoints[x];
        }
        int ave = sum / dataPoints.length;

        System.out.println("\nThe sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + ave);

    }
}