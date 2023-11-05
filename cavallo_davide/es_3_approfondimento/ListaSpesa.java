import java.util.ArrayList;

public class ListaSpesa {
    private ArrayList<Prodotto> prodotti = new ArrayList<>();
    private boolean haTessera;

    public void aggiungiProdotto(Prodotto prodotto) {
        prodotti.add(prodotto);
    }

    public void setHaTessera(boolean haTessera) {
        this.haTessera = haTessera;
    }

    public void calcolaTotale() {
        double totale = 0;

        for (Prodotto prodotto : prodotti) {
            double prezzo = prodotto.getPrezzoUnitario();

            if (prodotto instanceof ProdottoAlimentare) {
                ProdottoAlimentare pa = (ProdottoAlimentare) prodotto;
                if (haTessera && pa.getDataScadenza().compareTo("10 giorni") <= 0) {
                    prezzo *= 0.8;
                }
            } else if (prodotto instanceof ProdottoNonAlimentare) {
                ProdottoNonAlimentare pna = (ProdottoNonAlimentare) prodotto;
                if (haTessera && (pna.getMateriale().equals("carta") || pna.getMateriale().equals("vetro") || pna.getMateriale().equals("plastica"))) {
                    prezzo *= 0.9;
                }
            }

            totale += prezzo;
        }

        System.out.println("Totale: " + totale + " euro");
    }
}
