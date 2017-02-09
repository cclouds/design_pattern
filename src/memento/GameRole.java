package memento;
/**
 * 游戏角色类：用来存储角色的生命力，攻击力，防御力的数据
 * @author user
 *
 */
public class GameRole {
	/*
	 * 生命力
	 */
	private int vit;
	
	/*
	 * 攻击力
	 */
	private int atk;
	
	/*
	 * 防御力
	 */
	private int def;
	
	/*
	 * 状态显示
	 */
	public void StateDisplay(){
		System.out.println("角色当前状态：体力："+this.vit+"攻击力："+this.atk+"防御力:"+this.def);
	}
	
	/*
	 * 获得初始状态
	 */
	public void GetInitState(){
		this.atk = 100;
		this.def = 100;
		this.vit = 100;
	}
	
	/*
	 * 获得战斗后的状态
	 */
	public void Fight(){
		this.atk = 0;
		this.def = 0;
		this.vit = 0;
	}

	public int getVit() {
		return vit;
	}

	public void setVit(int vit) {
		this.vit = vit;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	
	/*
	 * 保存角色状态
	 */
    public RoleStateMemento SaveState(){
    	
    	return new RoleStateMemento(vit,atk,def);
    	
    }
    
    /*
     * 回复角色状态
     */
	public void RecoveryState(RoleStateMemento memento){
		this.vit = memento.getVit();
		this.def = memento.getDef();
		this.atk = memento.getAtk();
	}
}
