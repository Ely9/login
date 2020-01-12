package model;

import java.io.Serializable;

public class Content implements Serializable{



	private String content,name;
	private String year,month,day;



	public Content(String content,int limit_year,int limit_month,int limit_day,String person) {
		this.content=content;
		this.person=person;
		this.limit_year = limit_year;
		this.limit_month=limit_month;
		this.limit_day=limit_day;
	}


	public String getContent() {
		return content;
	}

	public String getPerson() {
		return person;
	}

	public int getLimitYear() {
		return limit_year;
	}

	public int getLimitMonth() {
		return limit_month;
	}

	public int getLimitDay() {
		return limit_day;
	}

}
