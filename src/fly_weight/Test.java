package fly_weight;
/**
 * 测试类:享元模式
 * @author user
 *
 */
public class Test {
	
	public static void main(String[] args) {
		
		FlyweightFactory factory = new FlyweightFactory();
		
		Flyweight fly = factory.factory(1);
		fly.operation("first");
		
		fly = factory.factory(2);
		fly.operation("second");
		
		fly = factory.factory(3);
		fly.operation("third");
		
	}

}
