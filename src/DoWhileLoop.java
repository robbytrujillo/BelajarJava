public class DoWhileLoop {
    public static void main(String[] args) {

        // menampilkan program minimal 1x
        var counter = 1; //valid
        //var counter = 100; //tidak valid minimal diproses 1x

        do{
            System.out.println("Perulangan Ke-" + counter);
            counter++;
        } while (counter <= 10);
    }
}
