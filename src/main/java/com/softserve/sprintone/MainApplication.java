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
    static final Scanner scannerNumbers = new Scanner(System.in);
    static final BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
    static final Scanner scannerStrings = new Scanner(System.in);

    static final File taskList;
    private static byte taskNumber;
    private static TaskJoseSprintOne taskJoseSprintOne;
    private static DoubleIntegers doubleIntegers;
    private static BinaryConverter binaryConverter;
    private static CelsiusConverter celsiusConverter;
    private static TwoFighters twoFighters;
    private static SalaryBonus salaryBonus;
    private static BoolToString boolToString;
    private static RentalCar rentalCar;
    private static ConvertIntToString convertIntToString;
    private static PlayBanjo playBanjo;
    private static ConvertStringToInt convertStringToInt;
    private static CharacterRecognition characterRecognition;
    private static CountLoop countLoop;

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
        doubleIntegers = new DoubleIntegers();
        binaryConverter = new BinaryConverter();
        celsiusConverter = new CelsiusConverter();
        twoFighters = new TwoFighters();
        salaryBonus = new SalaryBonus();
        boolToString = new BoolToString();
        rentalCar = new RentalCar();
        convertIntToString = new ConvertIntToString();
        playBanjo = new PlayBanjo();
        convertStringToInt = new ConvertStringToInt();
        characterRecognition = new CharacterRecognition();
        countLoop = new CountLoop();
    }

    /**
     * @param taskNumber task number that has been chosen by user.
     */
    private static void loadTask(byte taskNumber) {

        switch (taskNumber) {
            case 1:
                doubleIntegers.task1(bufferReader);
                break;
            case 4:
                taskJoseSprintOne.task4(bufferReader);
                break;
            case 6:
                binaryConverter.task6(bufferReader);
                break;
            case 9:
                taskJoseSprintOne.task9(bufferReader);
                break;
            case 11:
                celsiusConverter.task11(bufferReader);
                break;
            case 16:
                twoFighters.task16(bufferReader);
                break;
            case 21:
                salaryBonus.task21(bufferReader);
                break;
            case 26:
                boolToString.task26(bufferReader);
                break;
            case 31:
                rentalCar.task31(bufferReader);
                break;
            case 51:
                convertIntToString.task51(bufferReader);
                break;
            case 56:
                playBanjo.task56(bufferReader);
                break;
            case 61:
                convertStringToInt.task61(bufferReader);
                break;
            case 66:
                characterRecognition.task66(bufferReader);
                break;
            case 70:
                countLoop.task70(bufferReader);
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
