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

			conn =DriverManager.getConnection("jdbc:mysql://localhost/contents?serverTimezone=JST","root","1234");

			String sql = "SELECT content,limit_year,limit_month_limit,day,person FROM todo";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			ResultSet rs = pStmt.executeQuery();

			while(rs.next()) {
				String content  = rs.getString("content");
				String person = rs.getString("person");
				int limit_year = rs.getInt("limit_year");
				int limit_month = rs.getInt("limit_mont");
				int limit_day = rs.getInt("limit_day");


				Content cont = new Content(content,limit_year,limit_month,limit_day,person);
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
