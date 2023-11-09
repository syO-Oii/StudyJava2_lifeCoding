package Chap_01;

public class _02_MethodInOut {
    // 생활코딩 57 ~ 59번
    // https://youtu.be/pn0lcF88XIM?si=vsU6aiisI0zi2GsO
    // 메소드의 입력과 출력

    // 변수 init과 limit의 데이터 형식을 정의 (int 형)
    //  => 입력값은 int로만 받겠다는 의미
    // 이때 입력받는 변수를 매개변수(parameter)라고 함
    public static String numbering(int init, int limit){
        int i = init;
        // 만들어지는 숫자들을 output에 담기 위해 변수 초기화
        String output = "";

        while (i < limit) {
            output += (i + " ");
            i++;
        }
        return output;
    }

    public static void main(String[] args) {
        // numbering 메소드에 인자(argument) 1, 5를 전달
        System.out.println(numbering(1,5));
    }
}
