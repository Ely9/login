package model;

import java.io.Serializable;

public class Content implements Serializable{



	private String content,name;
	private String year,month,day;
	private int id;



	public Content(String content,String year,String month,String day,String name,int id) {
		this.id=id;
		this.content=content;
		this.name=name;
		this.year=year;
		this.month=month;
		this.day=day;
	}

	public int getId() {
		return id;
	}


	public String getContent() {
		return content;
	}

	public String getName() {
		return name;
	}

	public String getYear() {
		return year;
	}

	public String getMonth() {
		return month;
	}

	public String getDay() {
		return day;
	}

}
