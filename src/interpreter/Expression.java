package interpreter;
/**
 * 抽象表达式角色
 * @author user
 *
 */
public abstract class Expression {
	
	/*
	 * 解释表达式
	 */
	public abstract boolean interpreter(Context con);
	
	/*
	 * 检验两个表达式在结构上是否相同
	 */
	public abstract boolean equals(Object obj);
	
	/*
	 * 返回表达式的hashcode
	 */
	public abstract int hashCode();

	/*
	 * 将表达式转化为字符串
	 */
	public abstract String toString();
}
