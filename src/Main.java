package l33.impovisation.ex4;

public class Main {
    public static void main(String[] args) {
        // Создаем два Box объекта с типом Integer
        Box<Integer> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();

        // Устанавливаем значения
        box1.set(42);
        box2.set(42);

        // Сравниваем содержимое двух Box объектов
        boolean isEqual = Box.isEqual(box1, box2);

        // Выводим результат сравнения
        System.out.println("Are the boxes equal? " + isEqual);
    }
}
