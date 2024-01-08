import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner myScanner = new Scanner(System.in);
        // System.out.println("please enter your birth year, month, and day : ");

        System.out.println("please enter your Birth year:  ");
        int birthYear = myScanner.nextInt();

        System.out.println("please enter your Month:  ");
        int month = myScanner.nextInt();

        System.out.println("please enter your Day:  ");
        int day = myScanner.nextInt();

        Calendar currentDate = Calendar.getInstance();
        Calendar userBirthDay = Calendar.getInstance();

        userBirthDay.set(birthYear, month, day);

        int age = currentDate.get(Calendar.YEAR) - userBirthDay.get(Calendar.YEAR);

        System.out.println("This is your age " + age);
        myScanner.close();

    }
}
