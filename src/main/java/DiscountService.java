package main.java;

import java.util.Date;
public class DiscountService {
    
    public float calculateDiscount(float amount, int noOfOrders) {
        float discount = 0;
        System.out.println("Calculating discount for amount: " + amount);

        //Calculate Discount based on amount
        if(amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be zero or negative");    
        } else if( amount > 0 && amount < 1000) {
            discount =  amount * 0.2f;
        } else if(amount >= 1000 && amount < 5000) {
            discount = amount * 0.3f;
        } else if(amount >= 5000 && amount < 10000) {
            discount = amount * 0.4f;
        } else {
            discount = amount * 0.5f;
        }
        float amountAfterDiscount = amount - discount;

        //Calculate Discount based on number of orders 
        if(noOfOrders > 10 && noOfOrders <= 20) {
            discount = discount + 100;
            amountAfterDiscount = amountAfterDiscount + 100;
        } else if(noOfOrders > 20 && noOfOrders <= 30) {
            discount = discount + 200;
            amountAfterDiscount = amountAfterDiscount + 200;
        } else if(noOfOrders > 30) {
            discount = discount + 300;
            amountAfterDiscount = amountAfterDiscount + 300;
        } else {
            System.out.println("No Special discount applied");
        }

        Date discountAppliedDate = new Date();
        System.out.println("Date: " + discountAppliedDate);
        System.out.println("Amount after discount: " + amountAfterDiscount);
        System.out.println("Discount: " + discount);
        return discount;
    }
}
