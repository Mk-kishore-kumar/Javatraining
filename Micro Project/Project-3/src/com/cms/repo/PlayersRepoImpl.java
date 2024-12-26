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

public class PlayersRepoImpl implements PlayerRepo{

	public boolean doInsertPlayers(Players player) {

		boolean flag = false;

		try {

			Connection con = DBUtil.getDBConnection();

			String sql = "insert into Players values(?, ?, ?, ?, ?, ?, ?)";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, player.getPlayerId());
			ps.setString(2, player.getPlayerName());
			ps.setString(3, player.getRole());
			ps.setString(4, player.getTeam());
			ps.setInt(5, player.getAge());
			ps.setString(6, player.getNationality());
			ps.setString(7, player.getDOB());

			int n = ps.executeUpdate();

			if (n == 1) {

				flag = true;
			}
		} catch (SQLException e) {

			System.out.println("Insert query not executed");
		}
		return flag;

	}

	public boolean doDeletePlayer(int id) {
		boolean flag = false;
		try {

			Connection con = DBUtil.getDBConnection();

			String sql = "delete Players where player_id =?";

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

	public boolean doUpdatePlayer(Players player) {

		boolean flag = false;

		try {

			Connection con = DBUtil.getDBConnection();

			String sql = "update players set name =?, role = ?, team =?, age =?, nationality =?,Date_of_birth  =? where player_id=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, player.getPlayerName());
			ps.setString(2, player.getRole());
			ps.setString(3, player.getTeam());
			ps.setInt(4, player.getAge());
			ps.setString(5, player.getNationality());
			ps.setString(6, player.getDOB());
			ps.setInt(7, player.getPlayerId());

			int n = ps.executeUpdate();

			if (n == 1) {

				flag = true;
			}
		} catch (SQLException e) {

			System.out.println("update query not executed");
		}
		return flag;

	}

	public Players doFindplayer(int id) {
		Players player = null;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from players where player_id =?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				player = new Players();
				player.setPlayerId(rs.getInt("player_id"));
				player.setPlayerName(rs.getString("name"));
				player.setRole(rs.getString("role"));
				player.setTeam(rs.getString("team"));
				player.setAge(rs.getInt("age"));
				player.setNationality(rs.getString("nationality"));
				player.setDOB(rs.getString("Date_of_birth"));

			}
		} catch (SQLException e) {
			System.out.println("Query not executed");
		}

		return player;
	}

	public List<Players> doFindAllplayers() {

		List<Players> list = new LinkedList<>();

		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from Players";

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				Players player = new Players();
				player.setPlayerId(rs.getInt("player_id"));
				player.setPlayerName(rs.getString("name"));
				player.setRole(rs.getString("role"));
				player.setTeam(rs.getString("team"));
				player.setAge(rs.getInt("age"));
				player.setNationality(rs.getString("nationality"));
				player.setDOB(rs.getString("Date_of_birth"));

				list.add(player);

			}
		} catch (SQLException e) {
			System.out.println("Query not executed");
		}

		return list;
	}
}
