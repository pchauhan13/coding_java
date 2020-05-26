public class Program_12 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println(Integer.max(x, y));
        System.out.println(Integer.compare(x, y));

        String str = "300";
        System.out.println(Integer.parseInt(str));
        System.out.println(Integer.valueOf(str));
    }
}