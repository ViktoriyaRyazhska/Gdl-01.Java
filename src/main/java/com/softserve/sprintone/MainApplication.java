package com.softserve.sprintone;

import com.softserve.sprintone.exception.TaskException;
import com.softserve.sprintone.jose.TaskJoseSprintOne;

import java.io.*;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainApplication {
    static final String USER_DIR = "user.dir";
    static final String taskListPath;
    static final Scanner scanner = new Scanner(System.in);
    static final File taskList;

    static {
        taskListPath = System.getProperty(USER_DIR).concat("\\").concat("task-list.txt");
        taskList = new File(taskListPath);
    }

    public static void main(String[] args) {
        try {
            loadFileContent();
            byte taskNumber = scanner.nextByte();
            loadTask(taskNumber);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InputMismatchException inputMismatchException) {
            System.err.println("You has typed a wrong number.");
        } catch (NoSuchElementException noSuchElementException) {
            System.err.println("You must type a number from list.");
        }catch (TaskException taskException){
            System.err.println(taskException.getMessage());
        }
    }

    /**
     * @param taskNumber task number that has been chosen by user.
     */
    private static void loadTask(byte taskNumber) {
        switch (taskNumber) {
            case 4:
                TaskJoseSprintOne.task4(scanner);
                break;
            case 9:
                TaskJoseSprintOne.task9(scanner);
                break;
        }
    }

    /**
     * Load file content that will be print in console
     *
     * @throws IOException
     */
    private static void loadFileContent() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(taskList));
        String st;

        while ((st = br.readLine()) != null)

            System.out.println(st);
    }
}
