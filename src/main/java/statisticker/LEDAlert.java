package statisticker;

public class LEDAlert implements IAlerter {
	public boolean ledGlows;

	public boolean sendAlert() {
		ledGlows = true;
		return ledGlows;
	}

}
