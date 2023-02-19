package kursjavaodpodstaw;

public class Tablice {

    public static void main(String[] args) {

// 1 sposób deklarowania elementów tablicy
    String[] imiona = new String[3]; // [3] ilość elementów w tablicy.
        imiona[0] = "Sławek";
        imiona[1] = "Bartek";
        imiona[2] = "Łukasz";
        System.out.println(imiona[1]);

// 2 sposób deklarowania elementów tablicy
        int[] lotto = new int[] {1,2,3,4,5,6};
        System.out.println(lotto[0]);

//wypisujemy długośćtablicy
        System.out.println(lotto.length);

// korzystając z pętli for wypisujemy wartości tablicy

    for (int i =0; i <imiona.length; i++){
        System.out.println(imiona[i]);
    }


    }
}
