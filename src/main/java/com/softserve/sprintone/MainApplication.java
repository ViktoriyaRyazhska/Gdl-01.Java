package com.softserve.sprintone;

import com.softserve.sprintone.exception.TaskException;
import com.softserve.sprintone.ivan.TaskIvanSprintOne;
import com.softserve.sprintone.jose.TaskJoseSprintOne;

import java.io.*;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Main application that will print list of question that an user can select;
 */
public class MainApplication {
    static final String USER_DIR = "user.dir";
    static final String QUESTION_LIST = "task-list.txt";
    static final String taskListPath;
    static final Scanner scannerNumbers = new Scanner(System.in);
    static final BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
    static final Scanner scannerStrings = new Scanner(System.in);

    static final File taskList;
    private static byte taskNumber;
    private static TaskJoseSprintOne taskJoseSprintOne;
    private static TaskIvanSprintOne taskIvanSprintOne;

    static {
        taskListPath = System.getProperty(USER_DIR).concat("\\").concat(QUESTION_LIST);
        taskList = new File(taskListPath);
    }
    public static void main(String[] args) {
        loadTaskResource();
        welcome();
    }

    private static void welcome() {
        try {
            loadFileContent();
            taskNumber = Byte.parseByte(bufferReader.readLine());
            loadTask(taskNumber);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InputMismatchException inputMismatchException) {
            System.err.println("You have typed a wrong number.");
        } catch (NoSuchElementException noSuchElementException) {
            System.err.println("You must type a number from the list.");
        } catch (TaskException taskException) {
            System.err.println(taskException.getMessage());
        }
    }

    /**
     * Will load all Task Objects
     */
    private static void loadTaskResource() {
        taskJoseSprintOne = new TaskJoseSprintOne();
        taskIvanSprintOne = new TaskIvanSprintOne();
    }

    /**
     * @param taskNumber task number that has been chosen by user.
     */
    private static void loadTask(byte taskNumber) {

        switch (taskNumber) {
            case 3:
                taskIvanSprintOne.task3(scannerNumbers);
                break;
            case 4:
                taskJoseSprintOne.task4(bufferReader);
                break;
            case 8:
                taskIvanSprintOne.task8(scannerNumbers);
                break;
            case 9:
                taskJoseSprintOne.task9(bufferReader);
                break;
            case 13:
                taskIvanSprintOne.task13(scannerNumbers);
                break;
            case 18:
                taskIvanSprintOne.task18(scannerNumbers);
                break;
            case 23:
                taskIvanSprintOne.task23();
                break;
            case 28:
                taskIvanSprintOne.task28(scannerNumbers);
                break;
            case 33:
                taskIvanSprintOne.task33(scannerNumbers);
                break;
            case 38:
                taskIvanSprintOne.task38(scannerNumbers);
                break;
            case 43:
                taskIvanSprintOne.task43(scannerNumbers);
                break;
            case 49:
                taskIvanSprintOne.task49(scannerStrings);
                break;
            case 68:
                taskIvanSprintOne.task68(scannerStrings);
                break;
            default:
                System.out.println("The specific task has not been implemented");
                break;
        }

        System.out.println("Please, press any key");
        final String taskOption = scannerStrings.nextLine();

        if (!taskOption.equals("0") && !taskOption.equals("exit"))
            welcome();
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
