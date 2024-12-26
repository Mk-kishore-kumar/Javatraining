package com.cms.service;

import com.cms.model.Matches;
import com.cms.model.Players;
import com.cms.repo.MatchRepoImpl;
import com.cms.repo.PlayersRepoImpl;
import com.cms.repo.PlayerRepo;
public class PlayerServiceImpl implements PlayerService{

	PlayerRepo playerRepo = new PlayersRepoImpl();

	public String insertPlayerValidation(Players player) {
		String result;

		if (player == null) {
			result = "Players Object is Null";
		} else if (player.getPlayerId() == 0 || player.getPlayerName() == null || player.getRole() == null
				|| player.getTeam() == null || player.getTeam() == null || player.getAge() == 0
				|| player.getNationality() == null || player.getDOB() == null) {
			result = "Invalid Player Data";
		} else {
			boolean flag = playerRepo.doInsertPlayers(player);
			if (flag) {
				result = "Players Object Saved";
			} else {
				result = "Players Object Not saved";
			}
		}
		return result;

	}

	public String deletePlayerValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid Player_id";
		} else {
			boolean flag = playerRepo.doDeletePlayer(id);

			if (flag) {
				result = "Players Object Deleted";
			} else {
				result = "Players Object Not Found";
			}
		}

		return result;
	}

	public String updateDepartmentValidation(Players player) {
		String result = "";

		if (player == null) {
			result = "Players Object is Null";
		} else {
			boolean flag = playerRepo.doUpdatePlayer(player);

			if (flag) {
				result = "Players Object Updated";
			} else {
				result = "Players Object Not Found";
			}
		}

		return result;
	}

	public String findPlayerValidation(int player_id) {
		String result = "";

		if (player_id == 0) {
			result = "Invalid player_id";
		} else {
			Players players = playerRepo.doFindplayer(player_id);

			if (players != null) {
				result = players.toString();
			} else {
				result = "player Object Not Found";
			}
		}

		return result;
	}

	public String findAllPlayersValidation() {
		return playerRepo.doFindAllplayers().toString();
	}

}
