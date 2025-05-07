package ch19_generic.product;

import lombok.AllArgsConstructor;
import lombok.ToString;

/*
1.
 */
@AllArgsConstructor
@ToString   // @Data를 달아서 해결하는 방법, alt + ins를 ㅌ홍해 toString() 메서드를 재정의하는 방법도 있습니다.
public class Product<T>{
    private String productName;
    private T productInfo;


    }


