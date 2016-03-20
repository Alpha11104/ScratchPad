package com.pfdevilliers;

public class Card {
	private String suite;
	private String type;
	
	public Card(String suite, String type) {
		this.suite = suite;
		this.type = type;
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "<" + suite + " " + type + ">";
	}
}
