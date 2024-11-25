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
      holder = incoming;
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
      holder = incoming;
   }
   
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
    * Returns a string containing information about the fields
    * 
    * @return A string of the current status of the fields
    */
   public String toString()
   {
      String str = "Policy Number: " + policyNumber +
                   "\nProvider Name: " + providerName;
      
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