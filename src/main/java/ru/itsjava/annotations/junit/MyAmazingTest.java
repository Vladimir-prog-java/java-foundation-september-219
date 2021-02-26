package ru.itsjava.annotations.junit;

import ru.itsjava.annotations.junit.annotation.*;

public class MyAmazingTest {
    public MyAmazingTest() {
    }

    @Test
    public void test1() {
    }

    @Before
    public void beforeTest() {
    }

    @Test
    public void test3() {
        throw new AssertionError();
    }

    @BeforeEach
    public void beforeEachTest() {
    }

    @After
    public void AfterTest() {
    }

    @AfterEach
    public void afterEachTest() {
    }


}
