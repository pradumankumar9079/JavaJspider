// 1. a person name abhishek goes to rameshwaram cafe with his friend total seven member order masala dosa for everybody which cost 135 per dosa calculate the total price
// Note:- 18% gst extra

// 2. a person name suraj purchases 3 tshirt and one pant the prices are given below
// t1=499;
// t2=599;
// t3=899;

// p1=2399;
// p2=1899;

// calculate the total price Note:- give 15% discount for tshirt and 20% discount for pants

// 3. a man purchases 3 apple of 835gram in total where the apple will cost 350/kg calculate the total price 

public class Pd2 {
    public static void main(String[] args) {
        // 1. a person name abhishek goes to rameshwaram cafe with his friend total
        // seven member order masala dosa for everybody which cost 135 per dosa
        // calculate the total price
        // Note:- 18% gst extra

        int noOfPerson = 7;
        int noOfDosa = 7;
        int costOfEachDosa = 135;
        float gstPerDosa = (18 / 100.0f) * costOfEachDosa;
        float totalPricePaid = (noOfPerson * costOfEachDosa) + (gstPerDosa * noOfDosa);
        System.out.println(totalPricePaid);

        // 2. a person name suraj purchases 3 tshirt and one pant the prices are given
        // below
        // t1=499;
        // t2=599;
        // t3=899;

        // p1=2399;
        // p2=1899;

        // calculate the total price Note:- give 15% discount for tshirt and 20%
        // discount for pants
        int t1 = 499, t2 = 599, t3 = 899;
        int totalPriceOfTshirt = t1 + t2 + t3;
        float discountForTshirt = (15 / 100.0f) * totalPriceOfTshirt;

        int p1 = 2399, p2 = 1899;
        int totalPriceOfPant = p1 + p2;
        float discountForPant = (20 / 100.0f) * totalPriceOfPant;

        float totalPrice = (totalPriceOfTshirt - discountForTshirt) + (totalPriceOfPant - discountForPant);
        System.out.println(totalPrice);

        // 3. a man purchases 3 apple of 835gram in total where the apple will cost
        // 350/kg calculate the total price
        int noOfApplePurchases = 3;
        int amountOfApplePurchases = 835;
        float totalPriceOfItem = noOfApplePurchases * (amountOfApplePurchases * (350 / 1000.0f));
        System.out.println(totalPriceOfItem);
    }

}