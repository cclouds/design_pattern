package mediator;
/**
 * Colleague类：抽象同事类
 * @author user
 *
 */
public class Colleague {
	
	protected Mediator mediator;

	public Colleague(Mediator mediator) {
		super();
		this.mediator = mediator;
	}
	

}
