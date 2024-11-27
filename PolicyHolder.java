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
    
   public PolicyHolder(String holderFirstName, String holderLastName,
                       int holderAge, String holderSmokingStatus, 
                       double holderHeight, double holderWeight)
   {
      this.holderFirstName = holderFirstName;
      this.holderLastName = holderLastName;
      this.holderAge = holderAge;
      this.holderSmokingStatus = holderSmokingStatus;
      this.holderHeight = holderHeight;
      this.holderWeight = holderWeight;
   }
   
   /**
    * Constructor that accepts a PolicyHolder object =
    *
    * @param copy A PolicyHolder object to be copied
    */
   public PolicyHolder(PolicyHolder copy)
   {
      this.holderFirstName = copy.getHolderFirstName();
      this.holderLastName = copy.getHolderLastName();
      this.holderAge = copy.getHolderAge();
      this.holderSmokingStatus = copy.getHolderSmokingStatus();
      this.holderHeight = copy.getHolderHeight();
      this.holderWeight = copy.getHolderWeight();
   }
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
      final double FACTOR = 703;
      return ((holderWeight * FACTOR) / (holderHeight * holderHeight));
   }
   
   /**
    * Returns a string with the status of the current fields
    *
    * @return A string containing the status of the current fields
    */
   public String toString()
   {
      return String.format("Policyholder's First Name " + holderFirstName +
                   "\nPolicyholder's Last Name: " + holderLastName + 
                   "\nPolicyholder's Age: " + holderAge +
                   "\nPolicyholder's Smoking Status (Y/N): " + holderSmokingStatus +
                   "\nPolicyholder's Height: " + holderHeight + " inches" +
                   "\nPolicyholder's Weight: " + holderWeight + " pounds" +
                   "\nPolicyholder's BMI: %.2f", calculateBMI());
   }
}