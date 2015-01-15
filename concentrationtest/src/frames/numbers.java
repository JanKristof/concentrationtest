package frames;

public class numbers {
	static int[][][] number = new int[10][7][6];

	public static int check(int blog, int col, int row) {
		number[10 - blog][col][row] = (int) (Math.random() * (9 - 1) + 1);
		return (int) number[10 - blog][col][row]; // Zahl 9 müsste geändert werden, falls die blog anzahl erhöht wird
	}

	public static int readarray(int blog, int col, int row) {
		return (int) number[10 - blog][col][row];
	}
}