package template_method;
/**
 * ConcreteClassA实现类
 * @author user
 *
 */
public class ConcreteClassA extends AbstractClass{

	@Override
	public void primitiveOperation1() {
		
		System.out.println("具体类A方法1实现");
		
	}

	@Override
	public void primitiveOperation2() {
		
		System.out.println("具体类A方法2实现");
		
	}

}
