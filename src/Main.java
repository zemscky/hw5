public class Main {
    public static void main(String[] args) {
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
        if (age1 >=7)
        if (age1 < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age1 >= 18)
        if (age1 < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age1 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        // Задача 3
        System.out.println("Задача 3");
        int seat = 10; // Занято мест
        if (seat < 60) {
            System.out.println("В вагоне есть сидячее место");
        }
        if (seat >= 60)
        if (seat < 102) {
            System.out.println("В вагоне есть стоячее место");
        }
        if (seat > 101) {
            System.out.println("Вагон уже полностью забит");
        }

    }
}