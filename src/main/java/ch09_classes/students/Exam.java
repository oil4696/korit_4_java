package ch09_classes.students;

public class Exam {
    int score;
    int num;

    public Exam(int num, String name,int score) {
        if (score >100 || score <0){
            System.out.println("불가능한 입력입니다.");
            return;
        }

        this.score = score;
        this.num = num;
        this.name = name;
    }
void allScore(){
    System.out.println("번호"+num+" "+name+"님의 점수는"+score+"입니다.");
}

    String name;

}
