package interpreter;
/**
 * 代表逻辑“非”操作的Not类，代表由一个布尔表达式通过逻辑“非”操作给出一个新的布尔表达式的操作
 * @author user
 *
 */
public class Not extends Expression{
	private Expression exp;

	
	
	public Not(Expression exp) {
		super();
		this.exp = exp;
	}

	@Override
	public boolean interpreter(Context con) {
		return !exp.interpreter(con);
	}

	@Override
	public boolean equals(Object obj) {
	    if(obj != null && obj instanceof Not){
	    	return this.exp.equals(((Not)obj).exp);
	    }
		return false;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public String toString() {
		return "(Not"+exp.toString()+")";
	}

}
