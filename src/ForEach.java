public class ForEach {
    public static void main(String[] args) {

        String[] nama = {
                "Robby", "Ilham", "Kusuma",
                "Belajar", "Coding", "Java"
        };


        //Tanpa For Each
//        for (var r = 0; r < nama.length; r++){
//            System.out.println(nama[r]);
//        }

        //Dengan For Each
          for (var value : nama) {
              System.out.println(value);
          }
    }
}
