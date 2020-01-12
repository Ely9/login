package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Content;

public class maindao {



	public List<Content> findAll(){

		Connection conn = null;
		List<Content> list = new ArrayList<Content>();



		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn =DriverManager.getConnection("jdbc:mysql://localhost/login?serverTimezone=JST","root","1234");

			String sql = "SELECT * FROM content";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			ResultSet rs = pStmt.executeQuery();

			while(rs.next()) {
				String content  = rs.getString("content");
				String name = rs.getString("name");
				String year = rs.getString("year");
				String month = rs.getString("month");
				String day = rs.getString("day");


				Content cont = new Content(content,year,month,day,name);
				list.add(cont);


			}



		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			return null;
		}finally {
			if(conn !=null) {
				try {
					conn.close();
				}catch(SQLException e) {
					e.printStackTrace();
					return null;
				}
			}
		}








		return list;
	}



}
