package homework4.classes;

public final class Grandfather extends Man {
    private String name;
    private boolean isKind;

    public void getWiser() {
        System.out.println("Super wiser already");
    }

    @Override
    public void die() {
        System.out.println("Died in 69");
    }

    @Override
    public void getOlder() {
        System.out.println("Thx for everything");
    }

    @Override
    public void lastWords() {
        System.out.println("No");
    }

    @Override
    public void getFun() {
        System.out.println("No");
    }

    public Grandfather() {
    }

    public Grandfather(String name, boolean isKind) {
        this.name = name;
        this.isKind = isKind;
    }

    public Grandfather(int height, int weight, String name, boolean isKind) {
        super(height, weight);
        this.name = name;
        this.isKind = isKind;
    }

    public Grandfather(int age, String sex, int height, int weight, String name, boolean isKind) {
        super(age, sex, height, weight);
        this.name = name;
        this.isKind = isKind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isKind() {
        return isKind;
    }

    public void setKind(boolean kind) {
        isKind = kind;
    }
}
