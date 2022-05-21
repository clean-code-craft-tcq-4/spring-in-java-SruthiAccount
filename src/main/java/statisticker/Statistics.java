package statisticker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Statistics {
	public static class Stats {

		public Float min;
		public Float average;
		public Float max;

	}

	public static Stats getStatistics(List<Float> numbers) {
		// implement the computation of statistics here
		Stats s = new Stats();
		if (numbers.size() == 0) {
			s.min = Float.NaN;
			s.max = Float.NaN;
			s.average = Float.NaN;
		} else {
			s.min = Collections.min(numbers);
			s.max = Collections.max(numbers);
			Float sum = numbers.stream().reduce((float) 0, Float::sum);
			s.average = sum / numbers.size();
		}
		return s;

	}

}
