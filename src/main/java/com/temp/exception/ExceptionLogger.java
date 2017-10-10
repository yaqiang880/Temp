package com.temp.exception;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ExceptionLogger extends Exception{

	private static final long serialVersionUID = 1L;

	public ExceptionLogger(){}
	
	public ExceptionLogger(String message){
		logger(message);
	}

	private void logger(String message){
		RandomAccessFile randomFile = null;
		try {
			 randomFile = new RandomAccessFile("E:/1.txt", "rw");
             // 文件长度，字节数
             long fileLength = randomFile.length();
             //将写文件指针移到文件尾。
             randomFile.seek(fileLength);
             randomFile.writeBytes(message+"/n");
             randomFile.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				randomFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
