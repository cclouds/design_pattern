package builder;
/**
 * Director类：指挥者类
 * @author user
 *
 */
public class Director {
	public void construct(Builder builder){
		
		builder.buildPartA();
		builder.buildPartB();
		
	}

}
