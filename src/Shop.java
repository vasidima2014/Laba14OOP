import java.util.Objects;


public class Shop {
    private String name;
    private String address;
    private Manager manager;
    private SecurityGuard guard;
    private Kashier kashier;
    private Klient klient;

    public Shop(String name,
                String address,
                Manager manager,
                SecurityGuard guard,
                Kashier kashier,
                Klient klient) {
        this.name = name;
        this.address = address;
        this.manager = manager;
        this.guard = guard;
        this.kashier = kashier;
        this.klient = klient;
    }

    public void toOpen() {
        manager.comeToWork();
        guard.comeToWork();
        kashier.comeToWork();
        System.out.println("Магазин открылся");
    }

    public void toSaleGoods() {
        klient.learnAboutGoods();
        manager.toConsult();
        manager.toWork();
        manager.giveAdvice();
        manager.talkAboutDiscounts();
        klient.toBuy();
        kashier.toCountMoney();
        kashier.toWork();
        guard.toWork();
    }

    public void closeForDinner() {
        manager.goToDinner();
        guard.goToDinner();
        kashier.goToDinner();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shop)) return false;
        Shop shop = (Shop) o;
        return name.equals(shop.name) &&
                address.equals(shop.address) &&
                manager.equals(shop.manager) &&
                guard.equals(shop.guard) &&
                kashier.equals(shop.kashier) &&
                klient.equals(shop.klient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, manager, guard, kashier, klient);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", manager=" + manager +
                ", guard=" + guard +
                ", kashier=" + kashier +
                ", klient=" + klient +
                '}';
    }
}




