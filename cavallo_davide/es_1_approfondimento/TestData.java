public class TestData {
    public static void main(String[] args) {
        Data data1 = new Data(2023, 11, 5);
        Data data2 = new Data(2023, 11, 6);

        data1.prossimoGiorno();
        data2.prossimoMese();

        boolean sonoUguali = data1.confrontaData(data2);

        int giorniDaInizioAnno1 = data1.giorniDaInizioAnno();
        int giorniAllaFineDellAnno2 = data2.giorniAllaFineDellAnno();

        System.out.println("Data 1: " + data1);
        System.out.println("Data 2: " + data2);
        System.out.println("Le date sono uguali: " + sonoUguali);
        System.out.println("Giorni da inizio anno per Data 1: " + giorniDaInizioAnno1);
        System.out.println("Giorni alla fine dell'anno per Data 2: " + giorniAllaFineDellAnno2);
    }
}
