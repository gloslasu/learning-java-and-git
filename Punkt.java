public class Punkt {
    //deklaracje konstruktorów
    Punkt (double wspolrzedneX, double wspolrzedneY){
        x = wspolrzedneX;
        y = wspolrzedneY;
    }
    //deklaracje metod
    public String Wypisz(){
        String text;
        text = "Wspolrzedne ("+ x + ", " + y + ")";
        return text;
    }
    //deklaracje pól
    double x;
    double y;

}

