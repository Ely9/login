package test;

import java.util.List;

import dao.maindao;
import model.Content;

public class maindaotest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		maindao dao = new maindao();
		List<Content> list = dao.findAll();

		for(Content con: list) {
			System.out.println(con.getContent());
			System.out.println(con.getYear());
			System.out.println(con.getMonth());
			System.out.println(con.getDay());
		}


	}

}
