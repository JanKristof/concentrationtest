package frames;

public class numbers {
	static int[][] number = new int[9][9];
	
	public static int check(int col, int row){	
		number[col][row]=(int) (Math.random() * (9 - 1) + 1);
		return (int) number[col][row];
	}
		
	public static int readarray(int col, int row){	
		return (int) number[col][row];	
	}
}