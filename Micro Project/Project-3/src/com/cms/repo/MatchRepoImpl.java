package com.cms.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.cms.model.Matches;
import com.cms.model.Players;
import com.cms.util.DBUtil;

public class MatchRepoImpl implements MatchRepo{

	PlayerRepo playerRepo = new PlayersRepoImpl();

	public boolean doInsertMatches(Matches match) {

		boolean flag = false;

		try {

			Connection con = DBUtil.getDBConnection();

			String sql = "insert into Matches values(?, ?, ?, ?, ?, ?)";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, match.getMatchId());
			ps.setString(2, match.getMatchDate());
			ps.setString(3, match.getTeam_1());
			ps.setString(4, match.getTeam_2());
			ps.setString(5, match.getResult());
			ps.setInt(6, match.getPlayer().getPlayerId());

			int n = ps.executeUpdate();

			if (n == 1) {

				flag = true;
			}
		} catch (SQLException e) {

			System.out.println("Insert query not executed");
		}
		return flag;

	}

	public boolean doDeleteMatches(int id) {
		boolean flag = false;
		try {

			Connection con = DBUtil.getDBConnection();

			String sql = "delete Matches where match_id =?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			int n = ps.executeUpdate();

			if (n == 1) {

				flag = true;
			}
		} catch (SQLException e) {

			System.out.println("Delete query not executed");
		}
		return flag;

	}

	public boolean doUpdateMatches(Matches match) {

		boolean flag = false;

		try {

			Connection con = DBUtil.getDBConnection();

			String sql = "update Matches set match_date =?, team_1 = ?, team_2 =?, result =? where match_id=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, match.getMatchDate());
			ps.setString(2, match.getTeam_1());
			ps.setString(3, match.getTeam_2());
			ps.setString(4, match.getResult());
			ps.setInt(5, match.getMatchId());
			int n = ps.executeUpdate();

			if (n == 1) {

				flag = true;
			}
		} catch (SQLException e) {

			System.out.println("update query not executed");
		}
		return flag;

	}

	public Matches doFindmatch(int id) {
		int matchNumber;

		Matches matches = null;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from Matches where match_id =?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				matches = new Matches();

				matches.setMatchId(rs.getInt("match_id"));
				matches.setMatchDate(rs.getString("match_date"));
				matches.setTeam_1(rs.getString("team_1"));
				matches.setTeam_2(rs.getString("team_2"));
				matches.setResult(rs.getString("result"));
				matchNumber = rs.getInt("player_of_the_match");
				Players players = playerRepo.doFindplayer(matchNumber);
				matches.setPlayer(players);

			}
		} catch (SQLException e) {
			System.out.println("hii");
			System.out.println("Query not executed");
		}

		return matches;
	}

	public List<Matches> doFindAllMatches() {

		List<Matches> list = new LinkedList<>();

		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from Matches";

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Matches matches = new Matches();

				matches.setMatchId(rs.getInt("match_id"));
				matches.setMatchDate(rs.getString("match_date"));
				matches.setTeam_1(rs.getString("team_1"));
				matches.setTeam_2(rs.getString("team_2"));
				// matches.setTeam_2(rs.getString("team_2"));
				matches.setResult(rs.getString("result"));
				// matches.get(rs.getString("result"));
				int matchNumber = rs.getInt("player_of_the_match");

				Players players = playerRepo.doFindplayer(matchNumber);
				matches.setPlayer(players);
				list.add(matches);

			}
		} catch (SQLException e) {
			System.out.println("Query not executed");
		}

		return list;
	}

}
