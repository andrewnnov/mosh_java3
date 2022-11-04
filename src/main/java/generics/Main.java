package generics;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<Integer>();
        list.add(32);
        int number = list.get(0);

    }
}
