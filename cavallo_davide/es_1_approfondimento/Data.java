import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Data {
    private LocalDate data;

    public Data(int anno, int mese, int giorno) {
        this.data = LocalDate.of(anno, mese, giorno);
    }

    public void prossimoGiorno() {
        this.data = this.data.plusDays(1);
    }

    public void prossimoMese() {
        this.data = this.data.plusMonths(1);
    }

    public boolean confrontaData(Data altraData) {
        return this.data.equals(altraData.data);
    }

    public int giorniDaInizioAnno() {
        LocalDate inizioAnno = LocalDate.of(this.data.getYear(), 1, 1);
        return (int) ChronoUnit.DAYS.between(inizioAnno, this.data) + 1;
    }

    public int giorniAllaFineDellAnno() {
        LocalDate fineAnno = LocalDate.of(this.data.getYear(), 12, 31);
        return (int) ChronoUnit.DAYS.between(this.data, fineAnno) + 1;
    }
}
