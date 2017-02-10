package composite;
/**
 * 公司类
 * @author user
 *
 */
public abstract class Company {
	
	protected String name;
	
	
	public Company(String name) {
		super();
		this.name = name;
	}
	
	//增加
	abstract void addCompany(Company company);
	//移除
	abstract void deleteCompany(Company company);
	//展示
	abstract void display(String preStr);
	//履行职责
    abstract void lineofDuty();
}
