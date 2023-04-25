
// import java.text.SimpleDateFormat;
// import java.util.*;



// public class HW03Fin {
//     public static void dateN(String args[]) {

//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("Введите дату рождения: ");
//         String date = iScanner.nextLine();
//         System.out.printf("Дата рождения, %s ", date);

//         // Переводим строку в дату
//         SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
//         Date day = null;
//         try {
//             day = format.parse(date);
//         } catch (Exception e) {
//             e.printStackTrace();
//         }

//         // Вывод даты на экран
//         System.out.println();
//     }

//     public static void polN(String args[]) {

//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("Введите пол: ");
//         String sex = iScanner.nextLine();
//         System.out.printf("пол: %s ", sex);

//         System.out.println();
//     }

//     public static void telN(String args[]) {

//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("Введите номер телефона: ");
//         String number = iScanner.nextLine();
//         System.out.printf("номер: %s ", number);

//         System.out.println();
//     }

//     public static void nameN(String[] args) {

//         Scanner scanner = new Scanner(System.in);

//         while (true) {
//             String input = scanner.nextLine();
//             if (input.equals("0")) {
//                 break;
//             }

//             String name = input;
//             int space = 0;
//             for (int s = 0; s < name.length(); s++) {
//                 if (name.charAt(s) == ' ') {
//                     space++; // считаем количество пробелов между словами, введенными в консоль
//                 }
//             }

//             for (int i = 0; i < name.length(); i++) {
//                 // условие, исключающее наличие цифр
//                 if (name.charAt(i) >= '0' && name.charAt(i) <= '9'
//                         // условие проверки количества пробелов,
//                         // слов должно быть 3, значит количество пробелов
//                         // - не больше 2 и не равно 0
//                         || space > 2 || space == 0) {
//                     System.out.println("Введенная строка не является ФИО");
//                     break;
//                 } else {
//                     System.out.println(
//                             "Фамилия: " + name.substring(0, name.indexOf(' ')) + System.lineSeparator() +
//                                     "Имя:" + name.substring(name.indexOf(' '), name.lastIndexOf(' '))
//                                     + System.lineSeparator() +
//                                     "Отчество:" + name.substring(name.lastIndexOf(' ')));
//                     break;

//                 }

//             }
//         }

//     }

// }
