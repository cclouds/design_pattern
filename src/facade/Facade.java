package facade;
/**
 * 外观类，它需要了解所有子系统的方法和属性，进行组合，以备外界调用
 * @author user
 *
 */
public class Facade {
	SubSystemOne one;
	SubSystemTwo two;
	SubSystemThree three;
	SubSystemFour four;
	
	public Facade() {
		one = new SubSystemOne();
		two = new SubSystemTwo();
		three = new SubSystemThree();
		four = new SubSystemFour();
	}
	
	public void methodA(){
		System.out.println("执行方法A");
		one.methodOne();
		two.methodOTwo();
		three.methodOThree();
		four.methodOFour();
	}
	
	public void methodB(){
		System.out.println("执行方法B");
		one.methodOne();
		two.methodOTwo();
		three.methodOThree();
		four.methodOFour();
	}
	
	
	public void methodC(){
		System.out.println("执行方法C");
		one.methodOne();
		two.methodOTwo();
		three.methodOThree();
		four.methodOFour();
	}
	
}
