import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DecoratorTester {

	public static void main(String[] args) throws IOException
	{
		File file = new File("test.txt");
		EncryptingWriter er = new EncryptingWriter(new FileWriter(file));
		
		String test = "HELLO WORLD";
		try {
			er.write(test,0,test.length());
			Scanner sc = new Scanner(file);
			er.close();
			System.out.println(sc.nextLine());
		DecryptingReader dr = new DecryptingReader(new FileReader(file));
		char[] data = new char[test.length()];
		dr.read(data,0,test.length());
		dr.close();
		System.out.println(data);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
	
		
	}
}
