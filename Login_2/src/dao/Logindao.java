package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Account;
import model.User;

public class Logindao {


	public Account findByLogin(User user){

		Connection conn = null;
		List<User> list = new ArrayList<User>();
		Account account = null;


		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn =DriverManager.getConnection("jdbc:mysql://localhost/login?serverTimezone=JST","root","1234");

			String sql = "SELECT * FROM `user` WHERE `userId` = ? AND `password` = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1,user.getUserId());
			pStmt.setString(2, user.getPassword());


			ResultSet rs = pStmt.executeQuery();

			if(rs.next()) {
				String userId = rs.getString("userId");
				String password = rs.getString("password");

				account= new Account(userId,password);

			}



		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}finally {
			if(conn != null) {

				try {
					conn.close();

				}catch(SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
	}
		return account;

}}