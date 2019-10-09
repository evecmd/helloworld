package fruitFactory;
public class FruitFactory {    
    /**
     * @param 不同水果的类名称
     * @return 水果类
     */
    public static Fruit getFruit(String type) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        /*这里通过反射的方式获取到水果子类的字节码，即类对象，通过类对象的newInstance()方法创建水果子类
        实例*/
        Class fruit = Class.forName(FruitFactory.class.getPackage().getName()+"."+type);
        return (Fruit) fruit.newInstance();
    }
}