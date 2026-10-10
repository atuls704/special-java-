public class Mtd_3
{
    public static String helloname(String name)
    {
        return "hello " + name + "!";
    }

    public static void main(String[] args)
    {
        
        System.out.println(helloname("Bob" ));
        System.out.println(helloname("Alice"));
        System.out.println(helloname("X"));
    }
}



// public class Mtd_3{
    public static String firstTwo(String str) {

        if (str.length() < 2) {
            return str;
        }

        return str.substring(0, 2);
    }

    public static void main(String[] args) {
        System.out.println(firstTwo("Hello"));
        System.out.println(firstTwo("abcdefg"));
        System.out.println(firstTwo("X"));
    }
}


//public class Mat_3 {
    public static String Half(String str) {
        return str.substring(0, str.length() / 2);
    }

    public static void main(String[] args) {
        System.out.println(Half("WooHoo"));
        System.out.println(Half("HelloThere")); 
        System.out.println(Half("abcdef")); 
    }
}