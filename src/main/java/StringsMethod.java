public class StringsMethod {

    public static void main(String[] args) {

//3Написать алгоритм removeAllZeros().
//С помощью методов из видео1,  написать алгоритм, который принимает на вход строку,
// состоящую из цифр. Если строка валидная, то метод удаляет все пробелы из строки,
// если таковые имеются. Метод возвращает обработанную строку, в которой нет нулей.
// Если в строке не было нулей, метод возвращает сообщение “This is a valid string”.
//Test Data:
// “3504209706040000 “ →  “35429764“
//“0000000111“ → “111”
        String numbers = "3504209706040000 ";
        String numbers1 = "0000000111 ";

        System.out.println(numbers.replace("0" , "") + "This is a valid string");
        System.out.println(numbers1.replace("0" , "") + "This is a valid string");


//        4Написать алгоритм removeAllSpaces.
//С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
// Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
// Метод возвращает обработанную строку.
//Test Data:
// “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
//“p a     n   d a   “ → “panda”
        String spaces = "    R e d     Ro ve    r Sc   h ool   ";
        String spaces1 = "p a     n   d a   ";

        System.out.println(spaces.trim());
        System.out.println(spaces.replace(" " , ""));
        System.out.println(spaces1.trim());
        System.out.println(spaces1.replace(" " , ""));
    }

}
