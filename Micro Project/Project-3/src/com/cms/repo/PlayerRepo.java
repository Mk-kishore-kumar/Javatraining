package com.cms.repo;

import java.util.List;

import com.cms.model.Players;

public interface PlayerRepo {
	public boolean doInsertPlayers(Players player);

	public boolean doDeletePlayer(int id);

	public boolean doUpdatePlayer(Players player);

	public Players doFindplayer(int id);

	public List<Players> doFindAllplayers();
}