package iterator;

public class ConcreteAggregate extends Aggregate{

	private Object[] objectArray = null;
	
	
	/*
	 * 构造方法
	 */
	public ConcreteAggregate(Object[] objectArray) {
		super();
		this.objectArray = objectArray;
	}



	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	/*
	 * 根据下标获取对象
	 */
	public Object getElement(int index){
		
		if(index < objectArray.length){
			return objectArray[index];
		}else{
			return null;
		}
	}
	
	/*
	 * 获取长度
	 */
	public int size(){
		return objectArray.length;
	}
}
