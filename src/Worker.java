import java.util.Date;
import java.util.Objects;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Worker extends Human {
    protected final LocalDate dateOfRecruitment;
    protected int salary;
    public boolean presence;

    public Worker(String fullName,
                  LocalDate dateOfBirth,
                  String phoneNumber,
                  LocalDate dateOfRecruitment,
                  int salary,
                  boolean presence) {
        super(fullName, dateOfBirth, phoneNumber);
        this.dateOfRecruitment = dateOfRecruitment;
        this.salary = salary;
        this.presence = presence;
    }

    public void comeToWork() {
        this.presence = true;
        System.out.println("Сотрудник пришел на работу");
    }

    public void goToDinner() {
        System.out.println("Сотрудник пошел обедать");
    }

    public void toWork() {
        System.out.println("Сотрудник работает");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;
        if (!super.equals(o)) return false;
        Worker worker = (Worker) o;
        return salary == worker.salary &&
                presence == worker.presence &&
                dateOfRecruitment.equals(worker.dateOfRecruitment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dateOfRecruitment, salary, presence);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "dateOfRecruitment=" + dateOfRecruitment +
                ", salary=" + salary +
                ", presence=" + presence +
                '}';
    }
}
