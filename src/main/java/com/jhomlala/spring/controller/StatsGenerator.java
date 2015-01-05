package com.jhomlala.spring.controller;

import java.io.IOException;
import java.util.Iterator;

import javax.sql.DataSource;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.servlet.ModelAndView;




import com.jhomlala.spring.model.Player;

public class StatsGenerator {

	public Player getPlayerWithID(int playerID)
	{
		
		
			JSONObject JSONWithLogs;
			try {
				JSONWithLogs = JsonReader.readJsonFromUrl("http://api.ets2mp.com/player/"+playerID);
				Boolean logsStatus = JSONWithLogs.getBoolean("error");
				if (!logsStatus)
				{
					JSONObject Logs =  JSONWithLogs.getJSONObject("response"); 
					
	
					int id = Logs.getInt("id"); 
					String name = Logs.getString("name");
					String joinDate = Logs.getString("joinDate");
					Long steamID64 = Logs.getLong("steamID64");
					String groupName = Logs.getString("groupName");
					int groupID = Logs.getInt("groupID");
					JSONObject permissions = Logs.getJSONObject("permissions");
					Boolean isGameAdmin = permissions.getBoolean("isGameAdmin");
					Boolean showDetailedOnWebMaps = permissions.getBoolean("showDetailedOnWebMaps");
					
					Player player = new Player();
					player.setId(id);
					player.setName(name);
					player.setJoinDate(joinDate);
					player.setSteamID64(steamID64);
					player.setGroupName(groupName);
					player.setGroupID(groupID);
					player.setGameAdmin(isGameAdmin);
					player.setShowDetailedOnWebMaps(showDetailedOnWebMaps);
					
					return player;
				}
				else
					return null;
				
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
		
	}
}
