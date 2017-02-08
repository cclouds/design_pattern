package abstract_factory;
/**
 * MysqlUser实现BaseUser
 * @author user
 *
 */
public class MysqlUser implements BaseUser{

	@Override
	public void Insert(User user) {
		System.out.println("在Mysql User表中增加一条记录");
		
	}

	@Override
	public User getUSer(int id) {
		System.out.println("在Mysql User表中根据id查找记录");
		return null;
	}

}
