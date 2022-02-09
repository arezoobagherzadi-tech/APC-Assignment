import org.openqa.selenium.By;

public class CalculatorElements {

    public By digit_0 (){
        return By.id("com.dencreak.dlcalculator:id/pad_btn_e_a");
    }

    public By digit_00 (){
        return By.id("com.dencreak.dlcalculator:id/pad_btn_e_b");
    }

    public By digit_1 (){
        return By.id("com.dencreak.dlcalculator:id/pad_btn_d_a");
    }

    public By digit_2 (){
        return By.id("com.dencreak.dlcalculator:id/pad_btn_d_b");
    }

    public By digit_3 (){
        return By.id("com.dencreak.dlcalculator:id/pad_btn_d_c");
    }

    public By digit_4 (){
        return By.id("com.dencreak.dlcalculator:id/pad_btn_c_a");
    }

    public By digit_5 (){
        return By.id("com.dencreak.dlcalculator:id/pad_btn_c_b");
    }

    public By digit_6 (){
        return By.id("com.dencreak.dlcalculator:id/pad_btn_c_c");
    }

    public By digit_7 (){
        return By.id("com.dencreak.dlcalculator:id/pad_btn_b_a");
    }

    public By digit_8 (){
        return By.id("com.dencreak.dlcalculator:id/pad_btn_b_b");
    }

    public By digit_9 (){
        return By.id("com.dencreak.dlcalculator:id/pad_btn_b_c");
    }

    public By add (){
        return By.id("com.dencreak.dlcalculator:id/pad_img_d_d");
    }

    public By subtract (){
        return By.id("com.dencreak.dlcalculator:id/pad_img_c_d");
    }

    public By equal (){
        return By.id("com.dencreak.dlcalculator:id/pad_img_e_d");
    }

    public By divide (){
        return By.id("com.dencreak.dlcalculator:id/pad_img_a_d");
    }

    public By multiple (){
        return By.id("com.dencreak.dlcalculator:id/pad_img_b_d");
    }

    public By percentage (){
        return By.id("com.dencreak.dlcalculator:id/pad_img_a_c");
    }

    public By clear (){
        return By.id("com.dencreak.dlcalculator:id/pad_img_a_a");
    }

    public By result_preview (){
        return By.id("com.dencreak.dlcalculator:id/lay_normal_body_result");
    }

    public By formula (){ return By.id("com.dencreak.dlcalculator:id/lay_normal_body_val"); }

}
