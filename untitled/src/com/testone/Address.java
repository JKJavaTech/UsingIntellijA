package com.testone;

public class Address {

    private String streetName;
    private int pincode;
    private String landMark;
    private String state;
    private String mobilenum;

    public Address(String streetName, int pincode, String landMark, String state, String mobilenum) {
        this.streetName = streetName;
        this.pincode = pincode;
        this.landMark = landMark;
        this.state = state;
        this.mobilenum = mobilenum;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMobilenum() {
        return mobilenum;
    }

    public void setMobilenum(String mobilenum) {
        this.mobilenum = mobilenum;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", pincode=" + pincode +
                ", landMark='" + landMark + '\'' +
                ", state='" + state + '\'' +
                ", mobilenum='" + mobilenum + '\'' +
                '}';
    }
}
