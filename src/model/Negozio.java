package model;

import java.util.ArrayList;

public class Negozio {

    public static void main(String[] args) {

        ArrayList<Prodotto> prodotti = new ArrayList<>();
        System.out.println(prodotti.size());

        Libro l1 = new Libro(2.5, 12.50, "IBN123", "Libro 1", "Fantasy", 300);
        Libro l2 = new Libro(3, 10, "IBN234", "Libro 2", "Horror", 356);
        Libro l3 = new Libro(2.3, 20, "IBN345", "Libro 3", "Fantasy", 200);

        Dvd d1 = new Dvd(0.5, 9.99, "Album 1", "Classica", 20);
        Dvd d2 = new Dvd(0.7, 8, "Album 2", "Pop", 54);
        Dvd d3 = new Dvd(0.6, 9.99, "Album 3", "Rock", 55);

        Racchetta r1 = new Racchetta(1, 102, "Nike", "A goccia");
        Racchetta r2 = new Racchetta(1.3, 99, "Adidas", "Rotonda");
        Racchetta r3 = new Racchetta(1.2, 101, "Adidas", "A goccia");

        aggiungiProdotto(prodotti, l1);
        System.out.println("Aggiunto " + l1.getTitolo());
        aggiungiProdotto(prodotti, l2);
        System.out.println("Aggiunto " + l2.getTitolo());
        aggiungiProdotto(prodotti, l3);
        System.out.println("Aggiunto " + l3.getTitolo());
        System.out.println("Numero prodotti presenti: " + prodotti.size());

        int numeroLibriFantasy = cercaNumeroLibriFantasy(prodotti);
        System.out.println("Libri fantasy: " + numeroLibriFantasy);

        aggiungiProdotto(prodotti, r1);
        aggiungiProdotto(prodotti, r2);
        aggiungiProdotto(prodotti, r2);
        System.out.println("Numero prodotti aggiornato: " + prodotti.size());

        ArrayList<Prodotto> numeroRacchette = cercaRacchette("A goccia");
        System.out.println("Numero racchette a goccia: " + numeroRacchette.size());
    }

    public static int contaProdotti(ArrayList<Prodotto> prodotti){
        return prodotti.size();
    }

    public static double pesaProdotti(ArrayList<Prodotto> prodotti){
        int peso = 0;
        for (Prodotto p : prodotti){
            peso += p.getPeso();
        }
        return peso;
    }

    public static double getProdottoCostoso(ArrayList<Prodotto> prodotti){
        int costo = 0;
        for (Prodotto p : prodotti){
            if (p.getCosto() > costo){
                costo += p.getCosto();
            }
        }
        return costo;
    }

    public static void aggiungiProdotto(ArrayList<Prodotto> p, Prodotto p1){
        p.add(p1);
    }

    public static int cercaNumeroLibriFantasy(ArrayList<Prodotto> prodotto){
        int count = 0;
        for (Prodotto p : prodotto){
            if (p.getAttribute().equalsIgnoreCase("fantasy")){
                count++;
            }
        }
        return count;
    }

    public static ArrayList<Prodotto> cercaRacchette(String tipo){  // NON FUNZIONA
        ArrayList<Prodotto> pr = new ArrayList<>();
        for (Prodotto p : pr){
            if(p.getAttribute().equalsIgnoreCase(tipo)){
                pr.add(p);
            }
        }
        return pr;
    }
}