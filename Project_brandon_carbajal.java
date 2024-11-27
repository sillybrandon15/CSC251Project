import java.util.*;
import java.io.*;

public class Project_brandon_carbajal
{
   public static void main(String[] args) throws IOException
   {
      //Declaring variables
      int policyNumber, holderAge, totalSmoker = 0, totalNonSmoker = 0;
      String providerName, holderFirstName, holderLastName,
             holderSmokingStatus;
      double holderHeight, holderWeight;
      
      // Creating a file object to create a pathway to the desired .txt file
      File myFile = new File("PolicyInformation.txt");
      
      /* Creating a scanner object with a reference to the File object so that we can
       * use the Scanner class' methods to read information from the actual file
       */
      Scanner inputFile = new Scanner(myFile);
      
      // Creating a ArrayList to hold all the Policy class objects
      var policyArray = new ArrayList<Policy>();
      
      //While loop that creates can create any amount of Policy objects 
      while(inputFile.hasNext() == true)
      {
         //Populates the variables by reading input from the file
         policyNumber = inputFile.nextInt();
         if(inputFile.hasNext())
            inputFile.nextLine();// buffer
         providerName = inputFile.nextLine();
         holderFirstName = inputFile.nextLine();
         holderLastName = inputFile.nextLine();
         holderAge = inputFile.nextInt();
         if(inputFile.hasNext())
            inputFile.nextLine();// buffer
         holderSmokingStatus = inputFile.nextLine();
         holderHeight = inputFile.nextDouble();
         holderWeight = inputFile.nextDouble();
            
         //Declares a new Policy object and adds it to policyArray
         policyArray.add(new Policy(policyNumber, providerName, new PolicyHolder(holderFirstName,
                                                                holderLastName, holderAge, holderSmokingStatus,
                                                                holderHeight, holderWeight)));
      }
      
      for(Policy currentPolicy : policyArray)
      {
         //Displaying the information
         System.out.println("\n" + currentPolicy);
         //Detects whether the current policy holder is a smoker or non-smoker, and adds one to a counter 
         if(currentPolicy.getPolicyHolder().getHolderSmokingStatus().equalsIgnoreCase("smoker"))
            totalSmoker++;
         else if(currentPolicy.getPolicyHolder().getHolderSmokingStatus().equalsIgnoreCase("non-smoker"))
            totalNonSmoker++;
      }
      
      //Displays the total number of policies with a smoker and the ones with a non-smoker
      System.out.println("\nThere were " + Policy.getCounter() + " Policy objects created.");
      System.out.println("The number of policies with a smoker is: " + totalSmoker);
      System.out.println("The number of policies with a non-smoker is: " + totalNonSmoker);
   }
}