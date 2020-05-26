public class Program_13 {
    public static void main(String[] args) {
        String x = "hello";
        System.out.println(x.charAt(3));

        String name = "Prashant";
        System.out.println(String.format("hello %s", name));
        System.out.println(name.length());
        System.out.println(name.contains("hant"));
        System.out.println(name.indexOf("h"));
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(2));
        System.out.println(name.repeat(3));
        System.out.println(name.equals("hello"));
    }
}