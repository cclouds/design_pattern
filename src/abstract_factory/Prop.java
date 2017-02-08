package abstract_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读取prop配置文件
 * @author user
 *
 */
public class Prop {
	public String GetProper(){
		
		Properties proper = new Properties();
		InputStream is = this.getClass().getResourceAsStream("DB.properties");
		try {
			proper.load(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String db = proper.getProperty("db");
		return db;
	}

}
