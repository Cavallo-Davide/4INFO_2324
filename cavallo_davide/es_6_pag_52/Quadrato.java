class Quadrato extends Poligono {
    public Quadrato(double lato) {
        super(4, lato);
    }

    @Override
    public double calcolaArea() {
        return lunghezzaLati * lunghezzaLati;
    }

    @Override
    public double calcolaPerimetro() {
        return numLati * lunghezzaLati;
    }
}
