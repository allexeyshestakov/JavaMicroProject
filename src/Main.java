
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        // 2 задание
        Scanner in = new Scanner(System.in);
        System.out.println("2.Посчитать четные и нечетные цифры введенного натурального числа." +
                " (Например, если введено число 34560, то у него 3 четные цифры (4, 6 и 0) " +
                "и 2 нечетные (3 и 5).)");
        System.out.println("Введите число");
        int number = in.nextInt();

        int temp = number;
        int size =  Integer.toString (number).length();
        int[] array = new int[size];
        int val = 0;
        while(temp > 0){
            array[val] = temp % 10;
            temp /= 10;
            val++;
        }
        int countCh = 0;
        int counNeCh = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                countCh++;
            }
            else counNeCh++;
        }
        System.out.println("Четных: " + countCh + " " + "Нечетных: " + counNeCh);
        in.close();



        // 3 задание
        Scanner in = new Scanner(System.in);
        System.out.println("3.Составьте программу, которая вычисляет сумму чисел от 1 до n." +
                " Значение n вводится с клавиатуры.");

        System.out.println("Введите n");
        int N_Max_Value = in.nextInt();
        int result = 0;
        for(int i = -1 * N_Max_Value; i < N_Max_Value;i++){
            result += N_Max_Value;
            N_Max_Value--;
        }
        System.out.println(result);

        // 1 задание

        Scanner in = new Scanner(System.in);
        System.out.println("1. Вывести квадраты натуральных чисел в диапазоне от a до b " +
                "(вводятся с клавиатуры). Например, если ввести 4 и 5, то должно быть выведено: 16; 25 \n");

        System.out.println("Введите число A");
        int NumberA = in.nextInt();
        System.out.println("Введите число B");
        int NumberB = in.nextInt();
        int result = 0;

        for (; NumberA <= NumberB; NumberA++)
        {
            result = NumberA * NumberA;
            System.out.println(result);


        }



        // 1.Программа, проверяющая, являются ли числа a, b, c
        // сторонами треугольника, и если являются, вычисляющая площадь этого треугольника.
        // При проверке необходим учитывать, что длины сторон треугольника должны быть положительными,
        // и сумма длин двух сторон больше длины третьей стороны.

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число a");
        double a = in.nextInt();
        System.out.println("Введите число b");
        double b = in.nextInt();
        System.out.println("Введите число c");
        double c = in.nextInt();







    }
    static double P_Treug(double a, double b, double c){
        return (a + b + c) / 2;
    }
    static double S_Treug(double a, double b, double c, double p){
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

         */
    }
}