import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static long square(int x) {
        long y = x * (long) x;
        x = -1;
        return y;
    }

    public static void main(String[] args) {
        //postIncrement();
        //ternary();
        //switchCase();
        //stringManipulation();
        //stringManipulation2();
        //stringManipulation3();
//        int value = 9;
//        long result = square(value);
//        System.out.println(result);
        //forExample();
        //arraysExample();
        //arraysExample2();
        //binarySearch();
        //listExample();
        listExample2();

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

    //output nedir?
    // compilte time error verir çünkü a ve b'yi int olarak görüyor.
    public static void dataCasting2() {
        byte a = 40, b = 50;
        //byte sum = (byte) a  + b;
        //System.out.println(sum);
    }

    public static void stringManipulation2() {
        String numbers = "012345678";
        System.out.println(numbers.substring(1,3));
        System.out.println(numbers.substring(7,7));
        System.out.println(numbers.substring(7));
    }

    public static void stringManipulation3() {
        String s = "purr";
        s.toUpperCase();
        s.trim();
        s.substring(1,3);
        s+=" two";
        System.out.println(s.length());
    }

    // kod çıktısı ne olur
    // kod sonsuz döngüye girer
    public static void forExample() {
        for (int i = 0; i<10; ) {
            i = i++; // post increment
            System.out.println(i + "Hello World");
        }
    }

    // kod çıktısı ne olur?
    // String tanım satırından dolayı kod çalışmaz
    public static void whileLoopExample() {
        int x = 0;
        while (x++ < 10) {}
        //String message = x > 10 ?  "Greater than" : false;
        //System.out.println(message+","+x);
    }

    //çıktı ne olur?
    //while yazılımı yanlış parantez olmadı hata verir
    public static void whileLoopExample2() {
        int x = 1, y=15;
        //while x < 10
        y--;
        x++;
        System.out.println(x+", "+y);
    }

    // çıktısı ne olur?
    // y do içinde tanımlandığı için while içerisinde görünmez
    public static void doWhileScopeExample() {
        int y = 1; // y burda tanımlansa sorun olmazdı
        do {
            // int y = 1; orjinalinde burası açık üsteki y tanımı yok
            System.out.println(y++ + " ");
        } while (y <= 10);
    }

    public static void arraysExample() {
        char[]c = new char[2];
        // Buraya ne eklenirse kod çalışır.
        int length = c.length;
        System.out.println(length);
    }

    public static void arraysExample2() {
        int arr1[] = {1,2,053, 4}; // javada bir sayı 0 ile başlıyorsa 8lik tabanda olur
        int arr2[][] = {{1,2,4}, {2,2,1}, {0,43,2}};

        System.out.println(arr1[3]==arr2[0][2]);
        System.out.println(" " + (arr1[2]==arr2[2][1]));
    }

    public static void binarySearch() {
        int[] random = {16, -41, 112, 10, -110};

        int x = 10;
        int y = Arrays.binarySearch(random, x);
        System.out.print(y);
    }

    public static void listExample() {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(5);
        values.set(1, 6);
        values.remove(0);
        for (int i = 0; i < values.size(); i++) {
            System.out.print(values.get(i));
        }
    }

    public static void listExample2() {
        List<Integer> list = Arrays.asList(10,4,-1,5);
        Collections.sort(list);
        Integer array[] = list.toArray(new Integer[5]);
        System.out.println(array[0]);
    }

}