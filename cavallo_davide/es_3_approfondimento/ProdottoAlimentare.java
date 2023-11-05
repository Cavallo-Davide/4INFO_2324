public class ProdottoAlimentare extends Prodotto {
    private String dataScadenza;

    public ProdottoAlimentare(String codiceBarre, String descrizione, double prezzoUnitario, String dataScadenza) {
        super(codiceBarre, descrizione, prezzoUnitario);
        this.dataScadenza = dataScadenza;
    }

    public String getDataScadenza() {
        return dataScadenza;
    }
}
