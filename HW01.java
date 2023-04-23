// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//  каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//  Если длины массивов не равны, необходимо как-то оповестить пользователя.



// package newHW01;

// import java.io.BufferedReader;
// import java.io.FileNotFoundException;
// import java.io.IOException;

// import java.util.Random;




// public class HW01 {
//     private static Exception[] exceptions = { new NullPointerException(), new IOException(), new Exception() {
//         public String toString() {
//             return "Error";
//         }
//     } };
// public static int calculateSum(int[][] array) {
//     if (array == null || array.length == 0) {
//     throw new RuntimeException("Массив 1");
//     }
//     int size = array.length;
//     for (int i = 0; i < size; i++) {
//     if (array.length != size || array[i].length != size) {
//     throw new RuntimeException("Массив 2");
//     }
//     for(int j = 0; j < size; j++) {
//     if(array[i][j] != 0 && array[i][j] != 1) {
//     throw new RuntimeException("Массив 3");
//     }

//     }
//     }
//     int sum = 0;
//     for (int i = 0; i < size; i++) {
//     for (int j = 0; j < size; j++) {
//     sum += array[i][j];
//     }
//     }
//     return sum;
//     static void throwSomeThing() throws NullPointerException, IOException, Exception {
//         throw exceptions[random.nextInt(exceptions.length)];
//     }
    
//     public static void main(String[] args) {
//         for ( int i = 0; i < 10; ++i ) {
//             try {
//                 System.out.println("Add#" + ( i + 1 ));
//                 throwSomeThing();
//             }
//             catch ( Exception e ) {
//                 System.out.println("as" + e);
//             }
//         }
//     }
// }
// }