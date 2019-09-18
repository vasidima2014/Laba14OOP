import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Manager manDima = new Manager("Vasylchenko Dmytro",
                LocalDate.of(1993, 4, 30),
                "0671259426",
                LocalDate.of(2019, 4, 22),
                //03/09/2019,
                8888,
                true,
                "1");
        Klient klSomeBody = new Klient("SomeBody",
                LocalDate.of(1990, 4, 19),
                "01234567891",
                111,
                100);
        SecurityGuard guard = new SecurityGuard("Vasyok",
                LocalDate.of(1999, 4, 1),
                "1234567891",
                LocalDate.of(2019, 5, 21),
                6666, false);
        Kashier kashier = new Kashier("КассирВаня",
                LocalDate.of(1991, 1, 21),
                "1234567890",
                LocalDate.of(2019, 8, 21),
                7777, false, 1);
        Shop shopCheeseLovers = new Shop("CheeseLovers",
                "Pravdy 33", manDima, guard, kashier, klSomeBody);
        shopCheeseLovers.toOpen();
        shopCheeseLovers.toSaleGoods();
        shopCheeseLovers.toSaleGoods();
        shopCheeseLovers.toSaleGoods();
        shopCheeseLovers.closeForDinner();


        // write your code here
    }
}
