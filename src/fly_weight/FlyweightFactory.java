package fly_weight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂角色类
 * 客户端不可以直接将具体享元类实例化，而必须通过一个工厂对象，利用一个factory()方法得到享元对象
 * @author user
 *
 */
public class FlyweightFactory {
	
	private Map<Integer,Flyweight> map = new HashMap<Integer, Flyweight>();
	
	public Flyweight factory(Integer state){
		 //先从缓存中查找对象
		Flyweight fly = map.get(state);
		
		if(null==fly){
			//如果对象不存在则创建一个新的Flyweight对象
			fly = new ConcreteFlyweight(state);
			//把这个新的Flyweight对象添加到缓存中
			map.put(state, fly);
		}
		return fly;
	}

}
