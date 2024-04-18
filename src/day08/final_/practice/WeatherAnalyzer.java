package day08.final_.practice;

public class WeatherAnalyzer {
    //method
    static boolean checkTemperatureAlert(double temperature) {
        //주어진 온도가 경보 기준을 초과하는지 확인합니다.
        if (temperature >= 40.0 || temperature <= -10.0) {
            return true;
        }
        return false;
    }
    static boolean checkPrecipitationAlert(double precipitation) {
        //주어진 강수량이 경보 기준을 초과하는지 확인합니다.
        if (precipitation >= 60.0) {
            return true;
        }
        return false;
    }
}
