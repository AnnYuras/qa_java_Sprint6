package com.example;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {
    @Mock
    Feline feline;

    @Test
    public void getSoundIsCorrect() {
        String expectedString = "Мяу";// Ожидаемое значение звука, который должен издавать кот.

        // Проверяем, что метод getSound() класса Cat возвращает ожидаемое значение.
        MatcherAssert.assertThat("Кот мяукает подругому", // Сообщение, если тест не пройдет
                new Cat(feline).getSound(),// Вызываем метод getSound() у нового объекта Cat.
                equalTo(expectedString)// Проверяем, что результат равен ожидаемой строке.
        );
    }

    @Test
    public void getFoodIsCorrect() throws Exception { // метод может выбросить исключение
        Cat cat = new Cat(feline);// объект Cat и передаем мок-объект feline
        List<String> expectedListOfFood = List.of("Мясо");

        // метод eatMeat() будет возвращать expectedListOfFood.
        Mockito.when(feline.eatMeat()).thenReturn(expectedListOfFood);

        // Проверяем, что метод getFood() возвращает правильный список еды.
        MatcherAssert.assertThat("Некорректный список еды",//  если тест не пройдет
                cat.getFood(),
                equalTo(expectedListOfFood)

        );

    }

}
