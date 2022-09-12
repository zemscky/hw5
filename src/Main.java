public class Main {
    public static void main(String[] args) {
        // Домашняя работа 1
        System.out.println("Домашняя работа 1");
        // Задача 1
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем с совершенолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }
        // Задача 2
        System.out.println("Задача 2");
        int age1 = 17;
        if (age1 >=7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age1 >=18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age1 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        // Задача 3
        System.out.println("Задача 3");
        int capacity = 102;
        int seatsCount =60;
        int otherCount = capacity - seatsCount; // стоячие места

        int seatsUsed = 60;
        int otherUsed = 41;
        if (seatsUsed < seatsCount) {
            System.out.println("Еще есть " + (seatsCount - seatsUsed) + " сидячих мест");
        }
        if (seatsUsed == seatsCount){
            System.out.println("Сидячих мест нет");
        }
        if (otherUsed < otherCount) {
            System.out.println("Еще есть " + (otherCount - otherUsed) + " стоячих мест");
        }
        if (otherUsed == otherCount) {
            System.out.println("Стоячих мест нет");
        }
        // Домашняя работа 2
        System.out.println("Домашняя работа 2");
        // Задача 1
        System.out.println("Задача 1");
        int yearsOld = 27;
        if (yearsOld >=18) {
            System.out.println("Поздравление пользователя с совершеннолетием");
        }
        else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }



    }
}