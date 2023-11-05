public class Prodotto {
    private String codiceBarre;
    private String descrizione;
    private double prezzoUnitario;

    public Prodotto(String codiceBarre, String descrizione, double prezzoUnitario) {
        this.codiceBarre = codiceBarre;
        this.descrizione = descrizione;
        this.prezzoUnitario = prezzoUnitario;
    }

    public String getCodiceBarre() {
        return codiceBarre;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzoUnitario() {
        return prezzoUnitario;
    }
}
