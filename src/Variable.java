public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Robby Ilham Kusuma";
        Integer age = 30;
        String address = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        //inialisasi var
        var firstName = "Robby"; //harus langsung iniliasi data/nilai/valuenya
        var middleName = "Ilham";
        var lastName = "Kusuma";

        System.out.println(firstName + " " + middleName + " " + lastName);

        //contoh inialisasi final
        final String name1 = "Robby";
        var age1 = 33;
        var address1 = "Indonesia";

        //name1 = "Ilham";

        System.out.println(name1);
        System.out.println(age1);
        System.out.println(address1);



    }
}
