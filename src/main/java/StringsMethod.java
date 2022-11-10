import java.sql.SQLOutput;
import java.util.Locale;

public class StringsMethod {

    static String insert = """
            """;

    public static void insertQuotes(){
        System.out.println();
    }

    static String count = "Abracadabra";
    static String count1 = "Homenum Revelio";
    static String count2 = "3 tarAmasAlatA";


    public static void countAs() {
        System.out.println(count.substring(5, 6));
        System.out.println(count1.substring(0, 15));
        System.out.println(count2.substring(6, 8));
    }

    static String countJ = "As of March 2022, Java 18 is the latest version, while Java 17, "
            + "11 and 8 are the current long-term support (LTS) versions. Oracle released the "
            + "last zero-cost public update for the legacy version Java 8 LTS in January 2019 for "
            + "commercial use, although it will otherwise still support Java 8 with public updates "
            + "for personal use indefinitely. Other vendors have begun to offer zero-cost builds of "
            + "OpenJDK 8 and 11 that are still receiving security and other upgrades";
    static String countJ1 = "99 little bugs in a code.\n"
            + "99 little bugs in a code.\n"
            + "Take one down, and patch it around.\n"
            + "235 critical bugs in the code";

    public static void countJava() {
        System.out.println(countJ.contains("Java"));
        System.out.println(countJ1.contains("Java"));
    }

    static String task = "\n*********** Task # ";
    static int number = 1;

    public static void printTask() {
        System.out.println(task + (number++) + " ************");
    }

    public static void main(String[] args) {

        printTask();
//  1  Написать метод removeSpaces(), который принимает на вход строку.
//Если строка не пустая (проверить методом класса String), то примените метод по удалению пробелов
// в начале и в конце строки.
//Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
//Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
//Если пробелов не было, вернуть сообщение “Пробелов не было”.
//Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.
//
//Test Data:
//“    Red Rover School   “ → “Лишние пробелы удалены”
//“Red Rover School“ → “Пробелов не было”
//“” → “Строка пустая”

        String removeSpaces = "    Red Rover School   ";
        String removeSpaces1 = "Red Rover School";
        String removeSpaecs2 = "";

        System.out.println(removeSpaces.trim() + " Extra spaces deleted");
        System.out.println(removeSpaces1.trim() + " There were no gaps");
        System.out.println(removeSpaecs2.isEmpty() + " The line is empty");

        printTask();
// 2 Написать алгоритм removeAllAs().
//С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
// Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
// Метод возвращает обработанную строку.
//Test Data:
// “    Red Rover School   “ →  “Red Rover School“
//“panda   “ → “pnd”
//“taramasalata” → “trmslt”

        String removeAs = "    Red Rover School   ";
        String removeAs1 = "panda   ";
        String removeAs2 = "taramasalata";

        System.out.println(removeAs.trim().replace("a", ""));
        System.out.println(removeAs1.trim().replace("a", ""));
        System.out.println(removeAs2.replace("a", ""));


        printTask();
//3 Написать алгоритм removeAllZeros().
//С помощью методов из видео1,  написать алгоритм, который принимает на вход строку,
// состоящую из цифр. Если строка валидная, то метод удаляет все пробелы из строки,
// если таковые имеются. Метод возвращает обработанную строку, в которой нет нулей.
// Если в строке не было нулей, метод возвращает сообщение “This is a valid string”.
//Test Data:
// “3504209706040000 “ →  “35429764“
//“0000000111“ → “111”
        String numbers = "3504209706040000 ";
        String numbers1 = "0000000111 ";

        System.out.println(numbers.replace("0", "") + "This is a valid string");
        System.out.println(numbers1.replace("0", "") + "This is a valid string");

        printTask();

//  4 Написать алгоритм removeAllSpaces.
//С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
// Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
// Метод возвращает обработанную строку.
//Test Data:
// “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
//“p a     n   d a   “ → “panda”
        String spaces = "    R e d     Ro ve    r Sc   h ool   ";
        String spaces1 = "p a     n   d a   ";

        System.out.println(spaces.trim());
        System.out.println(spaces.replace(" ", ""));
        System.out.println(spaces1.trim());
        System.out.println(spaces1.replace(" ", ""));


        printTask();

//   5 Напишите метод countAs(), который принимает на вход строку и считает,
//   сколько букв а или А содержится в строке. Метод возвращает количество букв a/A,
//   и количество букв/знаков в слове без букв a/A. Итоговый результат должен строится
//   с помощью метода из видео 2.
//Test Data:
//“Abracadabra” → “5, 6”
//“Homenum Revelio” → “0, 15”
//“3 tarAmasAlatA” → “6, 8”
        countAs();


        printTask();

//    6 Напишите метод countJava(), который принимает на вход текст и проверяет,
//    содержится ли в тексте хотя бы одно слово Java.
//Test Data:
//“As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the
// current long-term support (LTS) versions. Oracle released the last zero-cost public update
// for the legacy version Java 8 LTS in January 2019 for commercial use, although it will otherwise
// still support Java 8 with public updates for personal use indefinitely. Other vendors have begun to
// offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.” → true
//
//“99 little bugs in a code.
//99 little bugs in a code.
//Take one down, and patch it around.
//235 critical bugs in the code.” → false
        countJava();


        printTask();
//    7 Напишите метод insertQuotes(), который принимает слово и возвращает строку,
//    в которой это слово “обернуто” в кавычки:
//Test Data:
//“Abracadabra” →  ““Abracadabra””
        String quotes = "Abracadabra";

        System.out.println("\"Abracadabra\"");


        printTask();

//    8  Напишите метод insertQuotes(), который принимает на вход две строки,
//    и добавляет знак :  после слова “писал”,  и оборачивает в кавычки вторую строку
//(результат строится с помощью метода concat())
//
//Test Data:
//“Федор Достоевский писал”, “Надо любить жизнь больше, чем смысл жизни.” →
//“Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”
//Задание со звездочкой:
//“Наполеон Бонапарт писал”, “В моем словаре нет слова «невозможно».” →
//"Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно".""
        String insertQuot = "Fedor Dostoevski wrote" + "," ;
        String insertQuot1 = "Napoleon Boanapart wrote" + ",";

        System.out.println(insertQuot.replace(",", ":").concat("\"Need to love life more then the meanung of life\""));
        System.out.println(insertQuot1.replace(",", ":").concat("In my vocabular no place for word \"impossiple\""));




        printTask();
//    9 Напишите метод, кторый принимает на вход название города
//    и исправляет написание:
//Test Data:
//“ташкент” → “Ташкент”
//“ЧикаГО” → “Чикаго”
        String changeLetter = "tashkent";
        String changeLetter1 = "ChicaGo";

        System.out.println(changeLetter.substring(0,1).toUpperCase() + changeLetter.substring(1).toLowerCase());
        System.out.println(changeLetter1.substring(0,1).toUpperCase() + changeLetter1.substring(1).toLowerCase());


        printTask();
//indexOf(), lastIndexOf()
//     10 Напишите метод, который принимает на вход строку и букву-параметр,
//     и возвращает все, что находится между первой и последней буквой-параметром:
//Test Data:
//“Abracadabra”, “b” → “bracadab”
//“Whippersnapper”, “p” → “ppersnapp”
        String index = "Abracadabra" + "b";
        String index1 = "Whippersnapper" + "p";

        printTask();

//     11 Напишите метод, который принимает на вход слово, и возвращает true,
//     если слово начинается и заканчивается на одинаковую букву, и false иначе
//Test Data:
//	“Abracadabra” → true
//	“Whippersnapper” → false

        String str = "Abracadabra";
        String str1 = "Whippersnapper";

        System.out.println(str.contains("A" + "a"));
        System.out.println(str1.indexOf("W" + "w"));

//        public static String useSplitMethodToReturnArrayOfFirstMiddleLastNames(String text) {
//    // String[] array = new String[0];
//    String name = "Имя: ";
//    String middlename = "Отчество: ";
//    String lastName = "Фамилия: ";
//    String[] fMLarray = {"Имя: ", "Отчество: ", "Фамилия: "};
//    String newText = "";
//    if (isStringNotNullAndNotEmpty(text)) {
//        String[] array = text.split(" ");
//        if (array.length == fMLarray.length) {
//            for (int i = 0; i < array.length; i++) {
//                for (int j = 0; j < fMLarray.length; j++) {
//                    newText += fMLarray[j] ;
//                }
//                    newText += array[i] + "\n" ;
//            }
//        }
//    }
//    return newText;
//}
    }



}
