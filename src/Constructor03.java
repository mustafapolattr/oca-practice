public class Constructor03 {
    int x=10, y;
    Constructor03() {
        System.out.print(x * y);
    }

    Constructor03(int x, int y) {
        this();
        this.x=x;
        this.y=y;
        System.out.print(x*y);
    }

    Constructor03(int x, int y, int z) {
        this(y,z);
        this.x=x;
        this.y=y;
        System.out.print(x*z);
    }

    public static void main(String[] args) {
        Constructor03 constructor03 = new Constructor03(3,4,5);
        System.out.print(constructor03.x * constructor03.y);
    }
}
