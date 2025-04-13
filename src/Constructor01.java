
public class Constructor01 {

    int count;

    // void dönüş tipi olduğu için bu constructor değildir methodtur
    public void Constructor01() {
        count = 4;
    }

    public static void main(String[] args) {
        Constructor01 cns = new Constructor01();
        System.out.println(cns.count);
    }

}
