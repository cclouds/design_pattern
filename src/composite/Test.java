package composite;
/**
 * 测试类:组合模式
 * @author user
 *
 */
public class Test {
	
	public static void main(String[] args) {
		ConcreteCompany root = new ConcreteCompany("北京总公司");
		root.addCompany(new HRDepartment("总公司人力资源部"));
		root.addCompany(new FinanceDepartment("总公司财务部"));
		
		ConcreteCompany com1 = new ConcreteCompany("杭州分公司");
		com1.addCompany(new HRDepartment("杭州分公司人力资源部"));
		com1.addCompany(new FinanceDepartment("杭州分公司财务部"));
		root.addCompany(com1);
		
		
		ConcreteCompany com2 = new ConcreteCompany("南京分公司");
		com2.addCompany(new HRDepartment("南京分公司人力资源部"));
		com2.addCompany(new FinanceDepartment("南京分公司财务部"));
		root.addCompany(com2);
		
		root.display("-");
		
		root.lineofDuty();
	}

}
