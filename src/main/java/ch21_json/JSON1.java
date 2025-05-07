package ch21_json;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class JSON1 {
    public static void main(String[] args) {
        // jsonObject 클래스의 인스턴스 생성
        JsonObject jsonObject1 = new JsonObject();
        // 속성(key- value entyr )dm 을 추가하는 메서드 ->? addProperty() 사용합니다
        jsonObject1.addProperty("userName", 1);
        jsonObject1.addProperty("passwird", 1234);
        jsonObject1.addProperty("email", "a@teat.com");
        jsonObject1.addProperty("name", "김일");

        System.out.println(jsonObject1);
        /*
        {"userName":1,"passwird":1234,"email":"a@teat.com","name":"김일"}
            이상의 콘솔창에서의 결과ㅂㄱ밧을 Java Map 과 비교해보자면
            1. map에느 key부분에""가 ㅇ벗고,
                jsonm에서는 모든 key가 Striung잘효형차ㅓ러ㅏㅁ보이도록""가 있습니다

                2. map에서는 key1 + balue1의 형태로 작성되어있었지만
                    json에서는 "key1":"vale1의 형태로 작성되어있습니다.
         */
        jsonObject1.addProperty("job", "코리아아이티아카데미국비강사");
        System.out.println(jsonObject1);
        /*
            콘솔에 출려도ㅓㅣㄴ 값을 확인해보면 한 줄로 길게 늘러져 있습니다.
            addProperty()를 통앻 키-값 쌍을 늘릴 ㅅ ㅜ록 계속 기렁져서 가동석을 해치게 될 ㄱ섯을 ㅗ보입니다.
            md파일에서 작성한 것처험 key:vlaue 마다 개행이 이루어지면 나올 것 같습니다
            이때 사용하는 것이 Gson과련 클래스입니다.
         */
//        Gson gson = new Gson().setPrettyPrinting().create;
//        String json = gson.toJson(jsonObject1);
//        System.out.println(json);

    }
}
