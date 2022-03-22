public class Array {
    public static void main(String[] args) {

        String[] Nama;
        Nama = new String[3];
        Nama[0] = "Wijayanto";
        Nama[1] = "Agung";
        Nama[2] = "Wibowo";

        System.out.println(Nama[0]);
        System.out.println(Nama[1]);
        System.out.println(Nama[2]);

        Nama[0] = "Wijaya";
        System.out.println(Nama[0]);

        String[] Nama2 = new String [3];

        int[] umur = new int[]{
                10,17,23,30,49,80,100,1233
        };
        System.out.println(umur[4]);

        String[] Tempat = new String[]{
                "Pemalang","Tegal","Pekalongan"
        };

        System.out.println(umur.length);

    }
}
