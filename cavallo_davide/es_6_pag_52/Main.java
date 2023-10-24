public class Main {
    public static void main(String[] args) {
        Ottagono ottagono = new Ottagono(5.0);
        Quadrato quadrato = new Quadrato(4.0);
        Rettangolo rettangolo = new Rettangolo(6.0, 4.0);

        System.out.println("Area e Perimetro dell'Ottagono:");
        System.out.println("Area: " + ottagono.calcolaArea());
        System.out.println("Perimetro: " + ottagono.calcolaPerimetro());

        System.out.println("Area e Perimetro del Quadrato:");
        System.out.println("Area: " + quadrato.calcolaArea());
        System.out.println("Perimetro: " + quadrato.calcolaPerimetro());

        System.out.println("Area e Perimetro del Rettangolo:");
        System.out.println("Area: " + rettangolo.calcolaArea());
        System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());
    }
}
