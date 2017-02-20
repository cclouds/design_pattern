package interpreter;
/**
 * 　一个Variable对象代表一个有名变量
 * @author user
 *
 */
public class Variable extends Expression{
	
	private String name;
	
	

	public Variable(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean interpreter(Context con) {
		return con.lookup(this); 
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Variable){
			return this.name.equals (((Variable)obj).name);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	@Override
	public String toString() {
		return name;
	}

}
