package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题(Subject)角色：
 * 抽象主题角色把所有对观察者对象的引用保存在一个聚集（比如ArrayList对象）里，
 * 每个主题都可以有任何数量的观察者。抽象主题提供一个接口，
 * 可以增加和删除观察者对象，抽象主题角色又叫做抽象被观察者(Observable)角色。
 * @author user
 *
 */
public abstract class Subject {
	private List<Observer> list = new ArrayList<Observer>();
	
	/*
	 * 增加观察者对象
	 */
	public void attach(Observer observer){
		
		list.add(observer);
		System.out.println("attached an observer");
	}
	
	/*
	 * 删除观察者对象
	 */
	public void detch(Observer observer){
		
		list.remove(observer);
		System.out.println("detched an observer");
	}
	
	/*
	 * 通知所有的观察者对象
	 */
	public void notifyObservers(String newState){
		for(Observer o : list){
			o.update(newState);
		}
		
	}

}
