package kursjavaodpodstaw;

public class PetlaFor {
    public static void main(String[] args) {

int max = 100;

for (int i = 0; i<=max; i+=2){
    System.out.println(i);
}

for (int i =0; i<=100; i++){
    if (i%5==0){ // liczby podzielne przez 5. Reszta z dzielenia i przez 5 to 0
        System.out.println(i);
    }
}

    }

}
