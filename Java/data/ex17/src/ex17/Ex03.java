package ex17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Ex03Item> arrEx03 = new ArrayList<>();
        boolean run = true;
        while (run) {
            System.out.println("1.등록 2.리스트 3.상품검색 4.상품수정 5.종료");
            int mainMenu = scanner.nextInt();
            scanner.nextLine();
            switch (mainMenu) {
                case 1:
                    Ex03Item ex03 = new Ex03Item();
                    System.out.println("상품명 : ");
                    ex03.setItemName(scanner.next());
                    System.out.println("가격 : ");
                    ex03.setPrice(scanner.nextInt());
                    System.out.println("수량 : ");
                    ex03.setEa(scanner.nextInt());
                    arrEx03.add(ex03);
                    break;
                case 2:
                    System.out.println("상품명\t가격\t수량");
                    for (Ex03Item ex03Item : arrEx03) {
                        System.out.println(ex03Item.toString());
                    }
                    break;
                case 3:
                    System.out.println("1.상품명 2.가격 3.수량");
                    System.out.println("메뉴선택 : ");
                    int mainMenu2 = scanner.nextInt();
                    scanner.nextLine();
                    switch (mainMenu2) {
                        case 1:
                            System.out.println("상품명 : ");
                            String name = scanner.nextLine();

                            for (Ex03Item ex03Item : arrEx03) {
                                if (ex03Item.getItemName().contains(name)) {
                                    System.out.println(ex03Item.toString());
                                }
                            }
                            // for (int i = 0; i < arrEx03.size(); i++) {
                            // if (arrEx03.get(i).getItemName().contains(name)) {
                            // System.out.println(arrEx03.get(i).toString());
                            // }
                            // }
                            break;
                        case 2:
                            System.out.println("가격 : ");
                            int price = scanner.nextInt();
                            scanner.nextLine();
                            for (Ex03Item ex03Item : arrEx03) {
                                if (ex03Item.getPrice() == price) {
                                    System.out.println(ex03Item.toString());
                                }
                            }
                            // for (int i = 0; i < arrEx03.size(); i++) {
                            // if (arrEx03.get(i).getPrice() == price) {
                            // System.out.println(arrEx03.get(i).toString());
                            // }
                            // }
                            break;
                        case 3:
                            System.out.println("수량 : ");
                            int ea = scanner.nextInt();
                            scanner.nextLine();
                            for (Ex03Item ex03Item : arrEx03) {
                                if (ex03Item.getEa() == ea) {
                                    System.out.println(ex03Item.toString());
                                }
                            }
                            // for (int i = 0; i < arrEx03.size(); i++) {
                            // if (arrEx03.get(i).getEa() == ea) {
                            // System.out.println(arrEx03.get(i).toString());
                            // }
                            // }
                            break;
                    }
                    break;
                case 4:

                    for (Ex03Item ex03Item : arrEx03) {
                        System.out.println(ex03Item.toString());
                    }
                    System.out.println("변경하실 삼품명 : ");
                    String selectItemName = scanner.nextLine();
                    System.out.println("1.상품명 2.가격 3.수량 4.삭제");
                    System.out.println("선택 : ");
                    int menuNum3 = scanner.nextInt();
                    scanner.nextLine();
                    switch (menuNum3) {
                        case 1:
                            for (Ex03Item ex03Item : arrEx03) {
                                if (ex03Item.getItemName().contains(selectItemName)) {
                                    System.out.println("변경하실 상품명 : ");
                                    String changeItemName = scanner.nextLine();
                                    ex03Item.setItemName(changeItemName);
                                    System.out.println("변경이 완료되었습니다.");
                                    break;
                                }
                            }
                            break;
                        case 2:
                            for (Ex03Item ex03Item : arrEx03) {
                                if (ex03Item.getItemName().contains(selectItemName)) {
                                    System.out.println("변경하실 가격 : ");
                                    int changePrice = scanner.nextInt();
                                    ex03Item.setPrice(changePrice);
                                    System.out.println("변경이 완료되었습니다.");
                                    break;
                                }
                            }
                            break;
                        case 3:
                            for (Ex03Item ex03Item : arrEx03) {
                                if (ex03Item.getItemName().contains(selectItemName)) {
                                    System.out.println("변경하실 수량 : ");
                                    int changeEa = scanner.nextInt();
                                    ex03Item.setEa(changeEa);
                                    System.out.println("변경이 완료되었습니다.");
                                    break;
                                }
                            }
                            break;
                        case 4:
                            for (Ex03Item ex03Item : arrEx03) {
                                if (ex03Item.getItemName().contains(selectItemName)) {
                                    arrEx03.remove(ex03Item);
                                    System.out.println("삭제가 완료되었습니다.");
                                    break;
                                }
                            }
                            break;
                        default:
                            System.out.println("없는번호");
                    }

                    break;
                case 5:
                    run = false;
                    break;
                default:
                    System.out.println("없는번호");
                    break;
            }
        }
    }
}
