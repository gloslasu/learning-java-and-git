// operatory matematyczne umożliwiają wykonanie podstawowych operacji matematycznych.


public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;


        int addition = firstNumber + secondNumber; //10
        int substraction = firstNumber - secondNumber; // -2
        int multiplication = firstNumber * secondNumber; // 24
        float division = thirdNumber/secondNumber; // 0,66 dostajemy w wyniku floata więc nie możemy dać inta prez którego bedziemy dzielic.

        int mod = secondNumber%firstNumber; // ile czwórek mieści się w szóstce (1)

        System.out.println("wynik dodawania: " + addition);
        System.out.println("wynik odejmowania: " + substraction);
        System.out.println("wynik mnożenia: " + multiplication);
        System.out.println("wynik dzielenia: " + division);

        System.out.println("wynik modulo: " + mod);

        System.out.println("");
        System.out.println("");


        // inny sposób zapisu liczb:
        firstNumber+=secondNumber; // to jest skrót od firstNumber = firstNumber + secondNumber
        System.out.println("Po dodaniu: " + firstNumber); //10

        firstNumber-=secondNumber; // firstNumber = firstNumber - secondNumber
        System.out.println("Po odejmowaniu: " + firstNumber); //14

        firstNumber*=secondNumber; // firstNumber = firstNumber * secondNumber
        System.out.println("Po mnożeniu: " + firstNumber); //24

        firstNumber/=secondNumber; // firstNumber = firstNumber / secondNumber
        System.out.println("Po dzieleniu: " + firstNumber); //4

        firstNumber%=secondNumber; // firstNumber = firstNumber % secondNumber
        System.out.println("Po modulo: " + firstNumber); //4




    }


}
