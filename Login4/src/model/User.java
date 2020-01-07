package model;
import java.io.Serializable;

public class User implements Serializable{

	private String userId,password;





	public User(String userId,String password) {
		this.userId =userId;
		this.password = password;
	}


	public String getUserId() {
		return userId;
	}

	public String getPassword() {
		return password;
	}


}
