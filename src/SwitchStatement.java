public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "H";

        switch (nilai) {
            case "A":
                System.out.println("nilai anda sangat baik");
                break;
            case "B":
            case "C":
                System.out.println("nilai anda baik");
                break;
            case "D":
                System.out.println("nilai anda tidak baik");
                break;
            default:
                System.out.println("Mungking anda salah jurusan");



        }

        switch (nilai) {
            case "A" -> System.out.println("nilai anda sangat baik");
            case "B" -> System.out.println("nilai anda baik");
            case "C","D" -> System.out.println("nilai anda tidak baik");
            default -> System.out.println("Mungkin anda salah jurusan");
        }

    }
}
