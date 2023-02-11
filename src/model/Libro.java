package model;

public class Libro extends Prodotto{
    private String isbn;
    private String titolo;
    private String categoria;
    private int pagine;

    public Libro(){}

    public Libro(double peso, double costo, String isbn, String titolo, String categoria, int pagine){
        super(peso, costo);
        this.isbn = isbn;
        this.titolo = titolo;
        this.categoria = categoria;
        this.pagine = pagine;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public String getTitolo(){
        return this.titolo;
    }

    @Override
    public String getAttribute(){
        return this.categoria;
    }

    public double getPagine(){
        return this.pagine;
    }
}
