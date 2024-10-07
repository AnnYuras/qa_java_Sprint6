package com.example;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
public class FelineTests {
    @Test
    public void getFamilyIsCorrect() {
        String expectedFelineFamilyName = "Кошачьи"; // Ожидаемое название семейства для кошачьих

        // Проверяем, что результат метода getFamily() соответствует ожидаемому значению
        MatcherAssert.assertThat("Некорректное название семейства кошачьих",
                new Feline().getFamily(),
                equalTo(expectedFelineFamilyName)
        );
    }

    @Test
    public void getKittensInputCountIsCorrect() {

        // Ожидаемое количество котят
        int expectedCount = 7;
        // Проверяем, что результат метода getKittens() с переданным параметром соответствует ожидаемому количеству
        MatcherAssert.assertThat("Не верное количество котят",
                new Feline().getKittens(expectedCount),
                equalTo(expectedCount)
        );
    }

    @Test
    public void getKittensDefaultIsCorrect() {
        // Ожидаемое количество котят по умолчанию
        int expectedCount = 1;
        MatcherAssert.assertThat("Не верное количество котят",
                new Feline().getKittens(),
                equalTo(expectedCount)
        );
    }

    @Test
    public void eatMeatIsCorrect() throws Exception {
        // Создаем новый объект Feline для тестирования
        Feline feline = new Feline();

        MatcherAssert.assertThat("Не верный список еды",
                feline.eatMeat(),
                equalTo(feline.getFood("Хищник"))
        );
    }
}
