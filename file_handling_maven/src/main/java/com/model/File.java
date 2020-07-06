package com.model;

public class File {
	
	private String filename;
	private String dirName;
	
	public File() {
		// TODO Auto-generated constructor stub
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getDirName() {
		return dirName;
	}

	public void setDirName(String dirName) {
		this.dirName = dirName;
	}

	
	
	public File(String filename, String dirName) {
		super();
		this.filename = filename;
		this.dirName = dirName;
	}

	@Override
	public String toString() {
		return "File [filename=" + filename + ", dirName=" + dirName + "]";
	}
	
	

}
