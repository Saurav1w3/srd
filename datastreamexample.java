import java.io.FileInputStream;
public class datastreamexample {

	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("M:\\testout.txt");
			int i =fin.read();{
			System.out.print((char)i);
			}
			while ((i=fin.read())!=-1){
			System.out.println((char)i);
			}
		 fin.close();
		 
				}catch(Exception e) {System.out.println(e);

	}

}
}
