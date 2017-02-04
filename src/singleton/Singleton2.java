package singleton;

/**
 * 单例模式
 * 懒汉模式
 */
public class Singleton2 {
	//1.构造方法私有化
	private Singleton2(){
		
	}
	//2.创建类的唯一实例
	private static Singleton2 instance;
	
	//2.创建类的唯一实例
	public static Singleton2 getinstance(){
		if(instance==null){
			instance = new Singleton2();
		}
		return instance;
	}

}
