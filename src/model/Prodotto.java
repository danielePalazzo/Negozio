package model;

public abstract class Prodotto {
    private double peso;
    private double costo;

    public Prodotto() {}

    public Prodotto(double prodotto, double costo){
        this.peso = peso;
        this.costo = costo;
    }

    public double getPeso(){
        return this.peso;
    }

    public double getCosto(){
        return this.costo;
    }

    public abstract String getAttribute();
}
