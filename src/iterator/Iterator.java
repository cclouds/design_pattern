package iterator;
/**
 * 迭代器接口
 * @author user
 *
 */
public interface Iterator {
	
	/*
	 * 获取第一个元素
	 */
	public void first();
	
	/*
	 * 获取下一个对象 
	 */
	public void next();
	
	/*
	 * 是否为最后一个元素
	 */
	public boolean idDone();
	
	/*
	 * 返回当前元素
	 */
	public Object currentItem();

}
