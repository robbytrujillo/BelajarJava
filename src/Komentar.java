public class Komentar {
    public static void main(String[] args) {
        System.out.println(sum(10,10));

    }

    //java documentation
    /**
     * Method untuk menjumlahkan value1 dan value2
     * @param value1 --> angka pertama
     * @param value2 --> angka kedua
     * @return --> hasil penjumlahan value1 dan value2
     */

    //komentar multiline
    /*
    Penjelasan tentang materi komentar di java
    by Robby Ilhamkusuma
     */

    static int sum(int value1, int value2){
        //jumlahkan value1 dengan value2 (komentar 1 line)
        return value1 + value2;
    }
}
