public class Policy
{
   /*
   ----------Fields---------------
   */
   
   //Declaring the class' attributes
   private int policyNumber;
   private String providerName;
   private static int policyCount = 0;
   
   
   /*
   ----------Constructors---------------
   */
   
   //No-arg constructor to initialize all the attributes
   public Policy()
   {
      policyNumber = 0;
      providerName = "";
      policyCount++;
   }
   /**
    * Constructor that accepts all relevant arguments to fully initialize the instance
    *
    * @param num The user's policy number
    * @param provider The user's policy provider company
    */
   public Policy(int num, String provider)
   {
      policyNumber = num;
      providerName = provider;
      policyCount++;
   }
   
   /*
   ------------Methods(Mutator)--------------
   */
   
   /**
    * Sets the policy number
    * 
    * @param num The user's policy number 
    */
   public void setPolicyNumber(int num)
   {
      policyNumber = num;
   }
   
   /**
    * Sets the policy provider's name
    *
    * @param provider The user's policy provider company
    */
   public void setProviderName(String provider)
   {
      providerName = provider;
   }
   
   /*
   ----------Methods(Accessors)---------------
   */
   
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
    * Returns a string containing information about the fields
    * 
    * @return A string of the current status of the fields
    */
   public String toString()
   {
      String str = "Policy Number: " + policyNumber +
                   "Provider Name: " + providerName;
      
      return str;
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