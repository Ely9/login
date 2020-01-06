package test;

import model.LoginLogic;
import model.User;

public class logintest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ



		User user = new User("nana","1234");

		LoginLogic bo = new LoginLogic();
		boolean result = bo.execute(user);

		if(result) {
			System.out.println("成功しました");

		}else {
			System.out.println("失敗しました");
		}
	}
}
