package model;

import dao.maindao;

public class Addlogic {

	public void execute(Content content) {
		maindao dao = new maindao();
		dao.create(content);
	}

}
