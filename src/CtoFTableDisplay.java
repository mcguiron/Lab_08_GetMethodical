import java.sql.SQLOutput;
import java.util.Scanner;



public class CtoFTableDisplay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double celsius;
        double faren;

        celsius = SafeInput.getDouble(in, "Please enter a temp in celsius");
        faren = CtoF(celsius);



        System.out.println("Celsius \t\t Farenheit");
        System.out.println("__________________________");

        System.out.printf("%6.2f \t\t %6.2f\n", celsius, faren);
        ;

    }

    public static double CtoF(double Celsius) {
        return (Celsius * 9 / 5) + 32;


    }
}


