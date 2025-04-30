package ch19_generic;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
        Date now =new Date(); // Java 내장 클래스로 객체 생성

        ResponseData<String> responseData1 = new ResponseData<>("날짜 저장 성공 : ", now.toString());
        // 근데 <T.>에서 Tㄱ가 클래스이기 때문에 기본자료혀ㅑㅇ이 못들어갑니다. 즉int는 안되고ㅓ integer는 됨
        ResponseData<Integer> responseData2 = new ResponseData<>("나이 저장 성공 : ",30);
        ResponseData<Date> responseData3 = new ResponseData<>("날씨 객체 저장 성공 : ",now);

        System.out.println(responseData1);       //RespinseData 클래스에 @Data가 있으니까 ㅅtoStringdl 있다고 볼수 있다.
        System.out.println(responseData2);
        System.out.println(responseData3);
    }
}
