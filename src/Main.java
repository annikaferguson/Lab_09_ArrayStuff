import java.util.Random;
import java.util.Scanner;

public class Main {
    public static double getAverage(int values[])
    {
        double sum = 0.0;
        double ave = 0.0;
        double[] data;

        Random rnd = new Random();
        data = new double[1000];

        for(int x = 0; x < data.length; x++)
        {
            data[x] = rnd.nextInt(1000) + 1;
        }

        for(int x = 0; x < data.length; x++)
        {
            sum = sum += data[x];
        }
        ave = sum / data.length;

        return ave;
    }

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

        //2a and b
        Scanner in = new Scanner(System.in);
        int userInput = 0;
        boolean foundTarget = false;

        userInput = SafeInput.getRangedInt(in, "Enter an integer between 1-100 ", 1, 100);

        for(int x = 0; x < dataPoints.length; x++)
        {
            if(dataPoints[x] == userInput)
            {
                System.out.println("Found " + userInput + " at locus " + x);
            }
        }
        if(!foundTarget)
        {
            System.out.println("Input " + userInput + " not found!");
        }

        //c
        for(int x = 0; x < dataPoints.length; x++)
        {
            if(dataPoints[x] == userInput)
            {
                foundTarget = true;
                System.out.println("The value " + userInput + " was found at array index " + x);
                break;
            }
        }

        //d
        int min = dataPoints[0];
        int max = dataPoints[0];

        for(int x = 0; x < dataPoints.length; x++)
        {
            if(min > dataPoints[x])
            {
                min = dataPoints[x];
            }
            if(max > dataPoints[x])
            {
                max = dataPoints[x];
            }
        }
        System.out.println("The min is " + min);
        System.out.println("The max is " + max);

        //e
        System.out.println();
        System.out.println("\nAverage of dataPoints is: " + getAverage(dataPoints));

    }
}