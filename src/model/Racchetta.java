package model;

public class Racchetta extends Prodotto{
    private String marca;
    private String tipo;

    public Racchetta(){}

    public Racchetta(double peso, double costo, String marca, String tipo){
        super(peso, costo);
        this.marca = marca;
        this.tipo = tipo;
    }

    @Override
    public String getAttribute() {
        return null;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getTipo(){
        return this.tipo;
    }


}

