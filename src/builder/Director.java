package builder;
/**
 * Director类：指挥者类
 * @author user
 *
 */
public class Director {
	public void Construct(Builder builder){
		
		builder.BuildPartA();
		builder.BuildPartB();
		
	}

}
