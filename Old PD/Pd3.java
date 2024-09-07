// 1. check if the number is even odd
// 2. check if the number is positive or negative
// 3. check if the age is eligible for voting or not
// 4. man purchases 4 products p1 =100, p2=200, p3=300, p4=400 for any purchase 2000 and above give 20% discount if not give 10% dicount
// 5. find the price of Iceream Based on Flavour Code
//       fc   flavour price
//       1    vanilla 100
//       2     kiwi   125
//       3    Dragon  140
//       int fc = 2;
//       int price = 0;
//       boolean topping = true;
//       boolean dryFruits = false;
//       Note:
//       topping = 15;
//       dryFruits = 25;
//       18% extra gst

public class Pd3 {

    public static void main(String[] args) {
        // 1. check if the number is even odd

        int num = 2;
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " num is Odd");
        }

        // 2. check if the number is positive or negative

        int num1 = 2;
        if (num1 < 0) {
            System.out.println(num1 + " is Negative");
        } else {
            System.out.println(num1 + " is Positive");
        }

        // 3. check if the age is eligible for voting or not

        int age = 22;
        if (age >= 18) {
            System.out.println("Eligibe fo Driving");
        } else {
            System.out.println("not Eligible for driving");
        }

        // 4. man purchases 4 products p1 =100, p2=200, p3=300, p4=400 for any purchase
        // 2000 and above give 20% discount if not give 10% dicount

        int p1 = 100;
        int p2 = 200;
        int p3 = 500;
        int p4 = 1100;
        double totalPrice = p1 + p2 + p3 + p4;
        if (totalPrice >= 2000) {
            totalPrice = totalPrice - totalPrice * 0.20;
            System.out.println("You have to Pay " + totalPrice);
        } else {
            totalPrice = totalPrice - totalPrice * 0.10;
            System.out.println("You have to Pay " + totalPrice);
        }

        // 5. find the price of Iceream Based on Flavour Code
        // fc flavour price
        // 1 vanilla 100
        // 2 kiwi 125
        // 3 Dragon 140
        // int fc = 2;
        // int price = 0;
        // boolean topping = true;
        // boolean dryFruits = false;
        // Note:
        // topping = 15;
        // dryFruits = 25;
        // 18% extra gst
        int fc = 2;
        int priceVanilla = 100;
        int priceKiwi = 125;
        int priceDryfruits = 140;
        boolean topping = true;
        boolean dryFruits = false;
        double priceToBepaid = 0;

        if (fc == 1) {
            priceToBepaid = 100;
            if (topping == true) {
                priceToBepaid += 15;
            } else if (dryFruits == true) {
                priceToBepaid += 25;
            }
        } else if (fc == 2) {
            priceToBepaid = 125;
            if (topping == true) {
                priceToBepaid += 15;
            } else if (dryFruits == true) {
                priceToBepaid += 25;
            }
        } else if (fc == 3) {
            priceToBepaid = 140;
            if (topping == true) {
                priceToBepaid += 15;
            } else if (dryFruits == true) {
                priceToBepaid += 25;
            }
        }
        priceToBepaid += priceToBepaid * 0.18;
        System.out.println("Price to be paid " + priceToBepaid);

    }
}