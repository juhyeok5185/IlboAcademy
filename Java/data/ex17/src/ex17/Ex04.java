package ex17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Ex04Uswer> arrUser = new ArrayList<>();
        while (true) {
            System.out.println("1.회원등록 2.검색");
            System.out.println("메뉴선택 : ");
            int menuNum = scanner.nextInt();
            scanner.nextLine();
            switch (menuNum) {
                case 1:
                    System.out.println("이름 : ");
                    String name = scanner.nextLine();
                    System.out.println("면허종류 : ");
                    String license = scanner.nextLine();
                    Ex04Uswer user = new Ex04Uswer(name, license);
                    arrUser.add(user);
                    System.out.println("등록완료");
                    break;
                case 2:
                    System.out.println("검색 : ");
                    String serchLicense = scanner.nextLine();
                    for (Ex04Uswer ex04Uswer : arrUser) {
                        if (ex04Uswer.getLicense().contains(serchLicense)) {
                            System.out.println(ex04Uswer.toString());
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
