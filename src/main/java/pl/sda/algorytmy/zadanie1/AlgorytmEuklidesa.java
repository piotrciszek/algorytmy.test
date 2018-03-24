/*
Algorytm Euklidesa
Mając dane dwie liczby naturalne a i b znaleźć ich największy wspólny dzielnik.
1. Przedstaw opis słowny problemu
2. Przedstaw schemat blokowy
3. Zaimplementuj algorytm.
Rozwinięcie:
2. Pobierz dane od użytkownika.
3. Jeżeli użytkownik wpisze ujemną liczbę wyświetl błąd.
4. Pobieraj błędne dane dopóki użytkownik nie wpisze poprawnego wyniku.
5. Zrób z tego grę:
   - Komputer losuje dwie duże liczby (10000 < n < 50000)
   - Użytkownik wpisuje NWD
   - Komputer oblicza NWD, a następnie wyświetla czy użytkownik zgadł liczbę czy nie

psvm
new Scanner
pierwszaLiczba = scanner
drugaLiczba = scanner
jeżeli pierwszaLiczba || druga liczba < 0 -> błąd
jezeli pierwsza liczba > druga liczba
pierwsza liczba = pierwsza liczba - druga liczba
jezeli nie
druga liczba = druga liczba - pierwsza liczba
wyswietl pierwsza liczbe

 */

package pl.sda.algorytmy.zadanie1;

import java.util.Scanner;

public class AlgorytmEuklidesa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pierwszaLiczba =0;
        int drugaLiczba =0;
        System.out.println("Wyliczanie największego wspólnego dzielnika");
        while (pierwszaLiczba <=0 || drugaLiczba <=0) {
            System.out.println("Podaj liczby większe od 0");
            pierwszaLiczba = scanner.nextInt();
            drugaLiczba = scanner.nextInt();
            //if (pierwszaLiczba <= 0 || drugaLiczba <=0) throw new IllegalArgumentException("Błąd");
            //jak można wyrzuić błąd a zarazem dalej pobierać dane? punkt 3,4 zdania?
        }
        while (pierwszaLiczba != drugaLiczba) {
            if (pierwszaLiczba > drugaLiczba) {
                pierwszaLiczba = pierwszaLiczba -drugaLiczba;
            } else {
                drugaLiczba = drugaLiczba - pierwszaLiczba;
            }
        }
        System.out.println("Najwyższy wspólny dzielnik to: " + pierwszaLiczba);

    }

}
