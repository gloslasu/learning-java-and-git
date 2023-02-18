package kursjavaodpodstaw;

import java.util.Scanner;

// pobieranie danych od użytkownika
public class CustomScanner {

    public static void main(String[] args) {

        // pobieramy imię od użytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj imię \n");
        String name = scanner.nextLine(); // metoda pobiera wartość tekstową wpisaną przez użytkownika. Metoda zwraca stringa
        System.out.println("Cześć " + name);

        // pobieramy liczbę od użytkownika

        System.out.println("podaj liczbę \n");
        int liczba = scanner.nextInt(); // metoda pobiera wartość tekstową wpisaną przez użytkownika. Metoda zwraca stringa
        System.out.println("Cześć " + liczba);


    }


}
