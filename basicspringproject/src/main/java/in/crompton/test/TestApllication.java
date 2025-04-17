package in.crompton.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.crompton.Movie;
import in.crompton.actor.Hero;
public class TestApllication {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	Movie movie = context.getBean(Movie.class);
	movie.getHero().act();
	Hero hero = context.getBean(Hero.class);
	System.out.println("movie Object is : "+movie.getClass().getName());
	System.out.println("hero Object is : "+hero.getClass().getName());
	context.close();
}
}
