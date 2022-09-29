package com.softserve.sprintone;

import com.softserve.sprintone.exception.TaskException;
import com.softserve.sprintone.jose.TaskJoseSprintOne;
import com.softserve.sprintone.luis.TaskLuisSprintOne;

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
    private static TaskLuisSprintOne taskLuisSprintOne;

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
        taskLuisSprintOne = new TaskLuisSprintOne();
    }

    /**
     * @param taskNumber task number that has been chosen by user.
     */
    private static void loadTask(byte taskNumber) {

        switch (taskNumber) {
            case 0:
                return;
            case 2:
                taskLuisSprintOne.task2(bufferReader);
                break;
            case 7:
                taskLuisSprintOne.task7(bufferReader);
                break;
            case 12:
                taskLuisSprintOne.task12(bufferReader);
                break;
            case 17:
                taskLuisSprintOne.task17(bufferReader);
                break;
            case 22:
                taskLuisSprintOne.task22(bufferReader);
                break;
            case 27:
                taskLuisSprintOne.task27(bufferReader);
                break;
            case 32:
                taskLuisSprintOne.task32(bufferReader);
                break;
            case 37:
                taskLuisSprintOne.task37(bufferReader);
                break;
            case 42:
                taskLuisSprintOne.task42(bufferReader);
                break;
            case 48:
                taskLuisSprintOne.task48(bufferReader);
                break;
            case 52:
                taskLuisSprintOne.task52(bufferReader);
                break;
            case 57:
                taskLuisSprintOne.task57(bufferReader);
                break;
            case 62:
                taskLuisSprintOne.task62(bufferReader);
                break;
            case 67:
                taskLuisSprintOne.task67(bufferReader);
                break;
            case 71:
                taskLuisSprintOne.task71(bufferReader);
                break;
            default:
                System.out.println("The specific task has not been implemented");
                break;
        }

        System.out.println("Please, press any key");
        final String taskOption = scannerStrings.nextLine();

        if (!taskOption.equals("0") || !taskOption.equals("exit"))
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
