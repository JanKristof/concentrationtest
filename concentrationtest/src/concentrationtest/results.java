package concentrationtest;

public class results {

	static int corrects = 0;
	static float[] time = new float[70];
	static int h = 0;
	static float timeresult = 0;

	public static void addcorrectanswer() {
		corrects++;
	}

	public static String getcorrectanswers() {
		return String.valueOf(corrects) + " von maximal "
				+ String.valueOf(7 * 10); // 10 = Blogs
	}

	public static String getcorrectanswerspercentage() {
		return "das entspricht: "
				+ String.valueOf(Math.round((double) (corrects / 7 * 10) * 100) / 100)
				+ " %";
	}

	public static void addtime(float timedifference) {
		time[h] = timedifference;
		h++;
	}

	public static String gettime() {
		for (int i = 0; i < 70; i++)
			timeresult += time[i];
		return String.valueOf(timeresult / 70);
	}
}
