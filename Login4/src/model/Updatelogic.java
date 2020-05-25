package model;

import java.io.Serializable;

import dao.Updatedao;

public class Updatelogic implements Serializable{
	public void execute(Content content) {

		Updatedao dao = new Updatedao();
		dao.update(content);

	}

}
