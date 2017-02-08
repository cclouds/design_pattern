package observer;
/**
 * 具体主题(ConcreteSubject)角色：将有关状态存入具体观察者对象；
 * 在具体主题的内部状态改变时，给所有登记过的观察者发出通知。
 * 具体主题角色又叫做具体被观察者(Concrete Observable)角色
 * @author user
 *
 */
public class ConcreteSubject extends Subject{
	
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void change(String newState){
		state = newState;
		System.out.println("主题者新的状态为："+state);
		//状态发生改变，通知各个观察者
		this.notifyObservers(state);		
		
	}

}
