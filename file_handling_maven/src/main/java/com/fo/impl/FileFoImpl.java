package com.fo.impl;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.fo.FileBO;
import com.fo.Files;

public class FileFoImpl implements FileBO {

	@Override
	public void sortFile() {
		
		File filename=null;
		String dirName=null;
		Scanner reader = new Scanner(System.in);

        System.out.println("Enter path of directory to be sorted");
        dirName = reader.nextLine();

	File fileDir = new File(dirName);
		if(fileDir.isDirectory()){
			java.util.List<String> listFile = Arrays.asList(fileDir.list());
			//System.out.println("Listing files unsorted");
			for(String s:listFile){
			//	System.out.println(s);
			}
			Collections.sort(listFile);
			System.out.println("---------------------------------------");
			System.out.println("Sorting by filename in ascending order");
			for(String s:listFile){
				System.out.println(s);
			}
		}
		
	}

	

	@Override
	public void removeFile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Files> getAllFiles() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	@Override
	public void createFile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Files> getFilesByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
