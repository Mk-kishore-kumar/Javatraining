package com.cms.view;

import java.util.Scanner;

import com.cms.model.Matches;
import com.cms.model.Players;


public class MatchesView {
	static Scanner sc = new Scanner(System.in);
	
	

	static int matchId;
	static String matchDate;
	static String team_1;
	static String team_2;
	static String result;
	static int playerOfTheMatch;

	int playerId;
	
	public static int menu() {
		System.out.println("1. Insert Match details");
		System.out.println("2. Delete Match details");
		System.out.println("3. Update Match details");
		System.out.println("4. Find Match details");
		System.out.println("5. Display All Matches");

		System.out.println("6. Insert players");
		System.out.println("7. Delete players");
		System.out.println("8. Update players");
		System.out.println("9. Find players");
		System.out.println("10.Find All players");
		System.out.println("11. Exit");

		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public static void printInvalidChoice() {
		System.out.println("Invalid Choice");
	}
	
	public static void printResult(String result) {
		System.out.println(result);
	}
	
	public static String exit() {
		System.out.println("Do you want to continue [Yes | No]");
		return sc.next();
	}

	public static Matches insertMatchView() {
		System.out.println("Enter match id, date, team1, team2, result, playerofmatch");
		Players player = new Players();

		matchId = sc.nextInt();
		matchDate = sc.next();

		team_1 = sc.next();
		team_2 = sc.next();
		result = sc.next();
		playerOfTheMatch = sc.nextInt();

		player.setPlayerId(playerOfTheMatch);

		return new Matches(matchId, matchDate, team_1, team_2, result, player);

	}

	public static int deleteMatchesView() {
		System.out.println("Enter Match_id to delete");
		return sc.nextInt();
	}

	public static Matches updateMatchView() {
		// in update we are updateing everything
		System.out.println("Enter Match_id, matchDate, team_1, team_2, result, palyerOfmatch");
		matchId = sc.nextInt();
		matchDate = sc.next();

		team_1 = sc.next();
		team_2 = sc.next();
		result = sc.next();
		playerOfTheMatch = sc.nextInt();

		Players player = new Players();
		player.setPlayerId(playerOfTheMatch);

		return new Matches(matchId, matchDate, team_1, team_2, result, player);

	}

	public static int findMatchesView() {
		System.out.println("Enter match_id");
		return sc.nextInt();
	}

}