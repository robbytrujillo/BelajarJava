public class Continue {
    public static void main(String[] args) {

        //Continue Ganjil
        for (var counter = 1; counter <= 100; counter++){

            if(counter % 2 == 0){ //angka 0 keluaran menjadi ganjil, angka 1 keluaran menjadi genap
                continue; //menghentikan perulangan saat ini dan melanjutkan ke perulangan selanjutnya
            }
            System.out.println("Perulangan Ke-" + counter);
        }
    }
}
