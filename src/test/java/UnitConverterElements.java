import org.openqa.selenium.By;

public class UnitConverterElements {

    public By to_unit_text(){
        return By.id("com.dencreak.dlcalculator:id/edt_units_result");
    }
    public By to_unit(){
        return By.id("com.dencreak.dlcalculator:id/btn_units_to");
    }
    public By from_unit (){
        return By.id("com.dencreak.dlcalculator:id/btn_units_from");
    }
    public By from_unit_text (){
        return By.id("com.dencreak.dlcalculator:id/edt_units_value");
    }

    public By select_centimeter_from_unit (){
        return By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView");
    }

    public By select_meter_to_unit (){
        return By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.TextView");
    }

    public By converter_note (){
        return By.id("com.dencreak.dlcalculator:id/txt_units_reference");
    }
    public By digit_0 (){
        return By.id("com.dencreak.dlcalculator:id/pad_btn_d_a");
    }
    public By digit_00 (){
        return By.id("com.dencreak.dlcalculator:id/pad_btn_d_b");
    }
    public By digit_1 (){
        return By.id("com.dencreak.dlcalculator:id/pad_btn_c_a");
    }
    public By digit_2 (){
        return By.id("com.dencreak.dlcalculator:id/pad_btn_c_b");
    }
    public By digit_3 (){
        return By.id("com.dencreak.dlcalculator:id/pad_btn_c_c");
    }
    public By digit_4 (){
        return By.id("com.dencreak.dlcalculator:id/pad_btn_b_a");
    }
    public By digit_5 (){
        return By.id("com.dencreak.dlcalculator:id/pad_btn_b_b");
    }
    public By digit_6 (){
        return By.id("com.dencreak.dlcalculator:id/pad_btn_b_c");
    }
    public By digit_7 (){
        return By.id("com.dencreak.dlcalculator:id/pad_btn_a_a");
    }
    public By digit_8 (){
        return By.id("com.dencreak.dlcalculator:id/pad_btn_a_b");
    }
    public By digit_9 (){
        return By.id("com.dencreak.dlcalculator:id/pad_btn_a_c");
    }
    public By btn_clear (){
        return By.id("com.dencreak.dlcalculator:id/pad_img_d_d");
    }

}
