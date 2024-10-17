import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int favNum = 0;
        double favDoub = 0;

        favNum = SafeInput.getInt(in, "Enter your fav int");
        System.out.println("Your fav int is: " + favNum);


        favDoub = SafeInput.getDouble(in, "Now, enter your fav double");
        System.out.println("Your fav double is: " + favDoub);



    }
}
