public class Main {
    public static void main(String[] args) {
         double a = 5, b = 2;
        System.out.println(a/b);
        System.out.println(a%b);
        // 2

        int number = 34;
        if (number < 10 || number > 99) {
            System.out.println("Введене число не є двозначним!");
        } else {
            int tens = number / 10;
            int ones = number % 10;
            int sum = tens + ones;
            System.out.println("Сума цифр числа " + number + " дорівнює " + sum + ".");
        }
        double degree = 22.6;
        int res = (int)(degree + 0.5);
        System.out.println(res);

    }
}
