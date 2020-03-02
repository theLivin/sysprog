import java.io.Console;

public class Test{
	public static void main(String[] args){
		Console cons = System.console();
		String username = cons.readLine("Username: ");
		char[] password = cons.readPassword("Password: ");
	}
}