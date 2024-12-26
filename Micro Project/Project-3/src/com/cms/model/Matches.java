package com.cms.model;

public class Matches {

	private int matchId;
	private String matchDate;
	private String team_1;
	private String team_2;
	private String result;
	private Players player;// has-a

	public Matches() {
		super();

	}

	public Matches(int matchId, String matchDate, String team_1, String team_2, String result, Players player) {
		super();
		this.matchId = matchId;
		this.matchDate = matchDate;
		this.team_1 = team_1;
		this.team_2 = team_2;
		this.result = result;
		this.player = player;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public String getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}

	public String getTeam_1() {
		return team_1;
	}

	public void setTeam_1(String team_1) {
		this.team_1 = team_1;
	}

	public String getTeam_2() {
		return team_2;
	}

	public void setTeam_2(String team_2) {
		this.team_2 = team_2;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Players getPlayer() {
		return player;
	}

	public void setPlayer(Players player) {
		this.player = player;
	}

	

	@Override
	public String toString() {
	    return String.format(
	        "+----------------+--------------------------------------+\n" +
	        "| Field          | Value                                |\n" +
	        "+----------------+--------------------------------------+\n" +
	        "| matchId        | %-35s |\n" +
	        "| matchDate      | %-35s |\n" +
	        "| team_1         | %-35s |\n" +
	        "| team_2         | %-35s |\n" +
	        "| result         | %-35s |\n" +
	        "| player         | %-35s |\n" +
	        "+----------------+--------------------------------------+",
	        matchId, matchDate, team_1, team_2, result, player);
}
}
