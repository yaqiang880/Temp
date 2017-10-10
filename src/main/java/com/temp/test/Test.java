package com.temp.test;

import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("E:/1.txt");
		fw.write("按客户");
	}

}
