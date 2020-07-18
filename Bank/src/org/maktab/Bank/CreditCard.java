package org.maktab.Bank;

public class CreditCard {
    private String cardNumber;
    private double credit;
    public CreditCard(String cardNumber,double credit){
        this.cardNumber=cardNumber;
        this.credit=credit;
    }
    /************** SETTER ****************/
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
    /******************* GETTER ***************/

    public String getCardNumber() {
        return cardNumber;
    }

    public double getCredit() {
        return credit;
    }
}
