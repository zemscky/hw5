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
        // Задача 2
        System.out.println("Задача 2");
        if (yearsOld >=7 && yearsOld < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        else if (yearsOld >=18 && yearsOld < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        else if (yearsOld >=24){
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        // Задача 3
        System.out.println("Задача 3");
        int seatsTotal = 102;
        int seatsCount1 =60;
        int otherCount1 = seatsTotal - seatsCount1; // стоячие места

        int seatsUsed1 = 60;
        int otherUsed1 = 41;
        if (seatsUsed1 < seatsCount1) {
            System.out.println("Еще есть " + (seatsCount1 - seatsUsed1) + " сидячих мест");
        } else {
            System.out.println("Сидячих мест нет");
        }
        if (otherUsed1 < otherCount1) {
            System.out.println("Еще есть " + (otherCount1 - otherUsed1) + " стоячих мест");
        } else {
            System.out.println("Стоячих мест нет");
        }
        // Домашняя работа 3
        System.out.println("Домашняя работа 3");
        // Задача 1
        System.out.println("Задача 1");
        int years = 20;
        if (years >= 2 && years <= 6) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в детский сад");
        } else if (years >= 7 && years <= 18) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в школу");
        } else if (years > 18 && years < 24) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в университет");
        } else if (years > 24) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить на работу");
        }

    }
}