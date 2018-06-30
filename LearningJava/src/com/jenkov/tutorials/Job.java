package com.jenkov.tutorials;

public class Job {
	private String name;
	private int rank;

	public Job(String name, int rank) {
		super();
		this.name = name;
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public boolean equals(Job ob) {
		if (this.getName().equals(ob.getName())) {
			return true;
		} else {
			return false;
		}
	}
	
	// job name: HR,rank:1
	public String toString()
	{
		//String str= "[Job: "+this.getName()+",Rank: " +this.getRank()+"]";
		String str = "["+this.getName()+"]";
		return str;
	}

}
