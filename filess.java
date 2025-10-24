import java.io.*;
import java.util.*;
public class filess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String filename;
 Scanner input=new Scanner(System.in);
 System.out.println("Enter name of file /directory");
filename=input.nextLine();
 File f1=new File(filename);
 System.out.println("File Name:"+f1.getName());
 System.out.println("Path:"+f1.getPath());
 System.out.println("Abs Path:"+f1.getAbsolutePath());
 System.out.println("Parent:"+f1.getParent());
 System.out.println("This file is:"+f1.exists()+"Exists Does not exists");
 System.out.println()
	}

}
