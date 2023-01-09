package Project;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Question;;

public class Game {
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	List<Question> arrQuestion = new ArrayList<>();
	Question question = new Question();

	public void quiz(Member mem, MDAO mdao) {
		System.out.println(mem.getName());
		int cnt = 0;
		boolean start2 = true;

		question = new Question();
		question.setQuestion("바보");
		question.setAnswer("바보");
		arrQuestion.add(question);

		question = new Question();
		question.setQuestion("바보2");
		question.setAnswer("바보2");
		arrQuestion.add(question);

		question = new Question();
		question.setQuestion("바보3");
		question.setAnswer("바보3");
		arrQuestion.add(question);

		question = new Question();
		question.setQuestion("바보4");
		question.setAnswer("바보4");
		arrQuestion.add(question);

		question = new Question();
		question.setQuestion("바보5");
		question.setAnswer("바보5");
		arrQuestion.add(question);

		System.out.println("퀴즈게임 시작\n[x=포기]");
		System.out.println("몇 문제 푸실겁니까?");
		int cc = sc.nextInt();
		sc.nextLine();
		while (start2) {
			for (int i = 0; i < cc; i++) {
				rn = new Random();
				int num = rn.nextInt(5);
				System.out.println(arrQuestion.get(num).getQuestion());
				System.out.print("정답 : ");
				String quiz = sc.nextLine();
				if (quiz.equals("x")) {
					System.out.println("게임포기");
					start2 = false;
					break;
				}
				if (quiz.equals(arrQuestion.get(num).getAnswer())) {
					cnt = cnt + 1;
					System.out.println("정답");
				}
				if (i == cc) {
					start2 = false;
					System.out.println("게임종료!");
				}
			}
			break;
		}
		mem.setPoint(mem.getPoint() + (cnt * 10));
		System.err.println("획득포인트 : " + (cnt * 10) + "점");
		System.out.println("정답횟수 : " + cnt);
	}
}
