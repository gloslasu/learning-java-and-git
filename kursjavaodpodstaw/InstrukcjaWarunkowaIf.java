package kursjavaodpodstaw;

import java.util.Scanner;

public class InstrukcjaWarunkowaIf {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj swój wiek\n");
        int age = scanner.nextInt();

        if(age < 18 && age >= 0 ){
            System.out.println("Nie masz 18 lat, nie możesz kupic alkocholu");
        } else if(age < 0){
            System.out.println("Wiek nie może być mniejszy od zera");
        } else { // w els ifie ten ostatni else odpowiada wartości defaultowej
            System.out.println("Na zdrowie");
        }


    }

}
