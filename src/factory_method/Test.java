package factory_method;
/**
 * 测试类:工厂方法模式
 * @author user
 *
 */
public class Test {
	public static void main(String[] args) {
		Factory factory = new AddFactory();
		Operation opera = factory.createOperation();
		opera.setNumber1(1);
		opera.setNumber2(2);
		System.out.println(opera.getResult());
	}

}
