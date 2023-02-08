package fruits.subfruits;

import fruits.Fruit;

public class Mango extends Fruit {
    public Mango(String name, String color, int price) {
        super(name, color, price);
    }

    public void myNameIs() {
        System.out.println("망고입니다");
    }
}
