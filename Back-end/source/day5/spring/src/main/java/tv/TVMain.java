package tv;

public class TVMain {

	public static void main(String[] args) {
		TV tv = TVFactory.getTV(args[0]);
		tv.powerOn();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
	}
}
