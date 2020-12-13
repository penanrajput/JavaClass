
class StringPoolingConcept {
    public static void main(String[] args) {

        // String Poolig
        // String Pool in java is a pool of Strings stored in Java Heap Memory
        // static declaration of string, resides in pool
        String str1 = "Penan";
        String str2 = "Penan";

        // Dyanamic declaration of string, does not reside in pool
        String str3 = new String("Penan");

        System.out.println(str1 == str2); // true
        System.out.println(str2 == str3); // false
        System.out.println(str1 == str3); // false
    }
}