package org.maktab.Bank;

public class Customer {
    private String name;
    private Account account;
    private CreditCard creditCard;

    public Customer(
            String name,
            String accountNumber,double balance,String code,String city,int rate,
            String cardNumber,double credit){
        this.name=name;
        this.account=new Account( accountNumber, balance,code,city,rate);
        this.creditCard=new CreditCard(cardNumber, credit);

    }
    /***************** SETTER *******************/
    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
    /****************************** GETTER ********************/
    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }
    /******************* CAL CUSTOMER BALANCE ************/
     public double caklCustomerBalance(){
         return account.getBalance()+creditCard.getCredit();
     }

}
