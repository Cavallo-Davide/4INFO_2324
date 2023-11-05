import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ListaSpesa listaSpesa = new ListaSpesa();

        ProdottoAlimentare p1 = new ProdottoAlimentare("123456", "Latte", 1.5, "2023-11-10");
        ProdottoAlimentare p2 = new ProdottoAlimentare("789012", "Pane", 1.0, "2023-11-05");
        ProdottoNonAlimentare p3 = new ProdottoNonAlimentare("345678", "Vaso di vetro", 10.0, "vetro");

        listaSpesa.aggiungiProdotto(p1);
        listaSpesa.aggiungiProdotto(p2);
        listaSpesa.aggiungiProdotto(p3);

        System.out.println("Hai la tessera sconto? (true/false)");
        boolean haTessera = scanner.nextBoolean();
        listaSpesa.setHaTessera(haTessera);

        listaSpesa.calcolaTotale();
    }
}
