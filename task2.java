public class Task2 {
    public static void main(String[] args) {
        int number = 47; // Двозначне число

        // Перша цифра (десятки)
        int digit1 = number / 10;

        // Друга цифра (одиниці)
        int digit2 = number % 10;

        // Сума цифр
        int sum = digit1 + digit2;

        // Виведення результату
        System.out.println("Сума цифр числа " + number + " = " + sum);
    }
}