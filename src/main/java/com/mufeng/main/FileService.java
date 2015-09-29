package com.mufeng.main;

public class FileService {
	
	public String upload(String fileName) {
		System.out.println(fileName);
		return fileName;
	}
	
	public byte[] download(String fileName) {
		return "mufeng".getBytes();
	}
	
	
	public int getState(String fileName) {
		
		if ("mufeng.txt".equals(fileName)) {
			return 1;
		}
		
		return 0;
	}
	
}
