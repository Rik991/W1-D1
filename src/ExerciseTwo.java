import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci stringa 1");
        String stringa1 = scanner.nextLine();
        System.out.println("Inserisci stringa 2");
        String stringa2 = scanner.nextLine();
        System.out.println("Inserisci stringa 3");
        String stringa3 = scanner.nextLine();

        System.out.println(stringa1 + stringa2 + stringa3);
        System.out.println(stringa3 + stringa2 + stringa1);

    }
}
