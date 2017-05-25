package singleton;
/**
 *  单例模式
 *  实例有且仅有一个
 *  饿汉模式：在自己被加载时就将自己实例化
 *  类一加载就实例化的对象，会提前占用系统资源，不过能够保证线程安全
 */ 
public class Singleton {
	//1.构造方法私有化
	private Singleton(){
	}
	
	//2.创建类的唯一实例
	private static Singleton instance = new Singleton();
	
	//3.获取实例的方法
	public static Singleton getInstance(){
		return instance;
	}

}
