import io.appium.java_client.AppiumDriver;

public class CalculatorTestScenarios {
    AppiumDriver driver;
    CalculatorActions calculatorActions;
    CalculatorElements calculatorElements = new CalculatorElements();
    UnitConverterElements unitConverterElements = new UnitConverterElements();
    MenuElements menuElements = new MenuElements();

public CalculatorTestScenarios(AppiumDriver driver){

    this.driver = driver;
    calculatorActions = new CalculatorActions(driver);

}

    public void calculator_add_numbers(){
        calculatorActions.clickElement(calculatorElements.digit_2());
        calculatorActions.clickElement(calculatorElements.digit_3());
        calculatorActions.clickElement(calculatorElements.add());
        calculatorActions.clickElement(calculatorElements.digit_9());
        calculatorActions.clickElement(calculatorElements.equal());
        calculatorActions.assertResult(calculatorElements.formula(), "32");


    }

    public void calculator_subtract_numbers(){
        calculatorActions.clickElement(calculatorElements.digit_1());
        calculatorActions.clickElement(calculatorElements.digit_0());
        calculatorActions.clickElement(calculatorElements.subtract());
        calculatorActions.clickElement(calculatorElements.digit_5());
        calculatorActions.clickElement(calculatorElements.equal());
        calculatorActions.assertResult(calculatorElements.formula(), "5");


    }

    public void calculator_multiple_numbers() {
        calculatorActions.clickElement(calculatorElements.digit_6());
        calculatorActions.clickElement(calculatorElements.digit_1());
        calculatorActions.clickElement(calculatorElements.multiple());
        calculatorActions.clickElement(calculatorElements.digit_4());
        calculatorActions.clickElement(calculatorElements.equal());
        calculatorActions.assertResult(calculatorElements.formula(), "244");
    }

    public void unit_converter(){
        calculatorActions.clickElement(menuElements.menu());
        calculatorActions.clickElement(menuElements.unit_converter());
        calculatorActions.clickElement(unitConverterElements.digit_2());
        calculatorActions.assertResult(unitConverterElements.to_unit_text(), "0.787402");


    }
    public void change_unit_converter(){
        calculatorActions.clickElement(unitConverterElements.to_unit());
        calculatorActions.clickElement(unitConverterElements.select_meter_to_unit());
        calculatorActions.clickElement(unitConverterElements.from_unit_text());
        calculatorActions.clickElement(unitConverterElements.btn_clear());
        calculatorActions.clickElement(unitConverterElements.digit_1());
        calculatorActions.clickElement(unitConverterElements.digit_00());
        calculatorActions.assertResult(unitConverterElements.to_unit_text(), "1");

    }

    public void clear_calculator(){
        calculatorActions.clickElement(calculatorElements.clear());
    }

}
