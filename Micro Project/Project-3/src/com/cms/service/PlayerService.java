package com.cms.service;

import com.cms.model.Players;

public interface PlayerService {
	public String insertPlayerValidation(Players player);

	public String deletePlayerValidation(int id);

	public String updateDepartmentValidation(Players player);

	public String findPlayerValidation(int player_id);

	public String findAllPlayersValidation();
}
