package in.crompton;

import in.crompton.actor.Hero;

public class Movie {
	private Hero hero;
public Hero getHero() {
		return hero;
	}
public Movie() {
	System.out.println("Movie started");
}
public Movie(Hero hero) {
	this.hero=hero;
	System.out.println("Movie Class Param Constructor");
}
public void setHero(Hero hero) {
	this.hero= hero;
}
}
