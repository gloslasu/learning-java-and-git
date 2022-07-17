public class Zwierze {

    String imie;
    String glos = "grrrrrr";

// poprzez przesłany argument chcę tyle razy dać głos ile uzytkownik sobie zache.
    public void dajGlos(int x){
        for(int i=0; i<x; i++){
            System.out.print(glos); // print żeby było w jednej linii
            System.out.print(" ");
        }
        System.out.println(); // po zakończeniu powyższej pętli przechodzimy do nowej linii
    }



}
