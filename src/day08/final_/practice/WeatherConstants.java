package day08.final_.practice;

public enum WeatherConstants {
    MAX_TEMPERSTURE_ALERT(40.0),
    MIN_TEMPERSTURE_ALERT(-10.0),
    PRECIPITATION_ALERT(50.0);

    //field
    private double numericData;

    WeatherConstants(double numericData) {
        this.numericData = numericData;
    }

    public double getNumericData() {
        return numericData;
    }
    //    static final double MAX_TEMPERSTURE_ALERT = 40.0;
//    static final double MIN_TEMPERSTURE_ALERT = -10.0;
//    static final double PRECIPITATION_ALERT = 50.0;

    private WeatherConstants() {} //새로운 객체 생성 방지

}
