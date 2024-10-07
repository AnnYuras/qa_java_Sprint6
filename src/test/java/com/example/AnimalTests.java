package com.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class AnimalTests {

    @Test
    public void getFamilyIsCorrect() {
        // Ожидаемая строка
        String expectedString = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

        // Проверяем, что результат метода getFamily совпадает с ожидаемым значением
        assertEquals("Некорректный перечень семейств", expectedString, new Animal().getFamily());
    }

    @Test
    public void getFoodThrowsException() {
        try {
            // Пытаемся вызвать метод с некорректным значением
            new Animal().getFood("");
            // Если исключение не выбрасывается, тест не проходит
            fail("Ожидалось исключение");
        } catch (Exception e) {
            // Проверяем, что сообщение об ошибке соответствует ожидаемому
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }
}

