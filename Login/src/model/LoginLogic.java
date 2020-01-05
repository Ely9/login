package model;

import dao.Logindao;

public class LoginLogic {

	public boolean execute(User user) {

		Logindao dao = new Logindao()
;
		Account account = dao.findByLogin(user);

		return account != null;

}}