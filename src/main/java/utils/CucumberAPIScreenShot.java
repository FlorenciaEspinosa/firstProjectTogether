package utils;

import io.cucumber.core.api.Scenario;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CucumberAPIScreenShot {
    public static Scenario currentScenario;

    public static void initScenario(Scenario scenario){
        currentScenario = scenario;
    }
    public static void logPass(String message){
        currentScenario.write(getLogTime() + " PASS: " + message);
    }
    public static void logFail(){
//        currentScenario.write(getLogTime() + " FAIL: " + response.body());
//        Assert.fail(getLogTime() + " FAIL: " + response.body());
    }
    public static void logInfo(String message) {
        currentScenario.write(getLogTime() + " INFO: " + message);
    }
    public static String getLogTime(){
        String format = "yyyy-MM-dd HH:mm:ss";
        DateFormat dataFormat = new SimpleDateFormat(format);
        Calendar cal = Calendar.getInstance() ;
        return dataFormat.format(cal.getTime());
    }

}
