package singleton;
/**
 * 单例模式
 * 懒汉模式：要在第一次被引用时。才会将自己实例化
 * synchronized将导致性能开销
 */
public class Singleton3 {
	//1.构造方法私有化，外界无法用new创建此类的实例
		private Singleton3(){
			
		}
		//2.创建类的唯一实例
		private static Singleton3 instance;
		
		
		//3.创建类的唯一实例
		public synchronized static Singleton3 getInstance(){
			//若实例不存在，则new一个新实例，否则返回已有的实例
			if(instance==null){    
				instance = new Singleton3();
			}
			return instance;
		}

}
