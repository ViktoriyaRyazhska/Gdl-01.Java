package com.softserve.sprintone;

import com.softserve.sprintone.exception.TaskException;
import com.softserve.sprintone.joceline.*;
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
    static final BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
    static final Scanner scannerStrings = new Scanner(System.in);

    static final File taskList;
    private static byte taskNumber;
    private static TaskJoseSprintOne taskJoseSprintOne;
    private static TasksWrapper tasksWrapper;

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
        tasksWrapper = new TasksWrapper();
    }

    /**
     * @param taskNumber task number that has been chosen by user.
     */
    private static void loadTask(byte taskNumber) {

        switch (taskNumber) {
            case 1:
                tasksWrapper.getDoubleIntegers().task1(bufferReader);
                break;
            case 4:
                taskJoseSprintOne.task4(bufferReader);
                break;
            case 6:

                tasksWrapper.getBinaryConverter().task6(bufferReader);
                break;
            case 9:
                taskJoseSprintOne.task9(bufferReader);
                break;
            case 11:
                tasksWrapper.getCelsiusConverter().task11(bufferReader);
                break;
            case 14:
                taskJoseSprintOne.task14(bufferReader);
                break;
            case 16:
                tasksWrapper.getTwoFighters().task16(bufferReader);
                break;
            case 19:
                taskJoseSprintOne.task19(bufferReader);
                break;
            case 21:
                tasksWrapper.getSalaryBonus().task21(bufferReader);
                break;
            case 24:
                taskJoseSprintOne.task24(bufferReader);
                break;
            case 26:
                tasksWrapper.getBoolToString().task26(bufferReader);
                break;
            case 29:
                taskJoseSprintOne.task29(bufferReader);
                break;
            case 31:
                tasksWrapper.getRentalCar().task31(bufferReader);
                break;
            case 34:
                taskJoseSprintOne.task34(bufferReader);
                break;
            case 39:
                taskJoseSprintOne.task39(bufferReader);
                break;
            case 44:
                taskJoseSprintOne.task44(bufferReader);
                break;
            case 47:
                tasksWrapper.getGod().task47();
                break;
            case 50:
                taskJoseSprintOne.task50(bufferReader);
                break;
            case 51:
                tasksWrapper.getConvertIntToString().task51(bufferReader);
                break;
            case 54:
                taskJoseSprintOne.task54(bufferReader);
                break;
            case 56:
                tasksWrapper.getPlayBanjo().task56(bufferReader);
                break;
            case 61:
                tasksWrapper.getConvertStringToInt().task61(bufferReader);
                break;
            case 66:
                tasksWrapper.getCharacterRecognition().task66(bufferReader);
                break;
            case 70:
                tasksWrapper.getCountLoop().task70(bufferReader);
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
