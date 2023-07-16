import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class ExtraCredit {
    public static double getAverage(int values[])
    {
        double sum = 0.0;
        double ave = 0.0;
        double[] data;

        Random rnd = new Random();
        data = new double[100];

        for(int x = 0; x < data.length; x++)
        {
            data[x] = rnd.nextInt(100) + 1;
        }

        for(int x = 0; x < data.length; x++)
        {
            sum = sum += data[x];
        }
        ave = sum / data.length;

        return ave;
    }

    //static method - returns min value
    public static int min (int values[])
    {
        int [] data;

        Random rnd = new Random();
        data = new int[100];
        int min = data[0];

        for(int x = 0; x < data.length; x++)
        {
            data[x] = rnd.nextInt(100) + 1;
        }


        for(int x = 0; x < data.length; x++)
        {
            if (min > data[x]) {
                min = data[x];
            }
        }

        return min;
    }

    //static method - returns max value
    public static int max (int values[])
    {
        int [] data;

        Random rnd = new Random();
        data = new int[100];
        int max = data[0];

        for(int x = 0; x < data.length; x++)
        {
            data[x] = rnd.nextInt(100) + 1;
        }

        for(int x = 0; x < data.length; x++)
        {
            if (max < data[x]) {
                max = data[x];
            }
        }

        return max;
    }

    //static method - returns the number of times target is found in the values array
    public static int occurrenceScan(int values[], int target)
    {
        int[] data;
        int userInput = 0;
        int targetQuantity = 0;
        boolean foundTarget = false;

        data = new int[100];

        for(int x = 0; x < data.length; x++)
        {
            if(data[x] == userInput)
            {
                System.out.println("Found " + userInput + " at locus " + x);
            }
        }
        if(!foundTarget)
        {
            System.out.println("Input " + userInput + " not found!");
        }

        return targetQuantity;

    }

    //static method - returns the sum of the values array elements
    public static int sum(int values[])
    {
        int sum = 0;
        int[] data;

        Random rnd = new Random();
        data = new int[100];

        for(int x = 0; x < data.length; x++)
        {
            data[x] = rnd.nextInt(100) + 1;
        }

        for(int x = 0; x < data.length; x++)
        {
            sum = sum += data[x];
        }

        return sum;

    }

    //static method - returns true of the values array contains target
    public boolean contains(int values[], int target)
    {
        int[] data;
        int userInput = 0;
        boolean foundTarget = false;

        data = new int[100];

        for(int x = 0; x < data.length; x++)
        {
            if(data[x] == userInput)
            {
                foundTarget = true;
            } else if(data[x] != userInput)
            {
                foundTarget = false;
            }
        }

        return foundTarget;
    }

    /* public static double getAverage(int values[])
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
    } */


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

        System.out.println("\nThe minimum value of dataPoints is: " + min(dataPoints));
        System.out.println("\nThe maximum value of dataPoints is: " + max(dataPoints));
        System.out.println("\nThe target is found " + occurrenceScan(dataPoints, 2) + " times in dataPoints");
        System.out.println("\nThe sum of the values is: " + sum(dataPoints));

    }
}