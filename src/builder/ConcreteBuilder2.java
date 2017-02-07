package builder;
/**
 * ConcreteBuilder2:具体建造者类
 * @author user
 *
 */
public class ConcreteBuilder2 extends Builder{

	Product product = new Product(); 
	@Override
	public void BuildPartA() {
		
		product.add("部件X");
		
	}

	@Override
	public void BuildPartB() {
		
		product.add("部件Y");
		
	}

	@Override
	public Product GetResult() {
		
		return product;
		
	}

}
