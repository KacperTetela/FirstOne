import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("String args");//

        System.out.println("podaj imie");

        Scanner scanner = new Scanner(System.in);
        String personName = scanner.nextLine();

        String myName = "Kacper";

            if (personName.endsWith("a")){
                System.out.println("osoba jest potencjalnie kobieta");
            }
            else{
                System.out.println("osoba jest potencjalnie mezczyzna");
            }
    }
}