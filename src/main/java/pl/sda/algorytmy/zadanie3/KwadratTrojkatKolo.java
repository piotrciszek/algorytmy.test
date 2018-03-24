package pl.sda.algorytmy.zadanie3;
/*
metoda bok kwadratu z jego pola
zwraca pierwiastek z pola kwadratu

metoda bok trojkata z jego pola
zwraca pierwiastek z ((4 x pole trojkata x pierwiastek z 3)/ 3)

metoda promien kola z jego pola
zwraca pierwsiatek z (pola kola / PI)
 */

import java.util.Scanner;

public class KwadratTrojkatKolo {


    public double bokKwadratu(double pole) {
        return Math.sqrt(pole);
    }
    public double bokTrojkata(double pole) {
        return Math.sqrt((4*pole*Math.sqrt(3))/3);
    }
    public double promienKola(double pole) {
        return Math.sqrt(pole/Math.PI);
    }
}
