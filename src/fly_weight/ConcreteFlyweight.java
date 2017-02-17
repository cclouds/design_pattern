package fly_weight;
/**
 * 具体享元角色类ConcreteFlyweight
 * @author user
 *
 */
public class ConcreteFlyweight implements Flyweight {

	private Integer intrinsicState = null;

	public ConcreteFlyweight(Integer state) {
		super();
		this.intrinsicState = state;
	}

	/*
	 * 外蕴状态作为参数传入方法中，改变方法的行为， 但是并不改变对象的内蕴状态。
	 * 
	 * @see fly_weight.Flyweight#operation(java.lang.String)
	 */
	@Override
	public void operation(String state) {
		
		System.out.println("intrinsicState="+intrinsicState);
		
		System.out.println("state="+state);

	}

}
