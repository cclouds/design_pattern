package abstract_factory;
/**
 * BaseDepartment接口
 * @author user
 *
 */
public interface BaseDepartment {
	/*
	 * 插入新部门
	 */
	void insert(Department department);
	
	/*
	 * 根据id获取部门
	 */
	Department getDepartment(int id);

}
