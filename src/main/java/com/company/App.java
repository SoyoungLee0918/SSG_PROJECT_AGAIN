package com.company;

import java.util.Scanner;

public class App {
    private Scanner sc;
    public App(){
        sc = new Scanner(System.in);
    }

    public void run(){
        System.out.println("== 명언 SSG==");
        WiseSayingController wiseSayingController = new WiseSayingController(sc);

        outer:
        while(true){
            System.out.print("명령) ");
            String cmd = sc.nextLine();

            Rq rq = new Rq(cmd);
            switch (rq.getPath()){
                case "등록" :
                    wiseSayingController.add();
                    break;

                case "수정" :
                    wiseSayingController.modify();
                    break;

                case "삭제" :
                    wiseSayingController.delete();
                    break;

                case "목록" :
                    wiseSayingController.list();
                    break;

                case "종료" :
                    break outer;
            }
        }
        sc.close();
    }

}
