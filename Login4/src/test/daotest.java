package test;

import dao.Logindao;
import model.Account;
import model.User;

public class daotest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Logindao dao = new Logindao();
		User user = new User("nana","1234");
		Account result = dao.findByLogin(user);

		if(result != null &&
			result.getUserId().equals("nana")&&
			result.getPassword().equals("1234")){
				System.out.println("成功しました");
			}else {
				System.out.println("失敗しました");
			}


	}

}
