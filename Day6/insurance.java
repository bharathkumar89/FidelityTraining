package day6;

import java.util.Scanner;
class Insurance {
    private String insuranceNo;
    private String insuranceName;
    private double amountCovered;
    public Insurance(String insuranceNo, String insuranceName, double amountCovered) {
        this.insuranceNo = insuranceNo;
        this.insuranceName = insuranceName;
        this.amountCovered = amountCovered;
    }
    public String getInsuranceNo() {
        return insuranceNo;
    }
    public String getInsuranceName() {
        return insuranceName;
    }
    public double getAmountCovered() {
        return amountCovered;
    }
}

class MotorInsurance extends Insurance{
    private double idv;
    private float depPercent;
    public MotorInsurance(String insuranceNo, String insuranceName, double amountCovered, float depPercent) {
        super(insuranceNo, insuranceName, amountCovered);
        this.depPercent = depPercent;
        calculateIdv();
    }
    private void calculateIdv() {
        idv = getAmountCovered() - ((getAmountCovered() * depPercent) / 100);
    }
    public double calculatePremium() {
        return idv * 0.03;
    }
    public double getIdv() {
        return idv;
    }
    public float getDepPercent() {
        return depPercent;
    }
}

class LifeInsurance extends Insurance{
    private int policyTerm;
    private float benefitPercent;
    public LifeInsurance(String insuranceNo, String insuranceName, double amountCovered, int policyTerm, float benefitPercent) {
        super(insuranceNo, insuranceName, amountCovered);
        this.policyTerm = policyTerm;
        this.benefitPercent = benefitPercent;
    }
    public double calculatePremium() {
        return (getAmountCovered() - ((getAmountCovered() * benefitPercent) / 100)) / policyTerm;
    }
    public int getPolicyTerm() {
        return policyTerm;
    }
    public float getBenefitPercent() {
        return benefitPercent;
    }
}

public class InsuranceCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Insurance Number:");
        String insuranceNo = scanner.nextLine();
        System.out.println("Enter Insurance Name:");
        String insuranceName = scanner.nextLine();
        System.out.println("Enter Amount Covered:");
        double amountCovered = scanner.nextDouble();
        System.out.println("Select Option:");
        System.out.println("1. Life Insurance");
        System.out.println("2. Motor Insurance");
        int opt = scanner.nextInt();
        if (opt == 1) {
            System.out.println("Enter Policy Term:");
            int policyTerm = scanner.nextInt();
            System.out.println("Enter Benefit Percent:");
            float benefitPercent = scanner.nextFloat();
            LifeInsurance ins = new LifeInsurance(insuranceNo, insuranceName, amountCovered, policyTerm, benefitPercent);
            double premium = ins.calculatePremium();
            System.out.println("Calculated Premium: " + premium);
        } else if (opt == 2) {
            System.out.println("Enter Depreciation Percent:");
            float depPercent = scanner.nextFloat();
            MotorInsurance ins = new MotorInsurance(insuranceNo, insuranceName, amountCovered, depPercent);
            double premium = ins.calculatePremium();
            System.out.println("Calculated Premium: " + premium);
        }
    }
}