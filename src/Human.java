import java.util.Date;
import java.util.Objects;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Human {
    protected String fullName;
    protected Date dateOfBirth;
    protected String phoneNumber;

    public Human(String fullName,
                // Date dateOfBirth,
                 String phoneNumber) {
        this.fullName = fullName;
      //  this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void sayHello(){
        System.out.println("Hello");
    }
    public void sayGoodBye(){
        System.out.println("GoodBye");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return phoneNumber == human.phoneNumber &&
                fullName.equals(human.fullName) &&
                dateOfBirth.equals(human.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, dateOfBirth, phoneNumber);
    }

    @Override
    public String toString() {
        return "Human{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
