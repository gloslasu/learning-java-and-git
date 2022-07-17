import java.util.Scanner;

public class CustomScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        String name = scanner.nextLine(); // ta metoda zwróci nam stronga więc tworzymy sobie zmienną tupu string
        System.out.println("cześć " +name + "!") ;


        //PODAJEMY LICZBĘ
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        int result = firstNumber * firstNumber;
        System.out.println("Kwadrat tej liczby to " + result); // zamiast result możemy wpisać firstNumber * firstNumber



    }

}
