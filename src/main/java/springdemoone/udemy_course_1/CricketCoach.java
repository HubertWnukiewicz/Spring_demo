package springdemoone.udemy_course_1;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String email;

    private String team;

    @Override
    public String getDailyWorkout() {
        return "aaa";
    }

    @Override
    public String getDailyFortune() {
        return "bbb";
    }

    public CricketCoach() {
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
