package Lesson10.Lab.Lab402;

public class StudentCollege extends Student{
    float score1=5;
    float score2=7;
    float score3=10;

    @Override
    public void Average() {
        float average= (score1+score2+score3)/3;
        System.out.println("Average: "+average);
    }
}
