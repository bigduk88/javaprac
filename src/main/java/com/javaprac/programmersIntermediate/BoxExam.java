package com.javaprac.programmersIntermediate;

public class BoxExam {
    public static void main(String[] args) {
//        Box box = new Box();
//        box.setObj(new Object());
//        Object obj = box.getObj();
//
//        box.setObj("hello");
//        String str = (String) box.getObj();
//        System.out.println(str);
//
//        box.setObj(1);
//        int value = (int) box.getObj();

        Box<Object> box = new Box<>();        // 어떤 오브젝트든 받아들여서 사용 가능
        box.setObj(new Object());
        Object obj = box.getObj();

        Box<String> box2 = new Box<>();         // 매번 형변환 할 필요 없음
        box2.setObj("hello");
        String str = box2.getObj();

        Box<Integer> box3 = new Box<>();
        box3.setObj(4);
        int v2 = box3.getObj();
    }
}