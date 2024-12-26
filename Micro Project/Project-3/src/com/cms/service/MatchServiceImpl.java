package com.cms.service;

import com.cms.model.Matches;
import com.cms.model.Players;
import com.cms.repo.MatchRepo;
import com.cms.repo.MatchRepoImpl;

public class MatchServiceImpl implements MatchService  {

	MatchRepo matchRepo = new MatchRepoImpl();

	public String insertMatchValidation(Matches match) {
		String result;

		if (match == null) { // validation of employee
			result = "Matches Object is Null";
		} else if (match.getMatchId() == 0 || match.getMatchDate() == null || match.getTeam_1() == null
				|| match.getTeam_2() == null || match.getResult() == null || match.getPlayer().getPlayerId() == 0) {
			result = "Invalid matches Data";
		} else {
			boolean flag = matchRepo.doInsertMatches(match);
			if (flag) {
				result = "Matches Object Saved";
			} else {
				result = "Matches Object Not saved";
			}
		}
		return result;

	}

	public String deleteMatchValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid Match_id";
		} else {
			boolean flag = matchRepo.doDeleteMatches(id);

			if (flag) {
				result = "Matches Object Deleted";
			} else {
				result = "Matches Object Not Found";
			}
		}

		return result;
	}

	public String updateMatchValidation(Matches match) {
		String result = "";

		if (match == null) {
			result = "Matches Object is Null";
		} else {
			boolean flag = matchRepo.doUpdateMatches(match);

			if (flag) {
				result = "Matches Object Updated";
			} else {
				result = "Matches Object Not Found";
			}
		}

		return result;
	}

	public String findMatchesValidation(int match_id) {
		String result = "";

		if (match_id == 0) {
			result = "Invalid match_id";
		} else {
			Matches match = matchRepo.doFindmatch(match_id);

			if (match != null) {
				result = match.toString();
			} else {
				result = "Matches Object Not Found";
			}
		}

		return result;
	}

	public String findAllMatchesValidation() {
		return matchRepo.doFindAllMatches().toString();
	}

}
