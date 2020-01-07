package model;

import java.util.List;

import dao.maindao;

public class Mainlogic {

	public List<Content> execute(){

		maindao dao = new maindao();
		List<Content> list = dao.findAll();
		return list;

	}

}
