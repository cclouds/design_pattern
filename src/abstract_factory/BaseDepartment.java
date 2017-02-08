package abstract_factory;
/**
 * BaseDepartment接口
 * @author user
 *
 */
public interface BaseDepartment {
	
	void Insert(Department department);
	
	Department GetDepartment(int id);

}
