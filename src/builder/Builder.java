package builder;
/**
 * Builder:抽象建造者类。确定产品由两个部件partA和partB组成，并声明一个得到产品建造后结果的方法GetResult
 * @author user
 *
 */
public abstract class Builder {
	
	public abstract void BuildPartA();
	
	public abstract void BuildPartB();
	
	public abstract Product GetResult();
	
}
