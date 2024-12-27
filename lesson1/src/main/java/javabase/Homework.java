package javabase;

public class Homework {
    // Перевернуть строку и вывести на консоль
    // String string = "I love Java";
    public static void turnString(String string) {
        char[] charArray = string.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]); // выводим перевернутую строку на консоль
        }
        System.out.println(); // для перехода на новую строку
    }

    // int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
    // Удалить дубликаты из массива и вывести в консоль
    public static void getDistinctNumbers(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (ints[i] == ints[j]) {
                    isDuplicate = true; // нашли дубликат
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(ints[i] + " "); // выводим уникальные значения
            }
        }
        System.out.println(); // для перехода на новую строку
    }

    // Дан массив, заполненный уникальными значениями типа int.
    // int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
    // Необходимо найти элемент, который меньше максимума, но больше всех остальных.
    public static Integer findSecondMaxElement(int[] arr) {
        if (arr.length < 2) {
            return null; // если массив содержит меньше 2 элементов
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max; // обновляем второй максимум
                max = num;       // обновляем максимум
            } else if (num > secondMax) {
                secondMax = num; // обновляем второй максимум
            }
        }

        return secondMax == Integer.MIN_VALUE ? null : secondMax; // если второго максимума нет, вернуть null
    }

    // Найти длину последнего слова в строке. В строке только буквы и пробелы.
    // "Hello world" - 5
    // "    fly me    to the moon    " - 4
    public static Integer lengthOfLastWord(String string) {
        int length = 0;
        int i = string.length() - 1;

        // Убираем пробелы с конца
        while (i >= 0 && string.charAt(i) == ' ') {
            i--;
        }

        // Отсчитываем длину последнего слова
        while (i >= 0 && string.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length; // возвращаем длину последнего слова
    }

    // Определить, что строка является палиндромом
    // Сложность по памяти O(1), не создавать новые String, StringBuilder
    // Примеры:
    // abc - false
    // 112233 - false
    // aba - true
    // 112211 - true
    public static boolean isPalindrome(String string) {
        int left = 0;
        int right = string.length() - 1;

        while (left < right) {
            if (string.charAt(left) != string.charAt(right)) {
                return false; // если символы не равны, не палиндром
            }
            left++;
            right--;
        }

        return true; // если все символы совпадают, палиндром
    }
}