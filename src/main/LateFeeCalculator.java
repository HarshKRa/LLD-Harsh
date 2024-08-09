package main;

public class LateFeeCalculator {

    /*
    *  Logic to calculate the late fees
    */

    public  double  calculateTotalLateFees(LateFeeCalculatable[] items, int days){ // this method takes interface instead of class

        /*
        * This is Dependency Inversion Principle
        * */
        double totalLateFee = 0;

        for(LateFeeCalculatable item : items){
            totalLateFee += item.calculateLateFee(days);
        }
        return  totalLateFee;
    }
}
