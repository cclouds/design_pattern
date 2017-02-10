package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体公司类，继承Company
 * @author user
 *
 */
public class ConcreteCompany extends Company{
	
	public ConcreteCompany(String name) {
		super(name);
	}

	private List<Company> list = new ArrayList<Company>();

	@Override
	void addCompany(Company company) {
		list.add(company);
	}

	@Override
	void deleteCompany(Company company) {
		list.remove(company);
	}

	@Override
	void display(String preStr) {
		System.out.println(preStr+""+this.name);
		preStr += "-";
		for(Company c:list){
			c.display(preStr);
		}
	}

	@Override
	void lineofDuty() {
		for(Company c:list){
			c.lineofDuty();
		}
	}

}
