package com.softserve.sprintone.jose;

import com.softserve.sprintone.exception.TaskException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.IOException;
class TaskJoseSprintOneTest {

    @Test
    void testThatUserTypeFirstWrongNumberTask4() {
        try {
            TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();

            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn("s", "2");

            Assertions.assertThrows(TaskException.class,
                    ()-> taskJoseSprintOne.task4(bufferedReader));
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
    @Test
    void testThatUserTypeSecondWrongNumberTask4() {
        try {
            TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();

            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn("5", "s");

            Assertions.assertThrows(TaskException.class,
                    ()-> taskJoseSprintOne.task4(bufferedReader));
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    @Test
    void testThatThatExpectDoesNotFitAnExactNumberOfPixelsTask4() {
        try {
            TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();

            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn("5", "6");

            taskJoseSprintOne.task4(bufferedReader);
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    @Test
    void testThatExpectItFitAnExactNumberOfPixelsTask4() {
        try {
            TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();

            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn("6", "3");

            taskJoseSprintOne.task4(bufferedReader);
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    @Test
    void testThatExpectMakeNegativeNumberTask9(){
        try {
            TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();

            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn("6");

            taskJoseSprintOne.task9(bufferedReader);
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    @Test
    void testThatExpectMakeZeroAsNumberTask9(){
        try {
            TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();

            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn("0");

            taskJoseSprintOne.task9(bufferedReader);
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    @Test
    void testThatExpectNegativeNumberTask9() {
        TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();
        Assertions.assertEquals(-6, taskJoseSprintOne.makeNegativeNumber(6));
    }

    @Test
    void testThatExpectPositiveNumberTask9() {
        TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();
        Assertions.assertEquals(-6, taskJoseSprintOne.makeNegativeNumber(-6));
    }

    @Test
    void testThatExpectExceptionTask9(){
        try {
            TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();

            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn("{.}");
            Assertions.assertThrows(TaskException.class,
                    ()-> taskJoseSprintOne.task9(bufferedReader));
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    @Test
    void testThatExpectIsDivisibleTask19(){
        try {
            TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();

            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn("10","2");
            taskJoseSprintOne.task19(bufferedReader);
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    @Test
    void testThatExpectIsNotDivisibleTask19(){
        try {
            TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();

            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn("2","10");
            taskJoseSprintOne.task19(bufferedReader);
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    @Test
    void testThatExpectTaskExceptionWithNumbersNegativesTask19(){
        try {
            TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();

            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn("2","-10","9");
            Assertions.assertThrows(TaskException.class,
                    ()-> taskJoseSprintOne.task19(bufferedReader));
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    @Test
    void testThatExpectBasicOperationTask24(){
        try {
            TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();

            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn("+","2","5");
            taskJoseSprintOne.task24(bufferedReader);
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    @Test
    void testThatExpectExceptionWhenWrongNumberIsTypedTask24(){
        try {
            TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();

            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn("+",".","5");
            Assertions.assertThrows(TaskException.class, ()->taskJoseSprintOne.task24(bufferedReader));
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    @Test
    void testThatExpectExceptionWhenOperatorIsNotImplementedTask24(){
        try {
            TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();

            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn(".","2","5");
            Assertions.assertThrows(TaskException.class, ()->taskJoseSprintOne.task24(bufferedReader));
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    @Test
    void testThatWillPrintInConsoleSomeNumberInWordsTask29(){
        try {
            TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();

            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn("1");
            taskJoseSprintOne.task29(bufferedReader);
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    @Test
    void testThatExpectExceptionWhenUserHasTypedWrongNumberTest29(){
        try {
            TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();

            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn(".");
            Assertions.assertThrows(TaskException.class, ()->taskJoseSprintOne.task29(bufferedReader));
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    @Test
    void testThatCalculateAverageForAStudentTask34(){
        TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();
        taskJoseSprintOne.task34();
    }

    @Test
    void testThatWillPrintTheResultsOfMultiplyingValuesTask39(){
        TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();
        taskJoseSprintOne.task39();
    }

    @Test
    void testThatWillFindTheSummationFromOneToSomeNumberGivenTask44(){
        TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();
        try {
            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn("8");
            taskJoseSprintOne.task44(bufferedReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testThatExpectExceptionWhen0IsGivenTask44(){
        TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();
        try {
            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn("0");
            Assertions.assertThrows(TaskException.class, ()->taskJoseSprintOne.task44(bufferedReader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testThatExpectExceptionWhenIsWrongNumberTask44(){
        TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();
        try {
            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn("-");
            Assertions.assertThrows(TaskException.class, ()->taskJoseSprintOne.task44(bufferedReader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testThatWillCalculateTheAreaOfSquareTask50(){
        TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();
        try {
            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn("1");
            taskJoseSprintOne.task50(bufferedReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testThatWillCalculateTheAreaOfTriangleTask50(){
        TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();
        try {
            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn("2");
            taskJoseSprintOne.task50(bufferedReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testThatWillCalculateTheAreaOfRectangleTask50(){
        TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();
        try {
            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn(".");
            Assertions.assertThrows(TaskException.class, ()->taskJoseSprintOne.task50(bufferedReader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testThatWillCalculateTheAreaOfCircleTask50(){
        TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();
        try {
            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn("3");
            taskJoseSprintOne.task50(bufferedReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testThatExpectExceptionWhenUserTypeWrongNumberTask50(){
        TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();
        try {
            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn("4");
            taskJoseSprintOne.task50(bufferedReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testThatExpectExceptionWhenUserTypeNotImplementedShapeTask50(){
        TaskJoseSprintOne taskJoseSprintOne = new TaskJoseSprintOne();
        try {
            BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
            Mockito.when(bufferedReader.readLine()).thenReturn("9");
            taskJoseSprintOne.task50(bufferedReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}