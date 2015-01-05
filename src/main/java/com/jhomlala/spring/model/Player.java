package com.jhomlala.spring.model;

public class Player {
	
	private int id;
	private String name;
	private String joinDate;
	private Long steamID64;
	private String groupName;
	private int groupID;
	private boolean isGameAdmin;
	private boolean showDetailedOnWebMaps;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public Long getSteamID64() {
		return steamID64;
	}
	public void setSteamID64(Long steamID64) {
		this.steamID64 = steamID64;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public int getGroupID() {
		return groupID;
	}
	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}
	public boolean isGameAdmin() {
		return isGameAdmin;
	}
	public void setGameAdmin(boolean isGameAdmin) {
		this.isGameAdmin = isGameAdmin;
	}
	public boolean isShowDetailedOnWebMaps() {
		return showDetailedOnWebMaps;
	}
	public void setShowDetailedOnWebMaps(boolean showDetailedOnWebMaps) {
		this.showDetailedOnWebMaps = showDetailedOnWebMaps;
	}
	
	public Player ()
	{
		this.id = -1;
		this.name = "unknown";
		
	}
	
}
