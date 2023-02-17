
public class InkrementacjaDekrementacja {

    public static void main(String[] args) {


        int a = 0;
        System.out.println("Wartość a: " +a); //0

        int b = a++; // jeżeli ++ jest po zmiennej to jest to postinkrementacja
        System.out.println("Wartość b: " +b); // najpierw następuje przypisanie wartości a potem
        System.out.println("Wartość a: " +b);


        int c = ++a; // preinkrementacja. Dopiero jak zwiększymy wartość to przypiszemy
        System.out.println("Wartość c: " +c); //1
        System.out.println("Wartość a: " +a); //2


        // DEKREMENTACJA czyli zmniejszanie wartości o jeden

        int d = 0;
        System.out.println("Wartość d: " +d); //0

        int e = d--; //
        System.out.println("Wartość b: " +e); // najpierw następuje przypisanie wartości a potem
        System.out.println("Wartość a: " +d);


        int f = --d; // predekrementacja. Najpierw zmniejszamy wartość i przypisujemy wartość do zmiennej f
        System.out.println("Wartość c: " +f); //1
        System.out.println("Wartość a: " +d); //2

    }
}
