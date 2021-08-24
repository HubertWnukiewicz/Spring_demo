package springdemoone.udemy_course_1;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

public class SpringMainApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Test of setting values via application.properties file
        CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getTeam());
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getEmail());

        Coach basketballCoach = context.getBean("myCoach", Coach.class);
        FortuneService fortuneService = context.getBean("myFortuneService", FortuneService.class);
        System.out.println(basketballCoach.getDailyWorkout());
        System.out.println(basketballCoach.getDailyFortune());
        context.close();

    }

}
