//import fruit.*;
import fruitFactory.*;
public class MainClass {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //ͨ�����ù�����ľ�̬����getFruit������ˮ��������ʵ����
        Fruit apple = FruitFactory.getFruit("Apple");
        Fruit banana = FruitFactory.getFruit("Banana");
        apple.get();
        banana.get();
    }
}