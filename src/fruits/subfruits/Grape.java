package fruits.subfruits;

import fruits.Fruit;

public class Grape extends Fruit {
    public Grape(String name, String color, int price) {
        super(name, color, price);
    }

    public void myNameIs() {
        System.out.println("포도입니다");
    }
}
