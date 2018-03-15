package com.netease.openCV246;

public class TestMain2 {
	
	static DetectFaceDemo2 detec = new DetectFaceDemo2();
	
	  public static void main(String[] args) {  
	    System.out.println("Hello, OpenCV");  
	    // Load the native library.  
	    System.loadLibrary("opencv_java246");  
	    	detec.run(); 
	     
	  }  
	}