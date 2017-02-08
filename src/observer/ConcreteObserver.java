package observer;
/**
 * 具体观察者(ConcreteObserver)角色：存储与主题的状态自恰的状态。
 * 具体观察者角色实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态 像协调。
 * 如果需要，具体观察者角色可以保持一个指向具体主题对象的引用。
 * @author user
 *
 */
public class ConcreteObserver implements Observer{
	
	private String observerState;

	@Override
	public void update(String state) {
		observerState = state;
		System.out.println("观察者新状态为："+observerState);
	}

}
