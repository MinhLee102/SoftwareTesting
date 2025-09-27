package org.example;

public class TicketPrice {
    private double discount = 0.25;
    private double increase = 0.15;

    public double calculatePrice(int age, String dateType) {
        // Exception
        if ( age < 5 || age >= 100) {
            throw new IllegalArgumentException("Không bán vé");
        // 5 - 12
        } else if (age <= 12) {

            if (dateType.equals("ngay_thuong")) {
                return getDEFAULT_PRICE() * (1 - discount);
            } else {
                double tmp = (getDEFAULT_PRICE() * (1 - discount)) * (1 + increase);
                return Math.round(tmp);
            }
        //13 - 59
        } else if (age <= 59) {
            if (dateType.equals("ngay_thuong")) {
                return getDEFAULT_PRICE();
            } else {
                return getDEFAULT_PRICE() * (1 + increase);
            }

        //60 - 99
        } else {

            if (dateType.equals("ngay_thuong")) {
                return getDEFAULT_PRICE() * (1 - discount);
            } else {
                double tmp = (getDEFAULT_PRICE() * (1 - discount)) * (1 + increase);
                return Math.round(tmp);
            }
        }
    }

    public int getDEFAULT_PRICE() {
        return 60000;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double a) {
        this.discount = a;
    }

    public double getIncrease() {
        return increase;
    }

    public void setIncrease(double increase) {
        this.increase = increase;
    }
}
