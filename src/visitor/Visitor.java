package visitor;
/**
 * 抽象访问者(Visitor)角色：声明了一个或者多个方法操作
 * 形成所有的具体访问者角色必须实现的接口。
 * @author user
 *
 */
public interface Visitor {
	/*
	 * 对于NodeA的访问操作
	 */
	public void visit(NodeA node);
	
	
	/*
	 * 对于NodeB的访问操作
	 */
	public void visit(NodeB node);
}
