// package newHW01;

// import java.io.FileNotFoundException;
// import java.util.InputMismatchException;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),

// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

// import java.util.Scanner;

// public class HW02 {
//     public static void main(String[] args) {
//         try {
//             Scanner sc = new Scanner(System.in);

//             float x = (float) sc.nextDouble();
//             float y = (float) sc.nextDouble();

//             if (y < 2 * x) {
//                 System.out.println("No");
//             } else {
//                 System.out.println("Yes");
//             }

//             sc.close();
//         } catch (InputMismatchException e) {
//             System.out.println("Введите число");
//         }

//     }
// }

// Задание 2

// public class HW02 {
//     try
//     {
//         int d = 0;
//         int[] intArray;
//         double catchedRes1 = intArray[8] / d;
//         System.out.println("catchedRes1 = " + catchedRes1);
//     }
//     }   catch (InputMismatchException e) {
//     System.out.println("Catching exception: "+e);
//     }

// Задание 3

// public class HW02 {
//     public static void main(String[] args) throws Exception {
//         try {
//             int a = 90;
//             int b = 3;
//             System.out.println(a / b);
//             printSum(23, 234);
//             int[] abc = { 1, 2 };
//             abc[3] = 9;
//         } catch (Throwable ex) {
//             System.out.println("Что-то пошло не так...");
//         }
//     }

//     public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//         System.out.println(a + b);
//     }

//     public ArithmeticException getE() {
//         return e;
//     }

//     public void setE(ArithmeticException e) {
//         this.e = e;
//     }
// }
