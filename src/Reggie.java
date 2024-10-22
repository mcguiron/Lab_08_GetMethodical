import java.util.Scanner;


public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String social = "";
        String mNum = "";
        String menu = "";

        social = SafeInput.getRegExString(in,"Enter your social security number", "^\\d{3}-\\d{2}-\\d{4}$" );
        System.out.println("Your social security number is " + social + " thanks bud.....");

        mNum = SafeInput.getRegExString(in, "Now, enter your M number", "^(M|m)\\d{5}$");
        System.out.println("Aaaaaaand you just gave me your identity. Your M number is " + mNum);

        menu = SafeInput.getRegExString(in, "Would you like to open [O], save [S], view [V], or quit [Q]?", "^[OoSsVvQq]$");
        System.out.println("you chose " + menu);

    }
}
