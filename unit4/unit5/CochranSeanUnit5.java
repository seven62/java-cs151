// Class name must be "Main"

// import java util.*

class Main {
     public static void main(String[] args) 
     {
     
            
        Scanner stdIn = new Scanner(System.in);
        
        int randInt;
        double randDiv;
        double randLog;
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

        sout header titles for table
            
        for (int i = 0; i < count; i++)
        {
            randInt = Math.floor(math.random() * maxRandomInt);
            
        }
         
         
         
         
     }
}
