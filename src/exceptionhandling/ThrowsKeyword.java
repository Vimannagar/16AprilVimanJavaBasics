package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsKeyword {
	
	public static void main(String[] args) throws Exception
	
	{
			
		FileInputStream fis = new FileInputStream("E:\\Desktop\\VimanNagar\\16 Apr\\Class object variable and methods.docx");
		
		System.out.println("After locating the file");
		
		Thread.sleep(5000);
		
		
		System.out.println("After sleep method");
		
		
		
	}

}
