package ru.itsjava.annotations.junit;

import ru.itsjava.annotations.junit.annotation.*;

public class MyAmazingTest {
    @Test
    public void test1(){}
    @Befor
    public void test2(){}
    @Test
    public void test3(){
        throw new AssertionError();
    }
    @BeforEach
    public void test4(){}
    @After
    public void test5(){}
    @AfterEach
    public void test6(){}




}
