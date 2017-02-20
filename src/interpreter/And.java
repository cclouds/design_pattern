package interpreter;
/**
 * 代表逻辑“与”操作的And类，表示由两个布尔表达式通过逻辑“与”操作给出一个新的布尔表达式的操作
 * @author user
 *
 */
public class And extends Expression{
	private Expression left;
	
	private Expression right;

	public And(Expression left, Expression right) {
		super();
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean interpreter(Context con) {
		return left.interpreter(con) && right.interpreter(con);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof And){
			return this.left.equals(((And)obj).left) &&
			this.right.equals(((And)obj).right);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public String toString() {
		return "("+left.toString()+"And"+right.toString()+")";
	}
	
	
}
