package com.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileServices {

	public static boolean DoesFileExist(Path path) {

		if(Files.exists(path))
			
			System.out.println("This File Exists");
		else
			System.out.println("This File DoesNot Exists");

		return Files.exists(path);
	
	}
	public static void DeleteFile(Path path) {
		try {
			Files.deleteIfExists(path);
			DoesFileExist(path);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static  void CreateDirectory(Path path) {
		try {
			Files.createDirectory(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void createFile(Path path) {
		try {
			Files.createFile(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void createFile1(Path path) {
	try {
		Files.createFile(path);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public static void listFiles(Path path) {
		// TODO Auto-generated method stub
		
	}
	}

	

