package io.pello.refactoring.inlineclass;

import java.util.Date;

/**
 * Inline class
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class PersonRefactored {
	private String name;
	private Date birth;
	public static final int MALE = 0;
	public static final int FEMALE = 1;
	private int sex;

	
	public PersonRefactored(String name, Date birth, int sexCode) {
		this.name = name;
		this.birth = birth;
		this.sex = sexCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + "]";
	}

	
}
