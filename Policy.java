public class Policy
{
   /*
   ----------Fields---------------
   */
   
   //Declaring the class' attributes
   private int policyNumber;
   private String providerName;
   private static int policyCount = 0;
   private PolicyHolder holder;
   
   /*
   ----------Constructors---------------
   */
   
   //No-arg constructor to initialize all the attributes
   public Policy()
   {
      policyNumber = 0;
      providerName = "";
      holder = new PolicyHolder();
      policyCount++;
   }
   /**
    * Constructor that accepts all relevant arguments to fully initialize the instance
    *
    * @param num The user's policy number
    * @param provider The user's policy provider company
    * @param incoming The incoming PolicyHolder object
    */
   public Policy(int num, String provider, PolicyHolder incoming)
   {
      policyNumber = num;
      providerName = provider;
      //Creating a "deep copy"; important for security
      holder = new PolicyHolder(incoming);
      policyCount++;
   }
   
   /*
   ------------Methods(Mutator)--------------
   */
   
   
   /**
    * Sets the current PolicyHolder object
    * 
    * @param temp The new PolicyHolder object for the class
    */
   public void setPolicyHolder(PolicyHolder incoming)
   {
      //Make a deep copy so that the incoming object will not be affected
      this.holder = new PolicyHolder(incoming);
   }
   
   /**
    * Sets the policy number
    * 
    * @param num The user's policy number 
    */
   public void setPolicyNumber(int num)
   {
      this.policyNumber = num;
   }
   
   /**
    * Sets the policy provider's name
    *
    * @param provider The user's policy provider company
    */
   public void setProviderName(String provider)
   {
      this.providerName = provider;
   }
   
   /*
   ----------Methods(Accessors)---------------
   */
   
   /**
    * Returns the current PolicyHolder object
    * 
    * @return The current PolicyHolder object
    */
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(holder);
   }
   
   /**
    * Gets the policy number
    * 
    * @return An int of the current policy number
    */
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
    * Gets the policy provider's name
    * 
    * @return A string of the current provider's name
    */
   public String getProviderName()
   {
      return providerName;
   }
   
    /*
    ----------Methods(Other)---------------
    */
   
   /**
    * Calculates and returns the price of the policy
    *
    * @return A double containing the price of the policy based on the current holder's weight and height
    */

   public double calculatePolicyPrice()
   {
      //Declaring the variables
      final double BASE_PRICE = 600,
                   AGE_FEE = 75,
                   SMOKING_FEE = 100,
                   OVER_BMI_FEE = 20;
      final int AGE_LIMIT = 50,
                BMI_LIMIT = 35;
      double price = BASE_PRICE;
      
      //If statement structure to determine fees added to base price
      if (holder.getHolderAge() > AGE_LIMIT)
         price += AGE_FEE;
      if (holder.getHolderSmokingStatus().equals("smoker"))
         price += SMOKING_FEE;
      if (holder.calculateBMI() > BMI_LIMIT)
         price += ((holder.calculateBMI() - BMI_LIMIT) * OVER_BMI_FEE);
      
      return price;
   }
   
   /**
    * Returns a string containing information about the fields
    * 
    * @return A string of the current status of the fields
    */
   public String toString()
   {
      return String.format("Policy Number: " + policyNumber +
                   "\nProvider Name: " + providerName +
                   "\n" + holder + 
                   "\nPolicy Price: $%.2f", calculatePolicyPrice());
   }
   /**
    * Returns the current count of the static variable policyCount
    * 
    * @return An integer containing the number of policy objects created
    */
   public static int getCounter()
   {
      return policyCount;
   }
   
}