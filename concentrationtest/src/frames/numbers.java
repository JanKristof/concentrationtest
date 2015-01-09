package frames;

public class numbers {
	static int[][] number = new int[9][9];
	static int i;		//Laufvariable 1.For-Schleife
	static int j;		//laufvariable 2.For-Schleife
	
	public static int check(int col, int row){	
		number[col][row]=(int) (Math.random() * (9 - 1) + 1);
		return (int) number[col][row];
	}
	
	
//	public static String getRandom(int min, int max) {
//		int rndm=  (int) (Math.random() * (max - min) + min);
//		return String.valueOf(rndm);
//	}
	
	
	public static int readarray(int col, int row){
			
		return (int) number[col][row];	
	}
}