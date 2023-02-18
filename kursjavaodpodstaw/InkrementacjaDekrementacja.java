package kursjavaodpodstaw;

public class InkrementacjaDekrementacja {



    public static void main(String[] args) {

        int a = 0;
        System.out.println("wartość a = " + a); // 0

        int b = a++; // postinkrementacja
        System.out.println("wartość b = " + b); // 0 ponieważ jest to postinkrementacja czyli najpierw zwracamy obecną wartość a potem dopiero zwiększamy o 1
        System.out.println("wartość a = " + a); // 1 bo int b = a++;

        int c = ++a;
        System.out.println("wartość c = " + c); //  2
        System.out.println("wartość a = " + a); // 2

    }

}
