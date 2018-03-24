/*Algorytm ma obliczać długość boku kwadratu o polu P.
        1. Przedstaw opis słowny problemu
        2. Przedstaw schemat blokowy
        3. Zaimplementuj algorytm.

        Rozwinięcie:
        2. Napisz funkcję, która obliczy bok trójkąta równobocznego na podstawie pola.
        3. Napisz funkcję, która obliczy promień koła.
        4. W `main` użyj każdej funkcji.
        5. W `main` pobierz od użytkownika jaką funkcję ma wywołać oraz pole. Następnie wywołaj odpowiednią funkcję i wyświetl odpowiednią informację (bok lub promień)*/
/*
Musze wyliczyc z pol kwadratu/trojkata rownobocznego wyliczyc ich boki oraz z pola kola wyliczyc jego promien
Uzytkownik ma zadecydowac co chce policzyc i wprowadzic dane

opis do metod znajduje sie w KwadratTrojkatKolo.java
Scanner
stworzenie obiektu kwadratTrojkatKolo w celu pozniejszego wywolywania funkcji
Zapytaj sie uzytkownika co chce policzyc
bokKwadratu, bokTrojkata, promienKola?
jesli uzytkownik chce wyjsc to exit
String pobrana komenda
sprawdz za pomoca if jaka funkcja wybrana
zapytaj sie uzytkownika o double pole
zastosuj odpowiednia metode
wyswietl wynik

new Scanner
new KwadratTrojkat
boolean sprawdzanie komendy
do
pobierz komende
if kwadrat
pobierz wartosc
wyswietl wynik
if trojkat
pobierz wartosc
wyswietl wynik
if kolo
pobierz wartosc
wyswietl wynik
if exit
koniec -> sprawdzanie komendy=false
while sprawdzaie komendy

 */


package pl.sda.algorytmy.zadanie3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KwadratTrojkatKolo kwadratTrojkatKolo = new KwadratTrojkatKolo();
        boolean sprwadzanieKomendy = true;
        System.out.println("Co chciałbyś policzyć");
        do {
        System.out.println("Jeśli bok kwadratu, napisz 'kwadrat'");
        System.out.println("Jesli bok trójkąta równobocznego, nabisz 'trójkąt'");
        System.out.println("Jeśli promień koła, napisz 'koło'");
        System.out.println("Wyjście - napisz 'exit'");
        String komenda = scanner.next();
        double wprowadzanaWartosc = 0;
        if (komenda.toLowerCase().contains("kw")) {
            System.out.println("Podaj pole kwadratu");
            wprowadzanaWartosc = scanner.nextDouble();
            System.out.println("Bok kwadratu o polu " + wprowadzanaWartosc + " ma długość " + kwadratTrojkatKolo.bokKwadratu(wprowadzanaWartosc));
        }
        else if(komenda.toLowerCase().contains("tr")) {
            System.out.println("Podaj pole trójkąta");
            wprowadzanaWartosc = scanner.nextDouble();
            System.out.println("Bok trójkąta równobocznego o polu " + wprowadzanaWartosc + " ma długość " + kwadratTrojkatKolo.bokTrojkata(wprowadzanaWartosc));
        }
        else if(komenda.toLowerCase().contains("ko")) {
            System.out.println("Podaj pole koła");
            wprowadzanaWartosc = scanner.nextDouble();
            System.out.println("Promień koła o polu " + wprowadzanaWartosc + " ma długość " + kwadratTrojkatKolo.bokTrojkata(wprowadzanaWartosc));
        }
        else if (komenda.toLowerCase().contains("exit")) {
            System.out.println("Koniec");
            sprwadzanieKomendy = false;
        }
        else {
            System.out.println("Zła komenda, wpisz jeszcze raz");
        }
        }while (sprwadzanieKomendy);
    }
}

