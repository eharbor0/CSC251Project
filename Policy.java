public class Policy {
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    /**
     * Constructor to initialize Policy object.
     * @param policyNumber Policy number.
     * @param providerName Provider name.
     * @param firstName Policyholder's first name.
     * @param lastName Policyholder's last name.
     * @param age Policyholder's age.
     * @param smokingStatus Policyholder's smoking status ("smoker" or "non-smoker").
     * @param height Policyholder's height in inches.
     * @param weight Policyholder's weight in pounds.
     */
    public Policy(String policyNumber, String providerName, String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Calculates the BMI (Body Mass Index) of the policyholder.
     * @return BMI value.
     */
    public double calculateBMI() {
        return (weight / (height * height)) * 703;
    }

    // Getters for various attributes

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyProvider() {
        return providerName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

<<<<<<< Updated upstream
    /**
     * Calculates the price of the policy based on certain criteria.
     * @return Policy price.
     */
    public double getPolicyPrice() {
        // Logic to calculate policy price
        return 0.0; // Placeholder, actual implementation needed
    }
}
=======
   public int getPolicyholderAge() {
       return policyholderAge;
   }

   public void setPolicyholderAge(int policyholderAge) {
       this.policyholderAge = policyholderAge;
   }

   public String getPolicyholderSmokingStatus() {
       return policyholderSmokingStatus;
   }

   public void setPolicyholderSmokingStatus(String policyholderSmokingStatus) {
       this.policyholderSmokingStatus = policyholderSmokingStatus;
   }

   public double getPolicyholderHeight() {
       return policyholderHeight;
   }

   public void setPolicyholderHeight(double policyholderHeight) {
       this.policyholderHeight = policyholderHeight;
   }

   public double getPolicyholderWeight() {
       return policyholderWeight;
   }

   public void setPolicyholderWeight(double policyholderWeight) {
       this.policyholderWeight = policyholderWeight;
   }

   public double calculateBMI() {
       return (policyholderWeight * 703) / (policyholderHeight * policyholderHeight);
   }

   public double calculatePolicyPrice() {
       double additionalFee = 0.0;

       if (policyholderAge > 50) {
           additionalFee += 75.0;
       }

       if (policyholderSmokingStatus.equals("smoker")) {
           additionalFee += 100.0;
       }

       double bmi = calculateBMI();

       if (bmi > 35) {
           additionalFee += (bmi - 35) * 20;
       }

       return additionalFee + 600.0;
   }
}
>>>>>>> Stashed changes
