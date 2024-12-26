package com.cms.service;

import com.cms.model.Matches;

public interface MatchService {
	public String insertMatchValidation(Matches match);

	public String deleteMatchValidation(int id);

	public String updateMatchValidation(Matches match);

	public String findMatchesValidation(int match_id);

	public String findAllMatchesValidation();
}
