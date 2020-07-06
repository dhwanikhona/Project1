package com.fo;

import java.nio.file.Files;
import java.util.List;

import com.model.File;

public interface FileBO {

	public void createFile();
	public void SearchFile();
	public void removeFile();
	public List<Files> getAllFiles();
	public List<Files> getFilesByName(String name);
	public void sortFile();
	
}