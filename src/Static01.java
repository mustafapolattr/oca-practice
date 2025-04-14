public class Static01 {
    String m = "m";
    static String value = "t";
    static {value += "a";}
    {value += "c";}

    public Static01() {
        m="h";
        value += "b";
    }
    public Static01(String s) {
        value += s;
        m="k";
    }

    public static void main(String[] args) {
        Static01 static01 = new Static01("f");
        static01 = new Static01();
        System.out.println(static01.value + static01.m);
    }
    //tacfcbh
}
