import java.util.Scanner;

public class Ecker_Quartal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int bornmonth;

        System.out.print("Geben sie Ihren Vornamen ein              :");
        name = scanner.next();

        System.out.println("Geben sie Ihr Geburtsmonat als Zahl ein :");
        bornmonth = scanner.nextInt();

        if (bornmonth <= 3){
            System.out.println(name + ", du hast im 1. Quartel Geburtstag - Happy Birthday");
        }

        if (bornmonth >= 4 && bornmonth <= 6){
            System.out.println(name + ", du hast im 2. Quartel Geburtstag - Happy Birthday");
        }

        if (bornmonth >= 7 && bornmonth < 9){
            System.out.println(name + ", du hast im 3. Quartel Geburtstag - Happy Birthday");
        }

        if (bornmonth <= 12){
            System.out.println(name + ", du hast im 4. Quartel Geburtstag - Happy Birthday");
        }
    }
}
