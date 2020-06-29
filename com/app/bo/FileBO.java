package com.fo;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface FileBO {

	public void createFile();
	public void getPlayerById(int id) throws BusinessException;
	public void removeFile();
	public List<Files> getAllFiles();
	public List<Player> getPlayersByName(String name) throws BusinessException;
	public List<Player> getPlayersByTeamName(String teamname) throws BusinessException;
}
