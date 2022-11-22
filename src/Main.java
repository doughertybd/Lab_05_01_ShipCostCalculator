public class Main {
    public static void main(String[] args) {
        double itemPrice = 150;
        double shipping = .02;
        double FREE_SHIPPING = 100;
        double shippingCost;
        double totalCost;
        if(itemPrice < FREE_SHIPPING){
            shippingCost = itemPrice * shipping;
            totalCost = itemPrice + shippingCost;
            System.out.println("Since the price of the item is $" + itemPrice + ", the cost plus shipping is: $" + totalCost);
        }
        else{
            System.out.println("You get free shipping! your total cost is: $" + itemPrice);
        }
    }
}