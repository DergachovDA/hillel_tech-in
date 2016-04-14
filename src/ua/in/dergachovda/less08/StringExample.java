package ua.in.dergachovda.less08;

public class StringExample {

    public static void main(String[] args) {

        String str = "hello";
        str += " ";
        str += "world";

        String str2 = "hello world";

        System.out.println("Adresses: " + (str == str2));
        System.out.println("By value: " + str.equals(str2));

        String str3 = str2.intern();
        String str4 = str3.intern();
        str4 = " " + str4;
        System.out.println(str3);
        System.out.println(str4);

    }

}
