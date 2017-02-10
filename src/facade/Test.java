package facade;
/**
 * 测试类:外观模式
 * @author user
 *
 */
public class Test {
	
	public static void main(String[] args) {
		Facade facade = new Facade();
		
		facade.methodA();
		facade.methodB();
		facade.methodC();
	}

}
