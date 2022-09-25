package homework4.classes;
public final class Son extends Man {
    private int toys;
    private String favoriteGame;

    public void play() {
        System.out.println("Play in computer");
    }

    @Override
    public void die() {
        System.out.println("Will die in 85");
    }

    @Override
    public void lastWords() {
        System.out.println("Can I");
    }

    @Override
    public void getOlder() {
        System.out.println("Son is getting older");
    }

    @Override
    public void getFun() {
        System.out.println("Have fun");
    }

    public Son() {
    }

    public Son(int toys, String favoriteGame) {
        this.toys = toys;
        this.favoriteGame = favoriteGame;
    }

    public Son(int height, int weight, int toys, String favoriteGame) {
        super(height, weight);
        this.toys = toys;
        this.favoriteGame = favoriteGame;
    }

    public Son(int age, String sex, int height, int weight, int toys, String favoriteGame) {
        super(age, sex, height, weight);
        this.toys = toys;
        this.favoriteGame = favoriteGame;
    }

    public int getToys() {
        return toys;
    }

    public void setToys(int toys) {
        this.toys = toys;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    public void setFavoriteGame(String favoriteGame) {
        this.favoriteGame = favoriteGame;
    }
}
