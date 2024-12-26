package com.cms.repo;

import java.util.List;

import com.cms.model.Matches;

public interface MatchRepo {
	public boolean doInsertMatches(Matches match);

	public boolean doDeleteMatches(int id);

	public boolean doUpdateMatches(Matches match);

	public Matches doFindmatch(int id);

	public List<Matches> doFindAllMatches();

}
