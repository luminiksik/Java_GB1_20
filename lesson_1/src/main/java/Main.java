public class Main {
    public static void main(String[] args) {
        byte b = 5;
        short s = 15;
        int i = 155;
        long l = 12381723L;

        float f = 1.4f;
        double d = 1.7;

        char ch = 'a';
        boolean bool = true;

        String string = "Hi!";


        System.out.println(countFloat(1.2f, 1.3f, 1.4f, 1.5f));

        System.out.println();
        System.out.println(isRange(10, 12));
        System.out.println(isRange(10, 7));

        System.out.println();
        isPositive(10);
        isPositive(0);
        isPositive(-5);

        System.out.println();
        System.out.println(isNegative(10));
        System.out.println(isNegative(0));
        System.out.println(isNegative(-9));

        System.out.println();
        hello("Майя");

        System.out.println();
        System.out.println(isYear(400));
        System.out.println(isYear(200));
        System.out.println(isYear(160));
        System.out.println(isYear(161));
}

    public static double countFloat (float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean isRange(int a, int b) {
        int summ = a + b;
        return summ <= 20 && summ >= 10;
    }

    public static void isPositive(int number) {
        if (number >= 0) {
            System.out.println(number + " is positive number");
        } else {
            System.out.println(number + " is negative number");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void hello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static boolean isYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        }
        return false;
    }
}
