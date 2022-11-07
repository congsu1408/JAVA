import java.util.*;

class Item implements Comparable<Item> {
    public static int NUM_PRODUCT = 1;
    private String id, name;
    private String unit;
    private int price1, price2;

    public Item(String name, String unit, int price1, int price2) {
        this.id = "MH" + String.format("%03d", NUM_PRODUCT++);
        this.name = name;
        this.unit = unit;
        this.price1 = price1;
        this.price2 = price2;
    }

    public int Profit() {
        return price2 - price1;
    }

    @Override
    public int compareTo(Item o) {
        if (this.Profit() < o.Profit()) {
            return 1;
        } else if (this.Profit() > o.Profit()) {
            return -1;
        } else {
            if (this.id.compareTo(o.id) > 0) {
                return 1;
            } else if (this.id.compareTo(o.id) < 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public String toString() {
        return id + " " + name + " " + unit + " " + price1 + " " + price2 + " " + Profit();
    }
}

public class J05081 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.nextLine();
        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = ip.nextLine();
            String unit = ip.nextLine();
            int price1 = ip.nextInt();
            int price2 = ip.nextInt();
            ip.nextLine();
            list.add(new Item(name, unit, price1, price2));
        }
        Collections.sort(list);
        for (Item i : list) {
            System.out.println(i);
        }
    }
}
