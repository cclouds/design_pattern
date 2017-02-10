package iterator;
/**
 * ConcreteIterator具体迭代器类实现Iterator接口
 * @author user
 *
 */
public class ConcreteIterator implements Iterator{
    //具体的聚集对象
	private ConcreteAggregate agg;
	//迭代的索引位置
	private int index = 0;
	//聚集对象的大小
	private int size = 0;
	
	
	public ConcreteIterator(ConcreteAggregate agg) {
		super();
		this.agg = agg;
		this.size = agg.size();
	}

	@Override
	public void first() {
		index = 0;
	}

	@Override
	public void next() {
		if(index<size){
			index++;
		}
	}

	@Override
	public boolean idDone() {
		return index >= size-1?true:false;
	}

	@Override
	public Object currentItem() {
		return agg.getElement(index);
	}

}
