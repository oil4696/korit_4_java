package ch14_abstraction.interfaces;

public interface Press {
    String NAME = "buttonm";
    // interface이기 때문에 변수 앞에 접근 지젖ㅇ자를 명시하지 않았지만
    /*
        public fical 에해당ㅎ바니다.,또한 상수이기 때문에 상수명을 나타냐ㅐ는 NAME으로 작성하였고, 일반 클래스의 field 선언처험 String name;으로 작성하는 ㅓㅅ이 불가능하다.

        나줒ㅇ에 긳허브 확인 하실 떄 보게 안되는 것들 나엻바니다.
     */
//    String name;
//    public Press(){};
//    void popOut(){
//        System.out.println("추상 메서드만 가능 / 일반 메서드 불가능 예시");
//    }
    // 되는 거
    void onPressed(); // 아무 표시 안했지만 abvstreact입니다.

    //inerfavce인 Up.java / Down.java를 생성하시고
    // void 형태인 onupo() / on Down()메서드를 선언하시오


}
