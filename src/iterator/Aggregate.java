package iterator;
/**
 * Aggregate聚集抽象类
 * @author user
 *
 */
public abstract class Aggregate {
	/*
     * 工厂方法，创建迭代器
     */
	public abstract Iterator createIterator();

}
