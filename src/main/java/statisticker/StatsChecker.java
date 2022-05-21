package statisticker;

public class StatsChecker {

	float maxThreshold;
	IAlerter alerters[];

	public StatsChecker(float maxThreshold, IAlerter[] alerters) {
		this.maxThreshold = maxThreshold;
		this.alerters = alerters;
	}

	public void checkAndAlert(Float[] numbers) {
		for (float number : numbers) {
			if (number > maxThreshold) {
				for (IAlerter a : alerters)
					a.sendAlert();
			}
		}

	}

}
