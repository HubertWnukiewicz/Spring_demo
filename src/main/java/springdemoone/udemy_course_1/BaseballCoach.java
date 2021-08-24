package springdemoone.udemy_course_1;

public class BaseballCoach implements Coach {

    public FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

    public void doStartStuff() {System.out.println("startStaff");}

    public void doFinishStuff() {System.out.println("finishStaff");}
}
