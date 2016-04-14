package ua.in.dergachovda.less08;

public class StringOperations {

    public static void main(String[] args) {
        String str = "hello world";
        char ch = str.charAt(3);
        System.out.println("Character at position 3: " + ch);

        str += "!!!";
        System.out.println(str);

        String str2 = "\"Test\"";
        System.out.println(str2);

        String str3 = "   Test spaces       ";
        System.out.println(str3);

        str3 = str3.trim();
        System.out.println(str3);

        str3 = str3.replace("T", "t");
        System.out.println(str3);

        String str4 = "string";
        System.out.println(str4.substring(0, 2) + str4.substring(4, 6));
        System.out.println(str4.substring(2, 4));

        String hello = "hello cruel world";
        String[] array = hello.split(" ");
        for (String s : array)
            System.out.println(s);

    }

}
