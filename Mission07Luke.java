//import appropriate tools for program
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

//beginning of program / class
public class Mission07Luke
{
   //Main method starts here
   public static void main (String[] args)
   {
      /****************Setup / Initialization*****************/
      
      //Create instance for Random and Scanner tools
      Scanner in = new Scanner (System.in);
      Random r = new Random();
      
      //Create Array to store sums of dice rolls
      double[] dieSumArray = new double[11];
      
      dieSumArray[0] = 0.0;
      dieSumArray[1] = 0.0;
      dieSumArray[2] = 0.0;
      dieSumArray[3] = 0.0;
      dieSumArray[4] = 0.0;
      dieSumArray[5] = 0.0;
      dieSumArray[6] = 0.0;
      dieSumArray[7] = 0.0;
      dieSumArray[8] = 0.0;
      dieSumArray[9] = 0.0;
      dieSumArray[10] = 0.0;
      
      //Create Array Lists for histogram results
      ArrayList<String> two = new ArrayList<String>();
      ArrayList<String> three = new ArrayList<String>();
      ArrayList<String> four = new ArrayList<String>();
      ArrayList<String> five = new ArrayList<String>();
      ArrayList<String> six = new ArrayList<String>();
      ArrayList<String> seven = new ArrayList<String>();
      ArrayList<String> eight = new ArrayList<String>();
      ArrayList<String> nine = new ArrayList<String>();
      ArrayList<String> ten = new ArrayList<String>();
      ArrayList<String> eleven = new ArrayList<String>();
      ArrayList<String> twelve = new ArrayList<String>();
      
      //Initialize variables to be used in program
      double numOfRolls = 0;
      int die1 = 0;
      int die2 = 0;
      int dieSum = 0;
      double onePercentValue = 0;
      int numOfAsterisks = 0;
      
      /*******************User Input**********************/
      
      //Ask user for input on the total number of dice rolls
      System.out.println("Welcome to the dice throwing simulator!");
      System.out.println("How many dice rolls would you like to simulate?");
      numOfRolls = in.nextInt();
      
      /**************************************************/
      //Begin dice roll simulation
      /**************************************************/
      /******************Part 1**************************/
      
      for (int i = 0; i < numOfRolls; i++)
      {
         //generate value for each die
         die1 = r.nextInt(6) + 1;
         die2 = r.nextInt(6) + 1;
        
         
         //Add die rolls together
         dieSum = die1 + die2;
         
         //Check value of dieSum and increment value in corresponding index of dieSumArray
         for (int j = 2; j <= 12; j++)
         {
            if (dieSum == j)
            {
               dieSumArray[j-2] = dieSumArray[j-2] + 1 ;
                
            }
         }//end of 1st nested for loop
       
       }//end of 1st for loop
       
       
       /*************************************************
       *******************Part 2************************/
       
       //Perform calculations to find value for 1% of total dice rolls
       onePercentValue = (numOfRolls / 100);
       
       //Iterate through elements of dieSumArray to find corresponding percentage of rolls out of the total # of rolls
       for (int i = 0; i < dieSumArray.length; i++)
       {
         dieSumArray[i] = (dieSumArray[i] / onePercentValue);
         //Assign appropriate # of asterisks to corresponding array list
         for (double j = dieSumArray[i]; j >= 1; j--)
         {
            if (i == 0)
            {
               two.add("*");
            }
            if (i == 1)
            {
               three.add("*");
            }
            if (i == 2)
            {
               four.add("*");
            }
            if (i == 3)
            {
               five.add("*");
            }
            if (i == 4)
            {
               six.add("*");
            }
            if (i == 5)
            {
               seven.add("*");
            }
            if (i == 6)
            {
               eight.add("*");
            }
            if (i == 7)
            {
               nine.add("*");
            }
            if (i == 8)
            {
               ten.add("*");
            }
            if (i == 9)
            {
               eleven.add("*");
            }
            if (i == 10)
            {
               twelve.add("*");
            }//end of if statements
   
         }//end of 2nd nested for loop
         
       }//end of 2nd for loop
       
       
      /******************************************
      ******************End Step****************/
         
      //Print results
      
      System.out.println("DICE ROLLING SIMULATION RESULTS");
      System.out.println("Each \"*\" represents 1% of the total number of rolls.");
      System.out.println("Total number of rolls = " + (int)numOfRolls + ".\n\n");
      System.out.println("2:  " + two);
      System.out.println("3:  " + three);
      System.out.println("4:  " + four);
      System.out.println("5:  " + five);
      System.out.println("6:  " + six);
      System.out.println("7:  " + seven);
      System.out.println("8:  " + eight);
      System.out.println("9:  " + nine);
      System.out.println("10: " + ten);
      System.out.println("11: " + eleven);
      System.out.println("12: " + twelve + "\n\n");
      System.out.println("Thank you for using the dice throwing simulator. Goodbye!");
      
   
   }//end of main method


}//end of class / program