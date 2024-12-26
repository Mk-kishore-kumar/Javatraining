package com.cms.view;

import java.util.Scanner;

import com.cms.model.Matches;
import com.cms.model.Players;

public class PlayerView {
	static Scanner sc = new Scanner(System.in);

	static int playerId;
	static String name;
	static String role;
	static String team;
	static int age;
	static String nationality;
	static String DOB;;

	public static Players insertPlayerView() {
		System.out.println("Enter player_id, Name, Role, Team, age, nationality, DOB");

		playerId = sc.nextInt();
		name = sc.next();

		role = sc.next();
		team = sc.next();
		age = sc.nextInt();
		nationality = sc.next();
		DOB = sc.next();

		return new Players(playerId, name, role, team, age, nationality, DOB);

	}

	public static int deletePlayerView() {
		System.out.println("Enter Player_id to delete");
		return sc.nextInt();
	}

	public static Players updatePlayerView() {
		// in update we are updateing everything
		System.out.println("Enter player_id, Name, Role, Team, age, nationality, DOB");

		playerId = sc.nextInt();
		name = sc.next();

		role = sc.next();
		team = sc.next();
		age = sc.nextInt();
		nationality = sc.next();
		DOB = sc.next();

		return new Players(playerId, name, role, team, age, nationality, DOB);

	}

	public static int findPlayerView() {
		System.out.println("Enter player_id");
		return sc.nextInt();
	}

}