package decorator;
/**
 * Decorator类，装饰抽象类，继承了Component
 * @author user
 *
 */
public abstract class Decorator extends Component{
	
	protected Component component;
	

	public Component getComponent() {
		return component;
	}


	public void setComponent(Component component) {
		this.component = component;
	}


	@Override
	public void operation() {
		if(null != component){
			component.operation();
		}
		
	}

}
