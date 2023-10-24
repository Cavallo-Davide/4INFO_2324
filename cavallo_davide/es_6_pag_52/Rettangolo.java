class Rettangolo extends Poligono {
    private double lunghezzaBase;

    public Rettangolo(double lunghezzaBase, double altezza) {
        super(4, 0.0);
        this.lunghezzaBase = lunghezzaBase;
        this.lunghezzaLati = altezza;
    }

    @Override
    public double calcolaArea() {
        return lunghezzaBase * lunghezzaLati;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * (lunghezzaBase + lunghezzaLati);
    }
}
