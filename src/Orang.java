public class Orang {
    public int tahunUmur = 24;

    public void hitungUmur(){
        int hariUmur = tahunUmur*365;
        long detikUmur = tahunUmur*365*24L*60*60;

        System.out.println("umur anda adalah : " + hariUmur +" hari");
        System.out.println("umur anda adalah : " + detikUmur +" detik");
    }

    public static void main(String[] args) {
        Orang o = new Orang();
        o.hitungUmur();
    }
}
