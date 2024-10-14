import java.util.List;

public class MostExpensiveItem {
    public static String mostExpensive(List<Object[]> inventory) {
        String itemName = "";
        int maxCost = 0;
        for (Object[] item : inventory) {
            String name = (String) item[0];
            int price = (int) item[1];
            int quantity = (int) item[2];
            int totalCost = price * quantity;
            if (totalCost > maxCost) {
                maxCost = totalCost;
                itemName = name;
            }
        }
        return "Наиб. общ. стоимость у предмета " + itemName + " - " + maxCost;
    }

    public static void main(String[] args) {
        List<Object[]> inventory = List.of(
            new Object[]{"Скакалка", 550, 8},
            new Object[]{"Шлем", 3750, 4},
            new Object[]{"Мяч", 2900, 10}
        );
        System.out.println(mostExpensive(inventory)); // Наиб. общ. стоимость у предмета Мяч - 29000
    }
}