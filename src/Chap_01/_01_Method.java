package Chap_01;

public class _01_Method {
    // 생활코딩 자바 입문 수업 54번부터 새로 시작
    // https://youtu.be/54hrXAyYUGo?si=DRFlBe4-LtetDid3

    // 메인은 자바 언어 - 개발자 간의 약속 같은 개념
    // main의 본문에 우리의 주 작업 내용을 위치 시키기로 약속
    // 약속과 이해의 영역을 구분할 줄 알아야 함
    // 약속 : 지켜야 하는 부분
    // 이해 : ?


    public static void main(String[] args) {
        // 0 ~ 9까지를 5번 출력하는 프로그램 만들기
        // 메소드가 없다면
        // 아래처럼 같은 동작의 코드를 여러번 입력해야 함
//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }


        // 메소드를 만들면 코드가 단순해짐
        // 메소드의 특징
        // 1) 재활용 가능 : 이미 정리해둔 로직을 재활용 가능
        // 2) 코드량 축소
        // 3) 유지보수에 유리함 -> 메소드 내의 코드를 수정하면 해당 메소드를 호출하는 전체 코드에 적용 되기 때문
        
        numbering();
        numbering();
        numbering();
        numbering();
        numbering();
    }


    public static void numbering(){
        int i = 0;
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }


}
