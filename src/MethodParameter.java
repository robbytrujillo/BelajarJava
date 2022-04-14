public class MethodParameter {
    public static void main(String[] args) {

    sayHello("Robby", "Ilham");
    sayHello("Ilham", "Kusuma");
    sayHello("Salman", "Khan");

    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
