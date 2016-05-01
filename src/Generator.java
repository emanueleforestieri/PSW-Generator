import java.util.Random;

public class Generator extends Thread {
	
	public Generator(String name) {
		super(name);
	}
	
	public void run() {
		for(byte i = 0; i < this.getName().length(); i++)
			System.out.print(this.getName().charAt(new Random().nextInt(this.getName().length())));
	}
}
