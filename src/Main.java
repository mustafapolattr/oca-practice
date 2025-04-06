public class Main {
    public static void main(String[] args) {
        postIncrement();
    }

    public static void postIncrement() {
        int num1 = 9;
        int num2 = num1++;

        if (num2 < 10) {
            System.out.println(num2 + " Hello World");
        } else {
            System.out.println(num1 + " Hello Universel");
        }
    }
}