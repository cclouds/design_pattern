package builder;
/**
 * ConcreteBuilder2:具体建造者类
 * @author user
 *
 */
public class ConcreteBuilder2 extends Builder{

	Product product = new Product(); 
	@Override
	public void buildPartA() {
		
		product.add("部件X");
		
	}

	@Override
	public void buildPartB() {
		
		product.add("部件Y");
		
	}

	@Override
	public Product getResult() {
		
		return product;
		
	}

}
