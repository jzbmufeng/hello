package com.mufeng.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.mufeng.main.FileService;

public class TestFileService {

	FileService fileService = null;
	
	@Before
	public void init() {
		fileService = new FileService();
	}
	
	@Test
	public void testUpload() {
		String fileName = "mufeng.txt";
		assertEquals(fileName, fileService.upload(fileName));
	}
	
	@Test
	public void testGetState() {
		String fileName = "mufeng.txt";
		fileService.getState(fileName);
	}

}
