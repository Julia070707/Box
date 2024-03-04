
package l33.impovisation.ex4;

public class Box<T> {
    private T content; // Поле "content" типа T

    // Метод для установки значения поля "content"
    public void set(T content) {
        this.content = content;
    }

    // Метод для получения значения поля "content"
    public T get() {
        return content;
    }

    // Метод для сравнения значения с содержимым Box
    public boolean isValueEqual(Object value) {
        if (content == null) {
            return value == null;
        }
        return content.equals(value);
    }

    // Статический метод для сравнения двух Box объектов
    public static <T> boolean isEqual(Box<T> box1, Box<T> box2) {
        if (box1 == null && box2 == null) {
            return true;
        }
        if (box1 == null || box2 == null) {
            return false;
        }
        return box1.isValueEqual(box2.get());
    }
}