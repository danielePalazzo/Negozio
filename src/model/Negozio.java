package model;

import java.util.ArrayList;

public class Negozio {

    public static void main(String[] args) {
        Negozio2 negozio = new Negozio2();
        System.out.println(negozio.contaProdotti());

        Libro l1 = new Libro(2.5, 12.50, "IBN123", "Libro 1", "Fantasy", 300);
        Libro l2 = new Libro(3, 10, "IBN234", "Libro 2", "Horror", 356);
        Libro l3 = new Libro(2.3, 20, "IBN345", "Libro 3", "Fantasy", 200);

        Dvd d1 = new Dvd(0.5, 9.99, "Album 1", "Classica", 20);
        Dvd d2 = new Dvd(0.7, 8, "Album 2", "Pop", 54);
        Dvd d3 = new Dvd(0.6, 9.99, "Album 3", "Rock", 55);

        Racchetta r1 = new Racchetta(1, 102.50, "Nike", "A goccia");
        Racchetta r2 = new Racchetta(1.3, 99, "Adidas", "Rotonda");
        Racchetta r3 = new Racchetta(1.2, 201.00, "Adidas", "A goccia");

        negozio.add(l1);
        negozio.add(l2);
        negozio.add(l3);

        negozio.add(d1);
        negozio.add(d2);
        negozio.add(d2);

        negozio.add(r1);
        negozio.add(r2);
        negozio.add(r3);

        Prodotto prodottoCostoso = negozio.getProdottoCostoso();
        ArrayList<Racchetta> racchetteGoccia = negozio.cercaRacchette();

        System.out.println("Numero prodotti presenti: " + negozio.contaProdotti());
        System.out.println("Peso totale prodotti: " + negozio.pesaProdotti());
        System.out.println("Prodotto più costoso: " + prodottoCostoso);
        System.out.println("Numero libri fantasy: " + negozio.cercaNumeroLibriFantasy());
        System.out.println("Racchette a goccia: " + racchetteGoccia.size());
    }
}