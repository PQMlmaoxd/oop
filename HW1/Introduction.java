public class Introduction {
    public static void main(String[] var0) {
        String name = "Pham Quang Minh";
        String msv = "24020239";
        String lop = "K69I-IT5";
        String github = "PQMlmaoxd";
        String email = "24020239@vnu.edu.vn";
        System.out.println(name + "\t" + msv + "\t" + lop + "\t" + github + "\t" + email);

        for(int i = 9; i >= 1; --i) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer. \n");
            System.out.println("Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall. \n");
        }

        System.out.println("No more bottles of beer on the wall.");
    }
}