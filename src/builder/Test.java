package builder;
/**
 * 测试类
 * @author user
 *
 */
public class Test {
	
	public static void main(String[] args) {
		
		Builder b1 = new ConcreteBuilder1();
		
		Builder b2 = new ConcreteBuilder2();
		
		Director director = new Director();
		
		director.Construct(b1);
		Product p1 = b1.GetResult();
		p1.show();
		
		director.Construct(b2);
		Product p2 = b2.GetResult();
		p2.show();
	}

}
