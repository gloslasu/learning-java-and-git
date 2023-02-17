package kursjavaodpodstaw;

public class TypyProste {
    // liczny stałoprzecinkowe
    byte b = 127; // zajmuje w pamieci 1 bajt -128 do 127
    short s = 32689; // zajmuje w pamieci 2 bajty -32768 do 32767
    int i = 32768999; // 4 bajty -2 147 483 648 do 2 147 483 647
    long l = 2148000L; // 8 bajtów -2^63 do (2^63)-1

    // liczby zmiennoprzecinkowe
    float f = 4.99934F; // 4 bajty- max około 6-7 liczb po przecinku. Jawnie definiujemy że to jest F
    double d = 3.99999999999D;// 8 bajtów - max ok. 15 cyfr po przecinku

    // wartośc logiczna
    boolean prawda = true;
    boolean fałsz = false;

    // pojedynczy znak
    Character a = 'A';


}
