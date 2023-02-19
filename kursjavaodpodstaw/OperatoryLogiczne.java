package kursjavaodpodstaw;

public class OperatoryLogiczne {

    public static void main(String[] args) {

        boolean true1 = true;

        boolean false1 = false;
        boolean false2 = false;

        boolean true2 = true;

        boolean true3 = 2 > 1;
        boolean false3 = 1 > 2;
        

       // && > true gdy dwa wyrażenia są równe
        System.out.println(true1 && true2); // true
        System.out.println(false1 && false2); // true

        // lub || - gdy przynajmniej jedno wyrażenie jest równe true
        System.out.println(true1 || false1); // true

        // negacja ! zwraca wartość przeciwną do wyrażenia przed którym się znajduje
        System.out.println(!true1); // false
        System.out.println(!(true1 && false1)); //true



    }


}
