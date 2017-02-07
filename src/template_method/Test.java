package template_method;
/**
 * 测试类
 * @author user
 *
 */
public class Test {
	public static void main(String[] args) {
		AbstractClass ac;
		ac = new ConcreteClassA();
		ac.TemplateMethod();
		
		ac = new ConcreteClassB();
		ac.TemplateMethod();
	}

}
