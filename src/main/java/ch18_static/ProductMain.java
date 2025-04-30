package ch18_static;

import ch08_methods.Method01;

import java.util.Arrays;

public class ProductMain {
    public static void main(String[] args) {
        Method01.call1();
//        System.out.println(Arrays.toString());    /. 이상의 방식의 호출을 이미 재사용했습니다.

        System.out.println(Product.getCount());             //클래스명.메서드명()d을 통한  getter
        Product product1 = new Product();//클래스명.메서드명()d을 통한  getter
        System.out.println("count : " + Product.getCount());
        System.out.println("instanceCount : " + product1.getInstanceCount());
        Product product2 = new Product();
        System.out.println("count : "+ Product.getCount());                      // 정적 메서드 호출
        System.out.println("instanceCount : " + product2.getInstanceCount());     // 일반 메서드 호출

        /*
            결과적으로 인스턴스 변수는 객체에 종속되어있기 때문에 객체 생성 시에 0에서 1로 증가되는 것 밖에
         결과가 나오지 않지만, 정적 변수인 count의 경우는 객체가 생성될 때 마다 count++가 적용되어
         객체의 수 만큼 count가 갱신된다는 점을 확인할 수 있습니다.
         */

        // 즉, 인스턴스 변수 -> 객체에 종속 / 정적 변수 -> 클래스에 종속 이라고 정리하시면 되겠습니다.
        // singleton 패키지 생성 -> products 패키지
        // -> ProductView / ProductViewMain
    }
}
