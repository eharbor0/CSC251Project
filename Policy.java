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

    /**
     * Calculates the price of the policy based on certain criteria.
     * @return Policy price.
     */
    public double getPolicyPrice() {
        // Logic to calculate policy price
        return 0.0; // Placeholder, actual implementation needed
    }
}