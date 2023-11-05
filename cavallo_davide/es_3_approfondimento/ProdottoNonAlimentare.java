public class ProdottoNonAlimentare extends Prodotto {
    private String materiale;

    public ProdottoNonAlimentare(String codiceBarre, String descrizione, double prezzoUnitario, String materiale) {
        super(codiceBarre, descrizione, prezzoUnitario);
        this.materiale = materiale;
    }

    public String getMateriale() {
        return materiale;
    }
}
