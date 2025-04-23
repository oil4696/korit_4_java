package ch07_loops;
/*
    for(int i = 0 ; i < 10 ; i ++
    (반복실행문 1-a)
    for(int k = 0 l j <10 ; j ++) {
    반복실행문
    }
    (반복실행문1-b)
    랙(ㅑㅜㅅ ㅏ= 0 ; ㅏ<  10 ; ㅏ++) {
    qksqhrtlfgodans3
    }
    (반복실행문1-c)
 */
public class Loop06 {
    public static void main(String[] args) {
        for(int i = 0 ; i < 5 ; i++) {
            for(int j = 0 ; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
