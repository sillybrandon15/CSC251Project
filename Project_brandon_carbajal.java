import java.util.Scanner;

public class Project_brandon_carbajal
{
   public static void main(String[] args)
   {
      int policyNumber, holderAge;
      String providerName, holderFirstName, holderLastName,
           holderSmokingStatus;
      double holderHeight, holderWeight;
      Scanner keyboard = new Scanner(System.in);
      
      do
      {
         System.out.print("Please enter the Policy Number: ");
         policyNumber = keyboard.nextInt();
         if(policyNumber<=0)
         {
            System.out.print("\nERROR: Please enter a valid policy number: ");
            policyNumber = keyboard.nextInt();
         }
      } while (policyNumber <=0);
      
      keyboard.nextLine();
      
      System.out.print("\nPlease enter the Provider's Name: ");
      providerName = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder’s First Name: ");
      holderFirstName = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder’s Last Name: ");
      holderLastName = keyboard.nextLine();
      
      do
      {
         System.out.print("\nPlease enter the Policyholder’s Age: ");
         holderAge = keyboard.nextInt();
         if(holderAge<=0)
         {
            System.out.print("\nERROR: Please enter a valid age: ");
            holderAge = keyboard.nextInt();
         }
      } while (holderAge <=0);
      
      keyboard.nextLine();
      
      do
      {
         System.out.print("\nPlease enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
         holderSmokingStatus = keyboard.nextLine();
         holderSmokingStatus.toLowerCase();
         if (!(holderSmokingStatus.equalsIgnoreCase("smoker")) && !(holderSmokingStatus.equalsIgnoreCase("non-smoker")))
         {
            System.out.print("\nERROR: Please enter either 'smoker' or 'non-smoker': ");
            holderSmokingStatus = keyboard.nextLine();
            holderSmokingStatus.toLowerCase();
         }
      } while (!(holderSmokingStatus.equalsIgnoreCase("smoker")) && !(holderSmokingStatus.equalsIgnoreCase("non-smoker")));
      
      do
      {
         System.out.print("\nPlease enter the Policyholder’s Height (in inches): ");
         holderHeight = keyboard.nextDouble();
         if(holderHeight<=0)
         {
            System.out.print("\nERROR: Please enter a valid height: ");
            holderHeight = keyboard.nextDouble();;
         }
      } while (holderHeight <=0);

      do
      {
         System.out.print("\nPlease enter the Policyholder’s Weight (in pounds): ");
         holderWeight = keyboard.nextDouble();
         if(holderWeight<=0)
         {
            System.out.print("\nERROR: Please enter a valid weight: ");
            holderWeight = keyboard.nextDouble();
         }
      } while (holderWeight <=0);
      
      Policy policy = new Policy(policyNumber, providerName, holderFirstName,
                                 holderLastName, holderAge, holderSmokingStatus,
                                 holderHeight, holderWeight);
      
      System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder’s First Name: " + policy.getHolderFirstName());
      System.out.println("Policyholder’s Last Name: " + policy.getHolderLastName());
      System.out.println("Policyholder’s Age: " + policy.getHolderAge());
      System.out.println("Policyholder’s Smoking Status: " + policy.getHolderSmokingStatus());
      System.out.println("Policyholder’s Height: " + policy.getHolderHeight() + " inches");
      System.out.println("Policyholder’s Weight: " + policy.getHolderWeight() + " pounds");
      System.out.printf("Policyholder’s BMI: %.2f\n", policy.calculateBMI());
      System.out.printf("Policy Price: $%,.2f\n", policy.calculatePolicyPrice());
   }
}