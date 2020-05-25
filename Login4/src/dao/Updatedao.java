package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Content;


public class Updatedao{
	
	public void update(Content content) {
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("ドライバをロードしました");
			conn =DriverManager.getConnection("jdbc:mysql://localhost/login?serverTimezone=JST","root","1234");
			System.out.println("DBに接続しました");
			
			String sql ="UPDATE content SET content=?,year=?,day=?,name=? WHERE id=";
			PreparedStatement pStmt=conn.prepareStatement(sql);
		
			
			pStmt.setString(1,content.getContent());
			pStmt.setString(2, content.getYear());
			pStmt.setString(3, content.getMonth());
			pStmt.setString(4, content.getDay());
			pStmt.setString(5, content.getName());
			
			pStmt.executeQuery(sql);
			System.out.println("SQLを実行しました");
			
			pStmt.close();
			conn.close();
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
		}
	}
	
	
}

 