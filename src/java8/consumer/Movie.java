package java8.consumer;

public class Movie {
    String name;
    String hero;
    String heroin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public String getHeroin() {
        return heroin;
    }

    public void setHeroin(String heroin) {
        this.heroin = heroin;
    }

    public Movie(String name, String hero, String heroin){
        this.name = name;
        this.hero = hero;
        this.heroin = heroin;
    }
}
