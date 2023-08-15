package week7.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.apache.commons.compress.archivers.ArchiveException;

public class ExceptionsTest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
	try {
//		int a=10;
//		int b=0;
//		int c=a/b;
		throw new ArchiveException("Index 3 out of bounds for length 2");
	//	int[] arr =new int[2];
	//	arr[3]=10;
//		FileReader read = new FileReader("sasa");
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e);
		System.out.println("Your file is not there - psl check");
	}
	finally {
		System.out.println("This is finally=========");
	}
	
	}

}
