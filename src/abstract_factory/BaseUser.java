package abstract_factory;
/**
 * BaseUser接口：用于客户端的访问
 * @author user
 *
 */
public interface BaseUser {
	
	void Insert(User user);
	
	User getUSer(int id);

}
