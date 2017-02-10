package iterator;
/**
 * 测试类：迭代器模式
 * @author user
 *
 */
public class Test {
	
	public static void main(String[] args) {
		Object[] array = {1,2,3,4,5,6,7,8,9,10};
		//创建聚合对象
		ConcreteAggregate agg = new ConcreteAggregate(array);
		//循环输出聚合对象中的值
		Iterator it = agg.createIterator();
		while(!it.idDone()){
			System.out.println(it.currentItem());
			it.next();
		}
	}

}
