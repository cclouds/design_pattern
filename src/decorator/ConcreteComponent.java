package decorator;
/**
 * ConcreteComponent 定义一个具体的对象       
 * @author user
 *
 */
public class ConcreteComponent extends Component{

	@Override
	public void Operation() {
		
		System.out.println("具体对象的操作");
		
	}

}
