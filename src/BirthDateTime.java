import java.util.Scanner;


public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);


        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int min = 0;
        int maxDays = 0;




        year = SafeInput.getRangedInt(in, "Enter the year you were born [1950-2015]", 1950, 2015);
        System.out.println("The year you were born is " + year);


        month = SafeInput.getRangedInt(in, "Enter the month you were born [1-12]", 1, 12 );
        System.out.println("The month you were born is " + month);

        switch (month)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            maxDays = 31;
            break;
            case 4: case 6: case 9: case 11:
                maxDays = 30;
                break;
            case 2:
                maxDays = 29;
                break;
            default:
                System.out.println("The day does not match the month, try again......");

        }

        day = SafeInput.getRangedInt(in, "Enter the day you were born", 1, maxDays);
        System.out.println("The day you were born is " + day);



    }
}
