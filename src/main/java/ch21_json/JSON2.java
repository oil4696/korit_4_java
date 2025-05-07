package ch21_json;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Setter
class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON2 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        // 아까 와 동잃하게 gsonBilder를 통해서 prettyPainting이 적용될 ㅅ ㅜ이;ㅆ도록 인스턴스를 생성

        // 사용할 변수 선언
        String userJson = null;

        // 1. Java Object -> json으로 변환
        // uswer1 객체를 생성하고 "kim1", "9876", "a@test.com","r길일","20"로 입렵하시오

        User user1 = new User();
        // 그럼 생성된 user1 인스턴스를 가지고 Json 데이터로 바꿀겁니다.
        userJson = gson.toJson(user1);
        System.out.println("gson 사용 경과괎 : ");
        userJson = gsonBuilder.toJson(user1);
        System.out.println("gsonBuilder 사용 결과값 : ");

        // 2. JsonObject -> json으로 변환 근데 저희가 Json에서 햇던겁니다.
        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("studentCode ","2025001");
        jsonObject1.addProperty("studentName ","김이");
        jsonObject1.addProperty("studentYear ","2");
        jsonObject1.addProperty("score ","96.7");

        String studentJson = gson.toJson(jsonObject1);
        System.out.println(studentJson);
        // gson 및 gsonBilder를 이용하여 studentJson을 두번 줓력결곽밧을 콘솔창에 띄울 ㅅ ㅜ있도록 하시오
        studentJson = gsonBuilder.toJson(jsonObject1);
        System.out.println(studentJson);

        // map -> Json 데이터로
        /*
            map을 활용하여key String /value String으로 선언하고 객체명을 map1으로 한번 map으로 생성하시오.

            map에 ㅔproductCode NT960XHA-KD0726
            productNAme 삼성 갤럭시 북 프로5
            라는 entry(key-value-pair)를 입력하시오

         */

        Map<String, String> map1 = new HashMap<>();
        map1.put("productCord","NT960XHA-KD0726");
        map1.put("productName","삼성 갤럭시 북 프로 5");

        System.out.println("gson 사용 사례 : " + gson.toJson(map1));
        System.out.println("gsonBuilder 사용 사례  : " + gsonBuilder.toJson(jsonObject1));  //하는 김에 Json 데이터ㄹ들의 자료형ㅇ ㅣ전부 String 인것에 주목해야합니다.

        // 그러핟면 json - map / jvav 객체 자료형을 ㅗ바꾸려면 어떨해야 할까요
        // 즉 json 데이터를 user객체로 다시 바꾸는 것과
        // json 데이터를 amp2 형태로ㅈ가성하는 것을 의미합니다.
        // 형식 :
        // gson.fromJson(제이슨데이터, 바꾸자하는 클래스 형태

//        Map<String, String>map2 = gson.fromJson(productJson,Map.class); //gsonBuilder.새String(map1)d이든
//        System.out.println(map2);

        // json -> User zmffotmdml dlstmxjstmfh qkRnsms qkdqjq

        User user2 = gson.fromJson(userJson, User.class);
        System.out.println(user2);

        // json-> jsonObject : 이게 의미하는 바는 json데이터=/=jsonObject입니다.
        // studentJson 자료형은 stringd이고 jsonobject1의 자료형은 JsonOvject
        JsonObject jsonObject2 = gson.fromJson(studentJson,JsonObject.class);
        System.out.println(jsonObject2);
    }
}
