public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long iniLong = 10000L;
        Boolean iniBoolean = true;

        Short iniShort;
        iniShort = 100;

        Byte iniByte = null;
        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

        //inilialisasi  tipe data primitif
        int iniInt = 100;
        //inilialisasi dari tipe data primitif menjadi tipe data bukan primitif
        Integer iniObject = iniInt;

        //konversi dari yang bukan primitif ke primitif dengan memanggil methodnya --> namavariable.methodnya()
        short iniShort2 = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat2 = iniObject.floatValue();

        //

    }
}
