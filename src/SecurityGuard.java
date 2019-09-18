import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class SecurityGuard extends Worker {

    public SecurityGuard(String fullName,
                         LocalDate dateOfBirth,
                         String phoneNumber,
                         LocalDate dateOfRecruitment,
                         int salary,
                         boolean presence) {
        super(fullName, dateOfBirth, phoneNumber, dateOfRecruitment, salary, presence);
    }

    public void toWalkieTalkie() {
        System.out.println("Охранник говорит по рации");
    }

    @Override
    public void toWork() {
        System.out.println("Охранник работает");
    }

    @Override
    public String toString() {
        return "SecurityGuard{" +
                "dateOfRecruitment=" + dateOfRecruitment +
                ", salary=" + salary +
                ", presence=" + presence +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
