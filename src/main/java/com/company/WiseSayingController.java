package com.company;

import java.util.Scanner;

public class WiseSayingController {
    private Scanner sc;
    private WiseSayingRepository wiseSayingRepository;

    public WiseSayingController(Scanner sc){
        this.sc = sc;
        wiseSayingRepository = new WiseSayingRepository();
    }
    public void add() {
        System.out.println("등록완");
    }

    public void modify() {
        System.out.println("수정완");
    }

    public void delete() {
        System.out.println("삭제완");
    }

    public void list() {
        System.out.println("목록출력완");
    }
}
