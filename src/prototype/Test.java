package prototype;


/**
 * 测试类：原型模式
 * @author user
 *
 */
public class Test {
	public static void main(String[] args)  {
		Prototype prototype = new Prototype();
		
		Prototype copyPrototype = (Prototype)prototype.clone();
		
		Prototype deepcopyPrototype = null;
		try {
			deepcopyPrototype = (Prototype)prototype.deepClone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(prototype == copyPrototype);  //false
		System.out.println(prototype.getNameList() == copyPrototype.getNameList());  //true
		System.out.println(prototype == deepcopyPrototype); //false
		System.out.println(prototype.getNameList() == deepcopyPrototype.getNameList());  //false
	}
}
