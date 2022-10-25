public class OddIndices {
    //Написать алгоритм OddIndices, который принимает массив целых чисел,
// и возвращает массив значений нечетных индексов
//Test Data:
//Input = {-45, 590, 234, 985, 12, 68}
//Expected Result =  {590, 985, 68}
// youtube 22.50-27.50 HW8 part 1

    public int[] oddIndices(int[] numbers) {
        int[] num = new int[numbers.length / 2];
        int j = 0;

        for (int i = 1; i < numbers.length; i = i + 2) {
            num[j] = numbers[i];
            j++;
        }
        return num;
    }
}
