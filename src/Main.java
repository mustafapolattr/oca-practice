public class Main {
    public static void main(String[] args) {
        //postIncrement();
        //ternary();
        switchCase();

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

    public static void ternary() {
        int x = 5;

        System.out.println(x>2 ? x <4 ? 10 : 8 : 7 );
    }

    public static void switchCase() {
        final char a = 'A', d = 'D';
        char grade  = 'B';

        switch (grade) {
            case a :
            case 'B' : System.out.println("great");
            case 'C' : System.out.println("good"); break;
            case d:
            case 'F' : System.out.println("not good");
        }
    }

}