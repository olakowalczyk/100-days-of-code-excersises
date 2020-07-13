package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    static double chargePerMinute = 0.25;
    static double taxRate = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        double baseCost = getBaseCost();
        int overageMinutes = getOverageMinutes();
        scanner.close();
        double overageCost = calculateOverageMinutesFee(overageMinutes, chargePerMinute);
        double tax = calculateTax(baseCost, overageCost, taxRate);
        double total = calculateTotalCost(baseCost, overageCost, tax);
        generateBill(baseCost, overageCost, tax, total);
    }
    public static double getBaseCost(){
        System.out.println("Enter base cost of the plan: ");
        double baseCost = scanner.nextDouble();
        return baseCost;
    }
    public static int getOverageMinutes(){
        System.out.println("Enter overage minutes: ");
        int overageMinutes = scanner.nextInt();
        return overageMinutes;
    }
    public static double calculateOverageMinutesFee(int overageMinutes, double chargePerMinute){
        double overage = overageMinutes * chargePerMinute;
        return overage;
    }
    public static double calculateTax(double baseCost, double overageCost, double taxRate){
        double tax = (baseCost + overageCost) * taxRate;
        return tax;
    }
    public static double calculateTotalCost(double baseCost, double overageCost, double tax){
        double total = baseCost + overageCost + tax;
        return total;
    }
    public static void generateBill(double baseCost, double overageCost, double tax, double total) {
        System.out.println("Phone Bill Statement\nPlan: $" + baseCost + "\nOverage: $" + overageCost + "\nTax $: " + String.format("%.2f", tax) + "\nTotal $: " + String.format("%.2f", total));
    }
}
