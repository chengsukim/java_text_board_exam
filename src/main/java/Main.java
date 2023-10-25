import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" == 프로그램 시작 == ");
        Scanner sc = new Scanner(System.in);
        long lastId = 0;
        long id = 0;
        List<Article> articleList = new ArrayList<>();
        while(true){
            System.out.printf("명령어) ");
            String command  = sc.nextLine();
            if(command.equals("종료")){
                System.out.println("시스템을 종료합니다.");
                break;
            } else if (command.equals("회원가입")) {
                String userId;
                String password;
                String passwordConfirm;

                while(true){
                    System.out.printf("아이디) ");
                    userId = sc.nextLine();
                    System.out.printf("비번) ");
                    password = sc.nextLine();
                    System.out.printf("비번 확인) ");
                    passwordConfirm = sc.nextLine();

                    System.out.println(userId + "님 회원가입이 완료되었습니다.");


                    break;
                }




            } else if (command.equals("로그인")) {
                System.out.printf("아이디) ");
                String userId = sc.nextLine();
                System.out.printf("비번) ");
                String password = sc.nextLine();




            } else if (command.equals("등록")) {
                lastId++;
                System.out.printf("제목 : ");
                String title = sc.nextLine();
                System.out.printf("내용 : ");
                String content = sc.nextLine();

                Article article = new Article(lastId , title , content);
                articleList.add(article);
                System.out.println(lastId + "번 게시글이 등록되었습니다.\n");

            } else if (command.equals("목록")) {
                if(articleList.size() == 0){
                    System.out.println("게시물이 없습니다.");

                }else {
                    System.out.println("번호 / 제목 / 내용\n ");
                    for(int i = 0; i < articleList.size(); i++) {
                        Article article = articleList.get(i);
                        System.out.printf("%d / %s / %s\n " , article.id , article.title , article.content);
                    }
                }

            } else if (command.equals("삭제")) {

                System.out.printf("삭제번호) ");
                System.out.println(id + "번 게시글이 삭제되었습니다.");

            }
        }
    }
}
