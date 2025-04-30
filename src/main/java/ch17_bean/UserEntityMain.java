package ch17_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity user1 = new UserEntity();

        UserEntityLombok user2 = new UserEntityLombok();
        user2.setUserName(2);
        user2.setPassword(9876);
        user2.setEmail("b@test.com");
        user2.setName("김이");
        System.out.println(user2);
    }
}
