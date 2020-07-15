package chapter6;

public class PhoneBill {

    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int usedMinutes;

    public PhoneBill(){
        id = 0;
        baseCost = 49.99;
        allottedMinutes = 1000;
        usedMinutes = 1000;
    }

    public PhoneBill(int id){
        this.id = id;
        baseCost = 49.99;
        allottedMinutes = 1000;
        usedMinutes = 1000;
    }

    public PhoneBill(int id, double baseCost, int allottedMinutes, int usedMinutes){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.usedMinutes = usedMinutes;
    }

    public int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(){
        this.baseCost = baseCost;
    }

    public double getAllottedMinutes(){
        return allottedMinutes;
    }

    public void setAllottedMinutes(){
        this.allottedMinutes = allottedMinutes;
    }

    public double getUsedMinutes(){
        return usedMinutes;
    }

    public void setUsedMinutes(int usedMinutes) {
        this.usedMinutes = usedMinutes;
    }

    double calculateOverage(){
        double chargePerMinute = 0.25;
        if(usedMinutes <=allottedMinutes){
            return 0;
        }
        else{
        double overageCost = (usedMinutes - allottedMinutes) * chargePerMinute;
        return overageCost;
        }
    }

    double calculateTax(){
        double taxRate = 0.15;
        return (baseCost + calculateOverage()) * taxRate;
    }

    double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printBill(){
        System.out.println("Phone Bill Statement\nID: " + id +"\nPlan: $" + baseCost + "\nOverage: $" + calculateOverage() + "\nTax: $" + String.format("%.2f", calculateTax()) + "\nTotal: $" + String.format("%.2f", calculateTotal()));

    }
}
