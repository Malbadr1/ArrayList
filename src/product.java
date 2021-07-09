import java.util.ArrayList;
import java.util.Collections;

public class product {
    String name;

    int price;

    public product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {




        ArrayList<product> list= new ArrayList<>();

        list.add(new product("s",100));
        list.add(new product("a",10));
        list.add(new product("l",12));
        list.add(new product("e",14));
        System.out.println(list);

        System.out.println(list.contains("s"));

        System.out.println(list.remove(0));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }

        double total_price=0.0;

        for (int i = 0; i < list.size(); i++) {


           total_price= total_price+list.get(i).getPrice();
        }
        System.out.println(total_price);


       Collections.reverse(list);
    }
    }

