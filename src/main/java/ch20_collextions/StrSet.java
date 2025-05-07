package ch20_collextions;

import java.util.*;

/*
    list는 순서가 있고 중보ㅓㄱ을 허용하는 반명에 set는 순서는 없고 , 중복도 허용하지 않습니다.
    (수학에서의 집합 개념을 Collectin으로 구현한 것이 set에 해당합니다.)
    글해서 특성으ㅢ 차이로 읺래 list -> set. set -> List를의 형변환이 매우 중요합니다.
    ㅣㅑㄴㅅ를  ㅌ오해 전체 설문을 받고 srt을 통해 중복을 제거하여 후보군듦나 남기는 등의 응용이 가능하기 때문에, 혹은 set을 list로 바꿔 .get(인덱스 넘버)
    를 통해 조화ㅣ를 하기 위하  서오간의 형뵨환이 매중요합니다
 */
public class StrSet {
    public static void main(String[] args) {
        //set r객체 생성
        Set<String> strSet1 = new HashSet<>();
        // 형변환이 중용하다고 했습니까 list도 하나 만들어두겠습니다.
        List<String> strList1 = new ArrayList<>();

        // set에 element 삽입 -> ,add();
        strSet1.add("java");
        strSet1.add("java");
        strSet1.add("java");
        strSet1.add("java");
        strSet1.add("python");
        strSet1.add("python");
        strSet1.add("python");
        strSet1.add("python");
        strSet1.add("1");
        strSet1.add("1");
        strSet1.add("2");
        strSet1.add("2");
        strSet1.add("3");
        strSet1.add("3");

        //set의 출력
        System.out.println(strSet1);

        for (String elem : strSet1){    // 향상된 for문을 통해 element 를 출력하는 것은 가능
            System.out.println(elem);
        }

//        for (int i = 0 ; i < strSet1.size() ; i++){
//            System.out.println(strSet1.get(i));
//        }                                             // 얘는 Set 상황에서는 작성이 좀 애매합니다.

        // 특정 element를 추출 -> list 로의 형변환을 할겁니다.
        strList1.addAll(strSet1);   // strlist1에 strset의 모든 elemet들을 더한다는 의미
        for (int i = 0 ; i < strList1.size(); i++){
            System.out.println(strList1.get(i));
        }


        strList1.addAll(strSet1);
        strList1.addAll(strSet1);
        System.out.println("중복으로 더하고 난 후");
        for (int i = 0 ; i < strList1.size() ; i++){
            System.out.println(strList1.get(i) + " ");
        }

        System.out.println();
        //set은 순서가 없으니가 stor가 의마가 없짐나 list는 의미가 있죠
        Collections.sort(strList1);
        System.out.println(strList1);

        //역순 정렬
        Collections.sort(strList1, Collections.reverseOrder());
        System.out.println(strList1);

        //새로운 srt을 선언해서 다시 strlist에 있는 붑분을 다 덯래버리면 중복이 재거되겠네요
        Set<String> strSet2 = new HashSet<>();
        strSet2.addAll(strList1);
        System.out.println(strSet2);


    }
}
