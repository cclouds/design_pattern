package memento;
/**
 * 测试类：备忘录模式
 * @author user
 *
 */
public class Test {
	
	public static void main(String[] args) {
		GameRole role = new GameRole();
		role.getInitState();
		role.stateDisplay();
		
		//保存进度
		RoleStateCaretaker taker = new RoleStateCaretaker();
		taker.setMemento(role.saveState());
		
		role.fight();
		role.stateDisplay();
		
		//恢复之前状态
		role.recoveryState(taker.getMemento());
		role.stateDisplay();
	}

}
