package composite;
/**
 * 财务部继承公司类
 * @author user
 *
 */
public class FinanceDepartment extends Company{

	public FinanceDepartment(String name) {
		super(name);
	}

	@Override
	void addCompany(Company company) {
		
	}

	@Override
	void deleteCompany(Company company) {
		
	}

	@Override
	void display(String preStr) {
		System.out.println(preStr+""+name);
	}

	@Override
	void lineofDuty() {
		System.out.println(name+" 公司财务收支管理");
	}

}
