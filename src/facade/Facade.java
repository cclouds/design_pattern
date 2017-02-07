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
	
	public void MethodA(){
		System.out.println("执行方法A");
		one.MethodOne();
		two.MethodOTwo();
		three.MethodOThree();
		four.MethodOFour();
	}
	
	public void MethodB(){
		System.out.println("执行方法B");
		one.MethodOne();
		two.MethodOTwo();
		three.MethodOThree();
		four.MethodOFour();
	}
	
	
	public void MethodC(){
		System.out.println("执行方法C");
		one.MethodOne();
		two.MethodOTwo();
		three.MethodOThree();
		four.MethodOFour();
	}
	
}
