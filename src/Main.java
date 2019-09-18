import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) {
        Manager manDima=new Manager("Vasylchenko Dmytro",
                //30/04/1993,
                "0671259426",
         //       03/09/2019,
                8888,
                true,
                "1");
        Klient klSomeBody=new Klient("SomeBody"/*new Date(01/01/2000)*/,"01234567891",111,100);
        SecurityGuard guard=new SecurityGuard("Vasyok","1234567891",6666,false);
        Kashier kashier= new Kashier("КассирВаня",/*04/04/1992,*/"1234567890",/*new Date(04/04/2010)*/7777,false,1);
        Shop shopCheeseLovers = new Shop("CheeseLovers","Pravdy 33",manDima,guard,kashier,klSomeBody);
        shopCheeseLovers.toOpen();
        shopCheeseLovers.toSaleGoods();
        shopCheeseLovers.toSaleGoods();
        shopCheeseLovers.toSaleGoods();
        shopCheeseLovers.closeForDinner();


        // write your code here
    }
}
