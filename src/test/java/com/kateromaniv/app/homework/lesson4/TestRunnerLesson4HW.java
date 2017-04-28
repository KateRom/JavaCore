package com.kateromaniv.app.homework.lesson4;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerLesson4HW {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(BiggerNumberTest.class, CalculateBiggerAreaTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
