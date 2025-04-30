package ch16_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        ObjectTest objectTest1 = new ObjectTest("김일", "부산광역시");
        objectTest1.diplayInfo();
        System.out.println(objectTest1);

        Teacher teacher1 = new Teacher("김일","코리아아이티");

        System.out.println(teacher1);
    }
}
