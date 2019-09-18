import java.util.Date;
import java.util.Objects;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Manager extends Worker {
    String department;

    public Manager(String fullName,
                 //  Date dateOfBirth,
                   String phoneNumber,
                 //  Date dateOfRecruitment,
                   int salary,
                   boolean presence,
                   String department) {
        super(fullName,/* dateOfBirth*/ phoneNumber/*dateOfRecruitment*/, salary, presence);
        this.department = department;
    }

    public void toConsult(){
        System.out.println("Менеджер консультирует");
    }
    public void talkAboutDiscounts(){
        System.out.println("Менеджер рассказывает про скидки");
    }
    void giveAdvice(){
        System.out.println("Менеджер советует");
    }
    @Override
    public void toWork(){
        System.out.println("Менеджер работает");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return department.equals(manager.department);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                '}';
    }

}
