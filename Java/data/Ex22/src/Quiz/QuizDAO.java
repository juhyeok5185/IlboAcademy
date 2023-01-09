package Quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import FileExam.Item;

public class QuizDAO {
	File file = new File("C:/temp/quiz.txt");
	Quiz quiz = new Quiz();
	List<Quiz> arrQuiz = new ArrayList<>();
	int cnt = 0;

	public void game() {
		try {
			Scanner scanner = new Scanner(System.in);
			Reader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			String data;
			while ((data = br.readLine()) != null) {
				String[] wSplit = data.split(",");
				System.out.println(wSplit[0]);
				String answer = scanner.next();
				if (answer.equals(wSplit[1])) {
					System.out.println("정답입니다.");
				}
				else {
					System.out.println("오답입니다.");
				}
			}
		} catch (Exception e) {
			System.out.println("에러");
		}
	}

	public void inputQuiz() {
		String[] problem = new String[20];
		problem[0] = "직장에서 가장 무서운 상사는?";
		problem[1] = "가장 급하게 만든 떡은?";
		problem[2] = "사람들이 가장 좋아하는 영화는?";
		problem[3] = "물 없는 사막에서도 할 수 있는 물놀이는?";
		problem[4] = "비가 올 때 하는 욕은?(영어 대문자 3글자)";
		problem[5] = "신이 화가 나면?";
		problem[6] = "세상에서 가장 뜨거운 바다는?";
		problem[7] = "울다가 다시 웃는 사람을 다섯 글자로?";
		problem[8] = "다리미가 좋아하는 음식은?";
		problem[9] = "세상에서 가장 뜨거운 과일은?";
		problem[10] = "중학생과 고등학생이 타는차는?";
		problem[11] = "약은 약인데 아껴먹어야 하는 약은?";
		problem[12] = "별 중에 가장 슬픈 별은?";
		problem[13] = "아몬드가 죽으면?";
		problem[14] = "곤충의 몸을 3등분하면?";
		problem[15] = "오백에서 백을 빼면?(숫자 입력)";
		problem[16] = "이상한 사람들이 모이는 곳은?";
		problem[17] = "진짜 새의 이름은 무엇인가?";
		problem[18] = "소가 처음 만났을 때 하는 말은?";
		problem[19] = "가장 무서운 전화는?";
		String[] answer = new String[20];
		answer[0] = "불상사";
		answer[1] = "헐레벌떡";
		answer[2] = "부귀영화";
		answer[3] = "사물놀이";
		answer[4] = "BYC";
		answer[5] = "신발끈";
		answer[6] = "열바다";
		answer[7] = "아까운사람";
		answer[8] = "피자";
		answer[9] = "천도복숭아";
		answer[10] = "중고차";
		answer[11] = "절약";
		answer[12] = "이별";
		answer[13] = "다이아몬드";
		answer[14] = "죽는다";
		answer[15] = "5";
		answer[16] = "치과";
		answer[17] = "참새";
		answer[18] = "반갑소";
		answer[19] = "무선전화";

		for (int i = 0; i < answer.length; i++) {
			quiz = new Quiz();
			quiz.setQuestion(problem[i]);
			quiz.setAnswer(answer[i]);
			arrQuiz.add(quiz);

			try {
				Writer wirter = new FileWriter(file, true);
				BufferedWriter bw = new BufferedWriter(wirter);
				bw.write(quiz.toString() + "\n");
				bw.flush();
				bw.close();
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
