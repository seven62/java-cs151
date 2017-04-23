public class Main
{
     public static void main(String[] args)
     {


        Scanner stdIn = new Scanner(System.in);

        int randInt;
        double randDiv;
        double randLog;
        double randsqrt;
        int randCube;
        String maxRandom;  //
        String count;  //
        int maxRandomInt;
        int countInt;


        System.out.println("Enter the maximum random number value: ");
        maxRandom = stdIn.nextLine();

        System.out.println("Enter how many random numbers to generate: ");
        count = stdIn.nextLine();

        maxRandomInt = Integer.parseInt(maxRandom);
        countInt = Integer.parseInt(count);

        sout header titles for table;

        for (int i = 0; i < count; i++)
        {
            randInt = Math.floor(math.random() * maxRandomInt);
            randDiv = (double)randInt / maxRandomInt;
            randLog = Math.log(randInt);
            randsqrt = Math.sqrt(randInt);
            randCube = Math.pow(randInt, 3);
        }

        system.out.printf("%10s%10s%10s%10s%10s%10s\n", "Round", "Rand #", "fraction", "x^3", "sqrt", "log");
        system.out.printf("%10d%10d%10f%10f%10f%10d\n", i+1, randInt, randDiv, randLog, randsqrt, randCube);





     }
}
