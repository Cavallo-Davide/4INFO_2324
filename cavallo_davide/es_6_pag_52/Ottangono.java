class Ottagono extends Poligono {
    public Ottagono(double lunghezzaLati) {
        super(8, lunghezzaLati);
    }

    @Override
    public double calcolaArea() {
        return 2 * lunghezzaLati * lunghezzaLati * Math.tan(Math.PI / 8);
    }

    @Override
    public double calcolaPerimetro() {
        return numLati * lunghezzaLati;
    }
}
