package model;

public class Dvd extends Prodotto{
    private String titolo;
    private String categoria;
    private double durata;

    public Dvd(){}

    public Dvd(double peso, double costo, String titolo, String categoria, double durata){
        super(peso, costo);
        this.titolo = titolo;
        this.categoria = categoria;
        this.durata = durata;
    }

    @Override
    public String getAttribute() {
        return null;
    }

    public String getTitolo() {
        return this.titolo;
    }

    public double getDurata() {
        return this.durata;
    }
}
