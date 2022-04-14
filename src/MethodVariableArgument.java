public class MethodVariableArgument {
    public static void main(String[] args) {
        //method tanpa variable argument
//        int[] values =  {80,80,80,80,80};
//        sayCongrats("Robby", values);
//
        //method dengan variable argument
        sayCongrats("Robby", 80,80,80,80,80);
    }
    //method tanpa variable argument
    //static void sayCongrats(String name, int[] values){

    //method dengan variable argument
    static void sayCongrats(String name, int... values){
        int total = 0;
        for (var value:values){
            total += value;
        }

        int finalValue = total/values.length;
        if(finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");

        }else {
            System.out.println("Maaf " + name + ", Anda tidak Lulus");
        }
    }
}
