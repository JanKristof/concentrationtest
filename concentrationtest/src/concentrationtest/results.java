package concentrationtest;

public class results {

	static int corrects = 0;

	public int showresults() {

		return 0;
	}

	public static void addcorrectanswer() {
		corrects++;
	}

	public static String getcorrectanswers() {
		return String.valueOf(corrects) + " von maximal "
				+ String.valueOf(7 * 10); // 10 = Blogs
	}

	public static String getcorrectanswerspercentage() {
		return String.valueOf("das entspricht: " + Math.round((double) corrects / 7 * 10)) + " %";
	}
}
