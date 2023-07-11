package Lesson10.Lab.Lab402;

public class StudentUnivercity extends StudentCollege{
    float score4=11;
    @Override
    public void Average() {
        float average= (score1+score2+score3+score4)/4;
        System.out.println("Average: "+average);
    }

}
