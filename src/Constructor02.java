public class Constructor02 {
    int num;
    public Constructor02(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        System.out.println(new Constructor02(50).num);
    }

}
