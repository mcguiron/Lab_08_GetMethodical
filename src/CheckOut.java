import java.util.Scanner;


public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double itemPrice = 0;
        double totalPrice = 0;
        boolean done = false;


        do {

            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item [0.50-10]", 0.5, 10);
            System.out.println("The price of your item is " + itemPrice);
            totalPrice = itemPrice + totalPrice;
            done = SafeInput.getYNConfirm(in, "Do you have more items? [Y/N]");



        } while (done);
        System.out.println("The total price of your items is: " + totalPrice);
    }
}
