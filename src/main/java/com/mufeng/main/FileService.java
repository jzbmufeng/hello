package com.mufeng.main;

public class FileService {
	/**
	 * 上传
	 * @param fileName
	 * @return
	 */
	public String upload(String fileName) {
		System.out.println(fileName);
		return fileName;
	}
	/**
	 * 下载
	 * @param fileName
	 * @return
	 */
	public byte[] download(String fileName) {
		return "mufeng".getBytes();
	}
	
	/**
	 * 获取状态
	 * @param fileName
	 * @return
	 */
	public int getState(String fileName) {
		
		if ("mufeng.txt".equals(fileName)) {
			return 1;
		}
		
		return 0;
	}
	
}
