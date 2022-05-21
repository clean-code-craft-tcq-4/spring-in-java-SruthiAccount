package statisticker;

public class EmailAlert implements IAlerter {

	public boolean emailSent;

	public boolean sendAlert() {
		emailSent = true;
		return emailSent;
	}

}
