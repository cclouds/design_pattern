package memento;
/**
 * 测试类
 * @author user
 *
 */
public class Test {
	
	public static void main(String[] args) {
		GameRole role = new GameRole();
		role.GetInitState();
		role.StateDisplay();
		
		//保存进度
		RoleStateCaretaker taker = new RoleStateCaretaker();
		taker.setMemento(role.SaveState());
		
		role.Fight();
		role.StateDisplay();
		
		//恢复之前状态
		role.RecoveryState(taker.getMemento());
		role.StateDisplay();
	}

}
