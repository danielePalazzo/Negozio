package model;

import java.util.ArrayList;

public class Negozio2 {
    ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();

    public void add(Prodotto p){
        prodotti.add(p);
    }

    public int contaProdotti(){
        return prodotti.size();
    }

    public double pesaProdotti(){
        double peso = 0;
        for (Prodotto pr : prodotti) {
            peso += pr.getPeso();
        }
        return peso;
    }

    public Prodotto getProdottoCostoso(){
        double costo = 0;
        Prodotto piuCostoso = null;
        for (Prodotto pr : prodotti) {
            if (pr.getCosto() > costo) {
                costo = pr.getCosto();
                piuCostoso = pr;
            }
        }
        return piuCostoso;
    }

    public int cercaNumeroLibriFantasy(){
        int count = 0;
        for (Prodotto p : prodotti){
            if(p instanceof Libro){
                Libro b = (Libro)p;
                if (b.getAttribute().equalsIgnoreCase("fantasy")){
                    count++;
                }
            }
        }
        return count;
    }

    public ArrayList<Racchetta> cercaRacchette(){
        ArrayList<Racchetta> prAr = new ArrayList<>();
        for (Prodotto p : prodotti) {
            if (p instanceof Racchetta) {
                Racchetta r = (Racchetta) p;
                if (r.getTipo().equalsIgnoreCase("A goccia") && r.getCosto() > 100.00) {
                    prAr.add(r);
                }
            }
        }
        return prAr;
    }
}
