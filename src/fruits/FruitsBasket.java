package fruits;

import java.util.ArrayList;

public class FruitsBasket {
    ArrayList<Fruit> basket = new ArrayList<Fruit>();

    public void add(Fruit f) {
        basket.add(f);
    }

    public void printAllNames() {
        for(int i=0; i < basket.size(); i++) {
            basket.get(i).myNameIs();
        }
    }

    public int getTotalPrice() {
        int sum = 0;
        for(int i=0; i < basket.size(); i++) {
            sum += basket.get(i).getPrice();
        }
        return sum;
    }

}
