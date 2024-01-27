import java.util.Scanner;

public class Project_Eberechi_Harbor {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Please enter the Policy Number: ");
       String policyNumber = scanner.nextLine();

       System.out.print("Please enter the Provider Name: ");
       String providerName = scanner.nextLine();

       System.out.print("Please enter the Policyholder's First Name: ");
       String policyholderFirstName = scanner.nextLine();

       System.out.print("Please enter the Policyholder's Last Name: ");
       String policyholderLastName = scanner.nextLine();

       System.out.print("Please enter the Policyholder's Age: ");
       int policyholderAge = scanner.nextInt();
       scanner.nextLine();

       System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
       String policyholderSmokingStatus = scanner.nextLine();

       System.out.print("Please enter the Policyholder's Height (in inches): ");
       double policyholderHeight = scanner.nextDouble();

       System.out.print("Please enter the Policyholder's Weight (in pounds): ");
       double policyholderWeight = scanner.nextDouble();

       Policy policy = new Policy(policyNumber, providerName, policyholderFirstName, policyholderLastName,
               policyholderAge, policyholderSmokingStatus, policyholderHeight, policyholderWeight);

       System.out.println("Policy Number: " + policy.getPolicyNumber());
       System.out.println("Provider Name: " + policy.getProviderName());
       System.out.println("Policyholder's First Name: " + policy.getPolicyholderFirstName());
       System.out.println("Policyholder's Last Name: " + policy.getPolicyholderLastName());
       System.out.println("Policyholder's Age: " + policy.getPolicyholderAge());
       System.out.println("Policyholder's Smoking Status: " + policy.getPolicyholderSmokingStatus());
       System.out.println("Policyholder's Height: " + policy.getPolicyholderHeight() + " inches");
       System.out.println("Policyholder's Weight: " + policy.getPolicyholderWeight() + " pounds");
     }
}