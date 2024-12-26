package com.cms.main;

import java.util.Scanner;

import com.cms.model.Matches;
import com.cms.model.Players;
import com.cms.service.MatchServiceImpl;
import com.cms.service.PlayerServiceImpl;
import com.cms.view.MatchesView;
import com.cms.view.PlayerView;
/**
 * @author Kishore Kumar
 * @version 1.0 This is main class
 */
public class CMSApp {

	static Scanner sc = new Scanner(System.in);
	/**
	 * @param args it is my main method
	 */

	
	public static void main(String[] args) {
		MatchServiceImpl matchService = new MatchServiceImpl();
		PlayerServiceImpl playerservice = new PlayerServiceImpl();

		String result = "";
		String msg = " ";
		Matches matches;
		Players player;

		int match_id = 0;

		do {
			int choice = MatchesView.menu();

			switch (choice) {
			case 1:
				matches = MatchesView.insertMatchView();
				result = matchService.insertMatchValidation(matches);
				MatchesView.printResult(result);
				break;
			case 2:
				match_id = MatchesView.deleteMatchesView();
				result = matchService.deleteMatchValidation(match_id);
				MatchesView.printResult(result);
				break;
			case 3:
				matches = MatchesView.updateMatchView();// globally decalared
				result = matchService.updateMatchValidation(matches);
				MatchesView.printResult(result);

				break;
			case 4:
				match_id = MatchesView.findMatchesView();
				result = matchService.findMatchesValidation(match_id);
				MatchesView.printResult(result);
				break;
			case 5:
				result = matchService.findAllMatchesValidation();
				MatchesView.printResult(result);
				break;
			case 6:
				player = PlayerView.insertPlayerView();
				result = playerservice.insertPlayerValidation(player);
				MatchesView.printResult(result);
				break;
			case 7:
				match_id = PlayerView.deletePlayerView();
				result = playerservice.deletePlayerValidation(match_id);
				MatchesView.printResult(result);
				break;
			case 8:
				player = PlayerView.updatePlayerView();
				result = playerservice.updateDepartmentValidation(player);
				MatchesView.printResult(result);

				break;
			case 9:
				match_id = PlayerView.findPlayerView();
				result = playerservice.findPlayerValidation(match_id);
				MatchesView.printResult(result);
				break;
			case 10:
				result = playerservice.findAllPlayersValidation();
				MatchesView.printResult(result);
				break;
			case 11:
				System.out.println("Thank you");
				System.exit(0);
				break;
			default:
				MatchesView.printInvalidChoice();
			}
			msg = MatchesView.exit();
		} while (msg.equalsIgnoreCase("Yes"));

	}

}
