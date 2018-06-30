package com.jenkov.totorials.networking;

public class DummyClass {

	public String matches(String statement, String word) {
		if (statement.contains(word)) {
			return "Menakshi Prasad " + word;
		} else {
			return "NOTHING";
		}
	}
}
