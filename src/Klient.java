import java.util.Date;
import java.util.Objects;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Klient extends Human {
    protected int discount;
    protected int money;

    public Klient(String fullName,
                  LocalDate dateOfBirth,
                  String phoneNumber,
                  int discount,
                  int money) {
        super(fullName, dateOfBirth, phoneNumber);
        this.discount = discount;
        this.money = money;
    }

    public void learnAboutGoods() {
        System.out.println("Клиент узнает про товар");
    }

    public void toBuy() {
        System.out.println("Клиент покупает");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Klient)) return false;
        if (!super.equals(o)) return false;
        Klient klient = (Klient) o;
        return discount == klient.discount &&
                money == klient.money;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount, money);
    }

    @Override
    public String toString() {
        return "Klient{" +
                "discount=" + discount +
                ", money=" + money +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
