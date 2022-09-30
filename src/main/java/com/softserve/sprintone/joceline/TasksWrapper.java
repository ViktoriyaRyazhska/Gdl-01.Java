package com.softserve.sprintone.joceline;

public class TasksWrapper {
    private final DoubleIntegers doubleIntegers;
    private final BinaryConverter binaryConverter;
    private final CelsiusConverter celsiusConverter;
    private final TwoFighters twoFighters;
    private final SalaryBonus salaryBonus;
    private final BoolToString boolToString;
    private final RentalCar rentalCar;
    private final ConvertIntToString convertIntToString;
    private final PlayBanjo playBanjo;
    private final ConvertStringToInt convertStringToInt;
    private final CharacterRecognition characterRecognition;
    private final CountLoop countLoop;
    private final God god;

    public TasksWrapper () {
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
        god = new God();
    }

    public DoubleIntegers getDoubleIntegers() {
        return doubleIntegers;
    }

    public BinaryConverter getBinaryConverter() {
        return binaryConverter;
    }

    public CelsiusConverter getCelsiusConverter() {
        return celsiusConverter;
    }

    public TwoFighters getTwoFighters() {
        return twoFighters;
    }

    public SalaryBonus getSalaryBonus() {
        return salaryBonus;
    }

    public BoolToString getBoolToString() {
        return boolToString;
    }

    public RentalCar getRentalCar() {
        return rentalCar;
    }

    public ConvertIntToString getConvertIntToString() {
        return convertIntToString;
    }

    public PlayBanjo getPlayBanjo() {
        return playBanjo;
    }

    public ConvertStringToInt getConvertStringToInt() {
        return convertStringToInt;
    }

    public CharacterRecognition getCharacterRecognition() {
        return characterRecognition;
    }

    public CountLoop getCountLoop() {
        return countLoop;
    }

    public God getGod() {
        return god;
    }
}
