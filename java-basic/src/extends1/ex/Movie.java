package extends1.ex;

public class Movie extends Item {

    public String directior;
    public String actor;

    public Movie(String name, int price, String directior, String actor) {
        super.name = name;
        super.price = price;
        this.directior = directior;
        this.actor = actor;
    }

    public void print() {
        System.out.println("이름:" + name + ", 가격:" + price);
        System.out.println("- 감독:" + directior + ", 배우:" + actor);
    }

    public int getPrice() {
        return price;
    }

}
