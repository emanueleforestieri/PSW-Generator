
/**
 * @author Emanuele Forestieri
 * @version 0.1.0 [01/05/2016]
 */

public class PSWGen {

	public static void main(String[] args) {
		
		if(args.length<1) {
			System.err.println("[!] You must enter at least one string");
			System.exit(1);
		} 
		
		System.out.print("[+] Password: ");
		Generator g[] = new Generator[args.length];
		
		for(byte i = 0; i < args.length; i++) {
			g[i] = new Generator(args[i]);
			g[i].start();
		}	
	}
}
