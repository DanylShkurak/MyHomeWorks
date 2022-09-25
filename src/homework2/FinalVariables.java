package homework2;

public class FinalVariables {
    // Возможно есть способ создать констурктор с полями и сеттеры , но в этом вроде нету смысла . Потому что final переменные
    // нельзя обьявить и не инициализировать, тоесть мы уже не сможем их поменять с помощью конструктора и сетера.
    // Мне так кажется.

    private final  int anInt = 0;
    private  final boolean promise = true;
    private final String color = "blue";

    public FinalVariables() {
    }

    public int getAnInt() {
        return anInt;
    }

    public boolean isPromise() {
        return promise;
    }

    public String getColor() {
        return color;
    }
}
