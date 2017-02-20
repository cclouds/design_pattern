package interpreter;
/**
 * 代表逻辑“或”操作的Or类，代表由两个布尔表达式通过逻辑“或”操作给出一个新的布尔表达式的操作
 * @author user
 *
 */
public class Or extends Expression{
	
    private Expression left;
	
	private Expression right;

	public Or(Expression left, Expression right) {
		super();
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean interpreter(Context con) {
		return left.interpreter(con) || right.interpreter(con);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Or){
			return this.left.equals(((Or)obj).left) &&
					this.right.equals(((Or)obj).right);		
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public String toString() {
		return "("+left.toString()+"Or"+right.toString()+")";
	}

}
