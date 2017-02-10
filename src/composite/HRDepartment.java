package composite;
/**
 * 人力资源部类继承公司类
 * @author user
 *
 */
public class HRDepartment extends Company{

	public HRDepartment(String name) {
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
		System.out.println(name+" 员工招聘培训管理");
	}

}
