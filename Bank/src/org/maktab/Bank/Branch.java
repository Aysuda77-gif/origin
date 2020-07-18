package org.maktab.Bank;

public class Branch {
    private String code;
    private String city;
    private int rate;
    public Branch(String code,String city,int rate){
        this.code=code;
        this.city=city;
        this.rate=rate;
    }
    /********************* SETTER *******************/

    public void setCode(String code) {
        this.code = code;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    /********************* GETTER *******************/

    public String getCode() {
        return code;
    }

    public String getCity() {
        return city;
    }

    public int getRate() {
        return rate;
    }
}
