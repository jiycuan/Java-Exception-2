import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        enterFloat();
    }

    // Метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
    // Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static void enterFloat() {
        
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        float num = 0;
        while (flag) {
            System.out.print("Введите дробное число(отделяя дробную часть точкой): ");
            String inputString = in.next();
            flag = false;
            try {
                num = Float.parseFloat(inputString);
            } catch (RuntimeException e) {
                flag = true;
                System.out.println("Некорректный ввод");
            }
        }
        System.out.printf("Вы ввели: %f \n", num);
        in.close();
    }

    // Делим восьмой элемент массива на ноль
    public static void zad2(int[] intArray) {

        int d = 0;
        try {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
        }

    }
    //    Задание 3
    public static void zad3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на пустоту!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Выход за границы массива");
        } catch (Throwable ex) {
            System.out.println("Непредвиденная случайность");
        }
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    // Программа, которая выбросит Exception, когда пользователь вводит пустую строку.
    //    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

    public static void emptyString() {
        Scanner scanner = new Scanner(System.in);
        String outputtSring = "";
        boolean flag = true;
        while (flag) {
            System.out.println("Введите не пустую строку:");
            outputtSring = scanner.nextLine();
            try {
                checkNullString(outputtSring);
                flag = false;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void checkNullString(String str) throws RuntimeException {
        if (str.length() == 0) {
            throw new RuntimeException("Строка не должна быть пустой");
        }
    }
}