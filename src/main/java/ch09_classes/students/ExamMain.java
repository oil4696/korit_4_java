package ch09_classes.students;

public class ExamMain {
    public static void main(String[] args) {
        Exam exam1 = new Exam(1,"김일",50);
        Exam exam2 = new Exam(2,"김이",70);
        Exam exam3 = new Exam(3,"김삼",80);

        exam1.allScore();
        exam2.allScore();
        exam3.allScore();
    }
}
