package frames;

public class numbers {
//	static int[][] number = new int[6][5];
//	static int i;		//Laufvariable 1.For-Schleife
//	static int j;		//laufvariable 2.For-Schleife
//	
//	public static int check(int col, int row){
//		
//		for (i=0; i<=6; i++){
//			for (j=0; j<=5; j++){
//				number[i][j]=(int) (Math.random() * (9 - 1) + 1);
//			number[i][j]=getRandom(1,9);
//			}
//		}
//		return (int) number[col][row];
//	}
	
	public static String getRandom(int min, int max) {
		int rndm=  (int) (Math.random() * (max - min) + min);
		return String.valueOf(rndm);
	}
}
