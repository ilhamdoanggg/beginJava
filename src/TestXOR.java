public class TestXOR {
    public static void main(String[] args) {

        boolean val1 = true;//benar
        boolean val2 = true;//benar

        System.out.println(val1 ^ val2); //salah

        val1 =false;
        val2 = true;
        System.out.println(val1 ^ val2); //benar

        val1 = false;
        val2 = false;
        System.out.println(val1 ^ val2);//salah

        val1=true;
        val2=false;
        System.out.println(val1 ^ val2);//benar
    }
}
