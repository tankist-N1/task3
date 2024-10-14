import java.util.ArrayList;
import java.util.List;

public class Sale {
    public static List<Object[]> sale(List<Object[]> products, int discount) {
        List<Object[]> result = new ArrayList<>();
        for (Object[] product : products) {
            String name = (String) product[0];
            int price = (int) product[1];
            int newPrice = (int) Math.round(price * (1 - discount / 100.0));
            newPrice = Math.max(newPrice, 1);
            result.add(new Object[]{name, newPrice});
        }
        return result;
    }

    public static void main(String[] args) {
        List<Object[]> products = new ArrayList<>();
        products.add(new Object[]{"Laptop", 124200});
        products.add(new Object[]{"Phone", 51450});
        products.add(new Object[]{"Headphones", 13800});

        List<Object[]> result = sale(products, 25);
        for (Object[] item : result) {
            System.out.println(item[0] + ": " + item[1]);
        }
    }
}