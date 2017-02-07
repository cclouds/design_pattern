package builder;
/**
 * ConcreteBuilder1:具体建造者类
 * @author user
 *
 */
public class ConcreteBuilder1 extends Builder {

	Product product = new Product();
	@Override
	public void BuildPartA() {
		
		product.add("部件A");
		
	}

	@Override
	public void BuildPartB() {
		
		product.add("部件B");
		
	}

	@Override
	public Product GetResult() {
		
		return product;
		
	}

}
