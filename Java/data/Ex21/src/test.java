import java.util.Iterator;

public class test {

	public static void main(String[] args) {
//		String[][] arrStr = new String[20][20];
//		arrStr[9][9] = "KOR";
//		arrStr[8][10] = "JPN"; 
//		arrStr[7][8] = "CHN"; 
//		arrStr[4][17] = "USA";
//		arrStr[10][18] = "MEX";
//		arrStr[17][10] = "AUS";
//		arrStr[1][10] = "RUS";
//		arrStr[3][1] = "ENG";
//		arrStr[5][3] = "ITY";
//		
//		for(int i = 0; i < arrStr[0].length; i++) {
//			for (int j = 0; j < arrStr.length; j++) {
//				if(arrStr[i][j] == null) {
//					System.out.print("╋━━");
//				}
//				else {
//					System.out.print(arrStr[i][j]);
//				}
//			}
//			System.out.println();
//		}
		
		int[][] arrSeat = new int[12][10];
		for(int i = 0; i < 15; i++) {
			for (int j = 0; j < 10; j++) {
				if(j == 3) {
					System.out.print(" ");
					System.out.print("ㅁ");
				}
				else if(j == 7) {
					System.out.print(" ");
					System.out.print("ㅁ");
				}
				else {
					System.out.print("ㅁ");
				}
			}
			System.out.println();
		}
		
	}

}
