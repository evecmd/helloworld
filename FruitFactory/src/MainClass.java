//import fruit.*;
import fruitFactory.*;
public class MainClass {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //通过调用工厂类的静态方法getFruit，创建水果的子类实例。
        Fruit apple = FruitFactory.getFruit("Apple");
        Fruit banana = FruitFactory.getFruit("Banana");
        apple.get();
        banana.get();
    }
}