package fruitFactory;
public class FruitFactory {    
    /**
     * @param ��ͬˮ����������
     * @return ˮ����
     */
    public static Fruit getFruit(String type) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        /*����ͨ������ķ�ʽ��ȡ��ˮ��������ֽ��룬�������ͨ��������newInstance()��������ˮ������
        ʵ��*/
        Class fruit = Class.forName(FruitFactory.class.getPackage().getName()+"."+type);
        return (Fruit) fruit.newInstance();
    }
}