class Poligono extends Geometria {
    private int numLati;
    private double lunghezzaLati;

    public Poligono(int numLati, double lunghezzaLati) {
        this.numLati = numLati;
        this.lunghezzaLati = lunghezzaLati;
    }

    @Override
    public double calcolaArea() {
        return 0.0;
    }

    @Override
    public double calcolaPerimetro() {
        return 0.0;
    }
}
