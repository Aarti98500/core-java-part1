package entities;

public class Address {

    String flatNum;
    String lineNo;
    String Taluka;
    String district;

    String State;

    public Address() {
    }

    public String getFlatNum(){
        return flatNum;
    }

    public void setFlatNum(String flatNum){
        this.flatNum = flatNum;
    }

    public String getLineNo() {
        return lineNo;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

    public String getTaluka() {
        return Taluka;
    }

    public void setTaluka(String taluka) {
        Taluka = taluka;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    @Override
    public String toString() {
        return "Address{" + " " + flatNum + " " + lineNo + " " + Taluka + " " + district + " " + State + "}";
    }
}


