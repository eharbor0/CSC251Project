import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        List<Policy> policies = readPoliciesFromFile("CSC251Project/PolicyInformation.txt");

        if (policies.isEmpty()) {
            System.out.println("No policies found in the file.");
        } else {
            for (Policy policy : policies) {
                System.out.println("Policy Number: " + policy.getPolicyNumber());
                System.out.println("Provider Name: " + policy.getPolicyProvider());
                System.out.println("Policyholder's First Name: " + policy.getFirstName());
                System.out.println("Policyholder's Last Name: " + policy.getLastName());
                System.out.println("Policyholder's Age: " + policy.getAge());
                System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
                System.out.println("Policyholder's Height: " + policy.getHeight());
                System.out.println("Policyholder's Weight: " + policy.getWeight());
                DecimalFormat df = new DecimalFormat("#.##");
                System.out.println("Policyholder's BMI: " + df.format(policy.calculateBMI()));
                System.out.println("Policy Price: $" + df.format(policy.getPolicyPrice()));
                System.out.println();
            }

            int smokerCount = 0;
            int nonSmokerCount = 0;
            for (Policy policy : policies) {
                if (policy.getSmokingStatus().equalsIgnoreCase("smoker")) {
                    smokerCount++;
                } else {
                    nonSmokerCount++;
                }
            }
            System.out.println("The number of policies with a smoker is: " + smokerCount);
            System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
        }
    }

    private static List<Policy> readPoliciesFromFile(String filePath) {
        List<Policy> policies = new ArrayList<>();
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String policyNumber = scanner.nextLine();
                String providerName = scanner.nextLine();
                String firstName = scanner.nextLine();
                String lastName = scanner.nextLine();
                int age = Integer.parseInt(scanner.nextLine());
                String smokingStatus = scanner.nextLine();
                double height = Double.parseDouble(scanner.nextLine());
                double weight = Double.parseDouble(scanner.nextLine());
                Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
                policies.add(policy);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        return policies;
    }
}