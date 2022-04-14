public class TipeDataArray {
    public static void main(String[] args) {

        String[] arrayString;
        arrayString = new String[3];

        //String[] arrayString = new String[3];

        arrayString[0] = "Robby";
        arrayString[1] = "Ilham";
        arrayString[2] = "Kusuma";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        //jika ingin merubah datanya
        arrayString[0] = "Oby";

        System.out.println(arrayString[0]);

        //array initializer
        String[] namaNama = {
            "Robby", "Ilham", "Kusuma"
        };

        //merubah data/menghapus data
        //namaNama[0] = null;

        int[] arrayInt = new int[]{
                1,2,3,4,5,6,7,8,9,10
        };

//        long[] arrayLong = {
//          10L, 20L, 30L
//        };

        long[] arrayLong = {
                10, 90, 80, 67, 29
        };

        //menghapus dari data dari tipe data primitif
        //arrayLong[0] = 0;

        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong.length);

        //Array di dalam Array
        String[][] members={
                {"Robby","Ilham","Kusuma"},
                {"Budi", "Nugraha"},
                {"Joko","Susilo"},
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);

        System.out.println(members[2][1]);
        System.out.println(members[1][0]);
        System.out.println(members[2][0]);

    }
}
