package fruits;

import fruits.subfruits.Apple;
import fruits.subfruits.Grape;
import fruits.subfruits.Mango;

public class Main {
    public static void main(String[] args) {


        FruitsBasket b = new FruitsBasket();
        b.add(new Apple("사과","빨강", 1000));
        b.add(new Mango("망고","노랑",2000));
        b.add(new Grape("포도","보라",1500));

        b.printAllNames();
        System.out.println(b.getTotalPrice());
    }
}