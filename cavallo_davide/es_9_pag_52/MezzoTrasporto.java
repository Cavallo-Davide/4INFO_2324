class MezzoTrasporto {
    private String marca;
    private String modello;
    private int annoProduzione;

    public MezzoTrasporto(String marca, String modello, int annoProduzione) {
        this.marca = marca;
        this.modello = modello;
        this.annoProduzione = annoProduzione;
    }

    public void accelerare() {
        System.out.println("Il mezzo di trasporto accelera.");
    }

    public void frenare() {
        System.out.println("Il mezzo di trasporto frena.");
    }
}
