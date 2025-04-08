public class Main {
    public static void main(String[] args) {
        //postIncrement();
        //ternary();
        //switchCase();
        //stringManipulation();


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

    public static void stringManipulation() {
        String str1 = "Java";
        String str2 = new String("java");

        // 1. şık
        // str1.toLowerCase() // str1'e atama olmadığı için str1 kalıcı olarak değişmez
        // if (str1==str2)

        // 2. şık
        // str1.toLowerCase()
        // if (str1.equals(str1.toLowerCase()))

        // 3. şık
        // if (str1.toLowerCase == str2.toLowerCase())

        // true choice
        if (str2.equals(str1.toLowerCase()))
        {
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }

    }

    // Kod (x==s) karşılaştırmasından dolayı derlenemez
//    public static void intStringCompare() {
//        int x = 0;
//        String s = null;
//
//        if (x==s) System.out.println("Success");
//        else System.out.println("Failure");
//    }

    // Calismasi icin ne yapilmali
    public static void dataCasting1() {

        // 82. satırdaki x integer'a cast edilmeli
        // 81. satırdaki data türünü shorta çevir
        // 2*x int'e cast edilmeli
        // y veri tipi long'a cast edilmeli
        //long x = 10;
        //int y = 2 * x;
    }
}