package kursjavaodpodstaw;

public class InstrukcjaSwitch {
// alternatywa dla else ifa
    public static void main(String[] args) {

    String danie = "Pizza";

    switch (danie) {
        case "Pizza":
            System.out.println("Cena pizzy to 85 zł");
            break;
        case "Kebab":
            System.out.println("Cena kebsa to 25 zł");
            break;
        default:
            System.out.println("nie ma takiego dania");
    }


    }

}
