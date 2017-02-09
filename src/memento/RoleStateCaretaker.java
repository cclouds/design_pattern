package memento;
/**
 * 角色状态管理者类
 * @author user
 *
 */
public class RoleStateCaretaker { 
	
	private RoleStateMemento memento;

	public RoleStateMemento getMemento() {
		return memento;
	}

	public void setMemento(RoleStateMemento memento) {
		this.memento = memento;
	}
	
	

}
