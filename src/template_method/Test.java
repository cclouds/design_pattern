package template_method;
/**
 * 测试类:模板方法模式
 * @author user
 *
 */
public class Test {
	public static void main(String[] args) {
		AbstractClass ac;
		ac = new ConcreteClassA();
		ac.templateMethod();
		
		ac = new ConcreteClassB();
		ac.templateMethod();
	}

}
