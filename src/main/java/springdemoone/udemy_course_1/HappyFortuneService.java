package springdemoone.udemy_course_1;

public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Good luck!";
    }
}
