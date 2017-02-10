package builder;
/**
 * 测试类:建造者模式
 * @author user
 *
 */
public class Test {
	
	public static void main(String[] args) {
		
		Builder b1 = new ConcreteBuilder1();
		
		Builder b2 = new ConcreteBuilder2();
		
		Director director = new Director();
		
		director.construct(b1);
		Product p1 = b1.getResult();
		p1.show();
		
		director.construct(b2);
		Product p2 = b2.getResult();
		p2.show();
	}

}
