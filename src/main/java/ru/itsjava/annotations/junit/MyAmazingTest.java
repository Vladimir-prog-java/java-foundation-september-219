package ru.itsjava.annotations.junit;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import ru.itsjava.annotations.junit.annotation.*;

public class MyAmazingTest {
    @Test
    public void test1(){}
    @Before
    public void test2(){}
    @Test
    public void test3(){
        throw new AssertionError();
    }
    @BeforeEach
    public void test4(){}
    @After
    public void test5(){}
    @AfterEach
    public void test6(){}




}
