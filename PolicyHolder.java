public class PolicyHolder
{
   /*
   ----------Fields---------------
   */
   
   //Declaring the class' attributes
   private int holderAge;
   private String holderFirstName, holderLastName,
           holderSmokingStatus;
   private double holderHeight, holderWeight;
   
   /*
   ----------Constructors---------------
   */
   
   /**
    * No-arg constructor
    */
   public PolicyHolder()
   {
      holderFirstName = "";
      holderLastName = "";
      holderAge = 0;
      holderSmokingStatus = "";
      holderHeight = 0;
      holderWeight = 0;
   }

   /**
    * Constructor that accepts all relevant arguments to fully initialize the instance
    *
    * @param firstName The policyholder's first name
    * @param lastName The policyholder's last name
    * @param age The policyholder's age
    * @param smoking The policyholder's smoking status (either "smoker" or "non-smoker")
    * @param height The policyholder's height
    * @param weight The policyholder's weight
    */
    
   /*
   ------------Methods(Mutator)--------------
   */
   
   /**
    * Sets the policyholder's first name
    *
    * @param firstName The policyholder's first name
    */
   public void setHolderFirstName(String firstName)
   {
      holderFirstName = firstName;
   }
   
   /**
    * Sets the policyholder's last name
    *
    * @param lastName The policyholder's last name
    */
   public void setHolderLastName(String lastName)
   {
      holderLastName = lastName;
   }
   
   /**
    * Sets the policyholder's age
    *
    * @param age The policyholder's age
    */
   public void setHolderAge(int age)
   {
      holderAge = age;
   }
   
   /**
    * Sets the policyholder's smoking status | "smoker" or "non-smoker"
    *
    * @param smoking The policyholder's smoking status (either "smoker" or "non-smoker")
    */
   public void setHolderSmokingStatus(String smoking)
   {
      holderSmokingStatus = smoking;
   }
   
   /**
    * Sets the policyholder's height
    *
    * @param height The policyholder's height
    */
   public void setHolderHeight(double height)
   {
      holderHeight = height;
   }
   
   /**
    * Sets the policyholder's weight
    *
    * @param weight The policyholder's weight
    */
   public void setHolderWeight(double weight)
   {
      holderWeight = weight;
   }
   
   /*
   ----------Methods(Accessors)---------------
   */
   
   /**
    * Gets the policyholder's first name
    *
    * @return A string of the current holder's first name
    */
   public String getHolderFirstName()
   {
      return holderFirstName;
   }
   
   /**
    * Gets the policyholder's last name
    *
    * @return A String of the current holder's last name
    */
   public String getHolderLastName()
   {
      return holderLastName;
   }
   
   /**
    * Gets the policyholder's age
    *
    * @return An int of the current holder's age
    */
   public int getHolderAge()
   {
      return holderAge;
   }
   
   /**
    * Gets the policyholder's smoking status | "smoker" or "non-smoker"
    *
    * @return A String containing either "smoker" or "non-smoker"
    */
   public String getHolderSmokingStatus()
   {
      return holderSmokingStatus;
   }
   
   /**
    * Gets the policyholder's height
    *
    * @return A double containing the current holder's height
    */
   public double getHolderHeight()
   {
      return holderHeight;
   }
   
   /**
    * Gets the policyholder's weight
    *
    * @return A double containing the current holder's weight
    */
   public double getHolderWeight()
   {
      return holderWeight;
   }
   
   /*
   ----------Methods(Other)---------------
   */
  
   /**
    * Calculates and returns the policyholder's BMI
    *
    * @return The approximate BMI value using the current holder's height and weight
    */
   public double calculateBMI()
   {
      return ((holderWeight * 703) / (holderHeight * holderHeight));
   }
   
   /**
    * Calculates and returns the price of the policy
    *
    * @return A double containing the price of the policy based on the current holder's weight and height
    */

   public double calculatePolicyPrice()
   {
      //Declaring the variables
      /*NOTE: BMI is given a variable here in order to avoid having stale data.
              Declaring BMI here makes sure all the variables in the calculation
              are up-to-date. */
      double base = 600,
             bmi = ((holderWeight * 703) / (holderHeight * holderHeight)),
             price = 0;
      
      price = base;
      
      if (holderAge > 50)
         price += 75;
      if (holderSmokingStatus.equals("smoker"))
         price += 100;
      if (bmi > 35)
         price += ((bmi - 35) * 20);
      
      return price;
   }
   
   public String toString()
   {
      String str = "Policyholder's First Name " + holderFirstName +
                   "\nPolicyholder's Last Name: " + holderLastName + 
                   "\nPolicyholder's Age: " + holderAge +
                   "\nPolicyholder's Smoking Status (Y/N): " + holderSmokingStatus +
                   "\nPolicyholder's Height: " + holderHeight +
                   "\nPolicyholder's Weight: " + holderWeight +
                   "\nPolicyholder's BMI: " + calculateBMI() +
                   "\nPolicy Price: " + calculatePolicyPrice();
      return str;
   
   }
}