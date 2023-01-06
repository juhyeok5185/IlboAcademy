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
		String[][] arrSeat = new String[7][5];
		for(int i = 0 , x = 7; i < arrSeat.length; i++ , x--) {
			for (int j = 0; j < arrSeat[i].length; j++) {
					arrSeat[i][j] = "□ "+ (j+1) + "호 ";
					System.out.print(arrSeat[i][j]);
			}
			System.out.print("┃ " + x+"층");
			System.out.println();
		}
		
		int floor = 3;
		int room = 4;
		
		for(int i = 0 , x = 7; i < arrSeat.length; i++ , x--) {
			for (int j = 0; j < arrSeat[i].length; j++) {
				if(x == floor && j == room) {					
					arrSeat[i][j] = "■ "+ (j+1) + "호 ";
				}
				System.out.print(arrSeat[i][j]);
			}
			System.out.print("┃ " + x+"층");
			System.out.println();
		}
		
		
	}

}
