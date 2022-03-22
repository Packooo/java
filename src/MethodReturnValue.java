public class MethodReturnValue {
    public static void main(String[] args) {
        var a = 100;
        var b = 200;
        var c = 300;
        var d = sum(a,b,c);


        System.out.println(d);

    }

    static int sum(int nilai1 , int nilai2, int nilai3) {
       var total = nilai1 + nilai2 + nilai3;
       return total;
    }
}
