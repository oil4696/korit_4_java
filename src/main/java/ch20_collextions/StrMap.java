package ch20_collextions;

import java.util.*;

public class StrMap {
    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>();

        // Map에[ Key value 쌍 삽입 -> put (키; 값);
        strMap1.put("kor2025001" , "김일");
        strMap1.put("kor2025002" , "김이");
        strMap1.put("kor2025003" , "김삼");
        strMap1.put("kor2025004" , "김사");

        strMap1.put("kor2025005" , "김오");

        //Map출력
        System.out.println(strMap1);

        strMap1.put("kor20250005", "Kimfive");
        System.out.println(strMap1);
        //Map의 특징중 하나로 하나으 ㅣkeyㅔㅇ는 하나의 value 만 가능합니다
        // 그래서 key값이 동일하다면 value값은 최신ㅇ 것을 ㅗ덮어쓰기 됩니다

        //list의 격우 엔 특정 인ㄱ데스를 ㅈ보회하고 싶다면
        // 리스트명.get(인데스넘버)의 형태로 확인할 수 있었ㅅ브니다
        // map의 경우느,ㄴ 순서ㅏ는 없느 대신 key가 있기 때무에


        // 특정 keyu의 갑의 value 조회
        System.out.println(strMap1.get("kor2025002"));
        //이상고ㅓㅏ 같은 바업으로 출력ㅇ ㅣ가능ㅎ바니다.-> value만 나옺쇼

        // java-> map에서의 key-value pair룰 entry라고 칭합니다.

        //특정 키의 값 수정 #1 -> 아까 본 것처럼 .put(키)를 통해 덮어쓰기
        strMap1.put("2kor2025001","kimOne");

        //측정 키의 값 수정 #2 -> replace
        strMap1.replace("kor2025002", "kimTwo");
        System.out.println("kor2025002");

        // ㅊ트적ㅇ 키의 존재 여ㅛ부 -> containsKey(); -> boolean
        boolean searchkeyFlag1 = strMap1.containsKey("kor2025006");
        System.out.println("kor2025006 존재여부: " + searchkeyFlag1);

        // 특정 값 존재 여부 - > conatqaionsValue(); -> boolean
        boolean searchkeyValue1 = strMap1.containsKey("김삼");
        System.out.println("김삼 존재 여부 : " + searchkeyFlag1);

        // map의 엔트리로 부터 set을 생성
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();     //비어있는 setㅇ생성
        Set<Map.Entry<String, String>> entrySet2 = strMap1.entrySet();  // map의 딛
        System.out.println(entrySet1);
        System.out.println(entrySet2);
        System.out.println(entrySet2.size());

        List<Map.Entry<String, String>> entrylist1 = new ArrayList<>();
//        List<Map<String, String>> entrylist1 = setMap1.entrySet();    // Map -> List 대입이 불간으하다는 걸 보여주는 예시
        // 결국 Map에서 List로의 형변ㅇ환을 하고 싶다면 set을 경유해야합니다.
        entrylist1.addAll(entrySet2);
        System.out.println(entrylist1);

        // 그러면 sort가 간으하겠죠

        // key set 출려
        Set<String> keySet = strMap1.keySet();      // 그러면 ㅏ됴 의 자료형과 제네릭 자료형이 같아요죠
        System.out.println(keySet);

        //Valie Set 출력
//        Set<String> valueSet = strMap1.values(); // 오류 발ㄹ생 예시 -> 필요한 탕비 Set/ 제공된 타입 coollection
        // 이상에서ㅏ 문제가 발생하느 ㄴ이유는 key  의어차피 중복을 허요ㅕㅇ하지 ㅇ낳기 때문에 Set으로 형변환이 가능한 반번
        // 복수의 key에서 동잏ㄹ한 value가 존재할 수 있기 때문에 Set으로 생성하는 ㄱ섯이 불간읗바니다.
        Collection<String> values = strMap1.values();
        System.out.println(values);         // 그와중에 .sort 할때 처험 collecvtions가 아니라 Collection입니다
    }
}

//