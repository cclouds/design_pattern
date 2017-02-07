package template_method;
/**
 * 模板方法模式
 * AbstractClass是抽象类，定义并实现了一个模板方法
 * @author user
 *
 */
public abstract class AbstractClass {
	//抽象行为
	public abstract void PrimitiveOperation1();
	
	public abstract void PrimitiveOperation2();
	
	//模板方法，给出逻辑的骨架，而逻辑的组成是一些相应的抽象操作，推迟到子类实现
	public void TemplateMethod(){
		PrimitiveOperation1();
		PrimitiveOperation2();
	}

}
