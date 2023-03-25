import java.util.Scanner;
public class Quersumme {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein: ");

        int num = scan.nextInt();

        scan.close();

        System.out.println("Quersumme = " + quersumme(num));

    }

    public static int quersumme(int zahl) {

        if (zahl <= 9) return zahl;

        return zahl%10 + quersumme(zahl/10);


    }

}