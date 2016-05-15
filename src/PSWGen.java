
/**
 * @author Emanuele Forestieri
 * @version 0.2.0 [15/05/2016]
 */

public class PSWGen {

	public static void main(String[] args) {
		
		if(args.length<1) {
			System.err.println("[!] You must enter at least one string");
			System.exit(1);
		} 
		
		System.out.print("[+] Password: ");
		
		for(byte i = 0; i < args.length; i++) {
			new Generator(args[i]).start();
		}	
	}
}
