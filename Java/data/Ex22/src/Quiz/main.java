package Quiz;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		QuizDAO quizDAO = new QuizDAO();
		quizDAO.inputQuiz();
		while (run) {
			System.out.println("1.퀴즈 2.종료");
			int menuNum = scanner.nextInt();
			switch (menuNum) {
			case 1:
				quizDAO.game();
				break;
			case 2:
				run = false;
				break;
			default:
				System.out.println("없는번호");
				break;
			}
		}
	}
}
