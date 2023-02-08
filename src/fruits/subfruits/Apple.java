package fruits.subfruits;

import fruits.Fruit;

public class Apple extends Fruit {

    public Apple(String name, String color, int price) {
        super(name, color, price);
    }

    public void myNameIs() {
        System.out.println("사과입니다");
    }
}
