package com.cms.model;

public class Players {

	private int playerId;
	private String playerName;
	private String role;
	private String team;
	private int age;
	private String nationality;
	private String DOB;

	public Players() {
		super();

	}

	public Players(int playerId, String playerName, String role, String team, int age, String nationality, String dOB) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.role = role;
		this.team = team;
		this.age = age;
		this.nationality = nationality;
		DOB = dOB;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	

	@Override
	public String toString() {
	    return String.format(
	        "+-------------------+------------------------------------------+\n" +
	        "| Field             | Value                                    |\n" +
	        "+-------------------+------------------------------------------+\n" +
	        "| playerId          | %-40s |\n" +
	        "| playerName        | %-40s |\n" +
	        "| role              | %-40s |\n" +
	        "| team              | %-40s |\n" +
	        "| age               | %-40d |\n" +
	        "| nationality       | %-40s |\n" +
	        "| DOB               | %-40s |\n" +
	        "+-------------------+------------------------------------------+",
	        playerId, playerName, role, team, age, nationality, DOB);
	}

}