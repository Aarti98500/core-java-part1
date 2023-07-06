package mutable;

public class Address {
    int lineNum;
    String streetName;
    String cityName;
    long pinCode;

    public Address(int lineNum, String streetName, String cityName, long pinCode) {
        this.lineNum = lineNum;
        this.streetName = streetName;
        this.cityName = cityName;
        this.pinCode = pinCode;
    }

    public int getLineNum() {
        return lineNum;
    }

    public void setLineNum(int lineNum) {
        this.lineNum = lineNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "lineNum=" + lineNum +
                ", streetName='" + streetName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
