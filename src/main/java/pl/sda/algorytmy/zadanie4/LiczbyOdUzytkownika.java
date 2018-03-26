/*
Wyświetl liczby od n do m (pobrane od użytkownika), oddzielone przecinkami, zakończone kropką.
        1. Przedstaw opis słowny problemu
        2. Przedstaw schemat blokowy
        3. Zaimplementuj algorytm.
        Rozwinięcie:
        1. Sprawdź która z liczb jest większa i odpowiednio je ustaw.
        2. Pobierz od użytkownika znaki, jakimi mają być oddzielone/zakończone liczby.
        3. Pobierz od użytkownika początkową i końcową literę, a następnie wyświetl litery pomiędzy oddzielone przecinkami. Na końcu nie może być przecinka.
        4. Pobierz od użytkownika początkową i końcową literę, a następnie wyświetl dowolne wyrazy zawierające się na wszystkie litery pomiędzy wybranymi. Wyrazy oddzielone przecinkami, bez przecinka na końcu.
*/
/*
Scanner
int tablica 2-elementowa
scanner 1 liczba do tablicy
scanner 2 liczba do tablicy
scanner znak oddzielajacy
Pobieranie od uzytkownika dwoch liczb
porownanie liczb i ustawianie w kolejnosci od najmniejszej do najwiekszej
wstawienie przecinkow
*/

package pl.sda.algorytmy.zadanie4;

import java.util.Scanner;

public class LiczbyOdUzytkownika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbę");
        int[] tablica = new int[2];
        tablica[0] = scanner.nextInt();
        System.out.println("Podaj druga liczbę");

        tablica[1] = scanner.nextInt();
        System.out.println("Podaj znak jakimi mają być oddzielane liczby");
        String znak = scanner.next();
        int m = tablica[0];

        for (int liczba: tablica) {
            if (liczba > m) {
                m = liczba;
            }
        }
        int n = tablica[0];
        for (int liczba : tablica) {
            if (liczba < n) {
                n = liczba;

            }
        }
            for (int i = n; i <= m; i++) {
                System.out.print(i);
                if (i < m) {
                    System.out.print(znak);
                } else {
                    System.out.println(".");
                }
            }
        }
    }

