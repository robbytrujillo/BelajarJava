public class IfStatement {
    public static void main(String[] args) {

        var nilai = 70;
        var absen = 90;

        var lulusNilai = nilai >= 75;
        var lulusAbsen = absen >= 75;

        var lulus = lulusNilai && lulusAbsen;

        if (nilai >= 90 && absen >=90){
            System.out.println("Nilai Anda A");
        }else if(nilai >= 85 && absen >= 85){
            System.out.println("Nilai Anda B");
        }else if(nilai >= 75 && absen >= 75){
            System.out.println("Nilai Anda C");
        }else if(nilai >= 60 && absen >= 60){
            System.out.println("Nilai Anda D");
        }else{
            System.out.println("Nilai Anda E");
        }

//        if(nilai >= 75 && absen >= 75){
//            System.out.println("Selamat Anda Lulus");
//        } else {
//            System.out.println("Maaf, Anda Tidak Lulus");
//        }

//        if (lulus){
//            System.out.println("Selamat Anda Lulus");
//        }

    }
}
