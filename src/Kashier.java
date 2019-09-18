import java.util.Date;
import java.util.Objects;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Kashier extends Worker {
    public int numberCas;

    public Kashier(String fullName,
                   LocalDate dateOfBirth,
                   String phoneNumber,
                   LocalDate dateOfRecruitment,
                   int salary,
                   boolean presence,
                   int numberCas) {
        super(fullName, dateOfBirth, phoneNumber, dateOfRecruitment, salary, presence);
        this.numberCas = numberCas;
    }

    public void toCountMoney() {
        System.out.println("Кассир считает деньги");
    }

    @Override
    public void toWork() {
        System.out.println("Кассир работает");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kashier)) return false;
        if (!super.equals(o)) return false;
        Kashier kashier = (Kashier) o;
        return numberCas == kashier.numberCas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberCas);
    }

    @Override
    public String toString() {
        return "Kashier{" +
                "numberCas=" + numberCas +
                ", dateOfRecruitment=" + dateOfRecruitment +
                ", salary=" + salary +
                ", presence=" + presence +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

}
