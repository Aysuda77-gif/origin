package org.maktab.Bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

       Customer[] customers=new Customer[20];
       String names[]={"ali","fateme","hasan","hossein","mohammad","sajad","sadegh","bagher",
               "mahdi","ahoura","artmis","nazanin","helma","omid","pouyan","negar"
               ,"asal","sahar","ghazal","negin"};

       String[] accountNumber={"1321","6546","5463","4646","4684",
               "4654","6464","8649","4165","1654","7913","2135",
               "1658","0432","1659","9416","5468","9463","1531",
               "5464"};

       double[] balance={1300,6546,5463,4646,4680,
               4654,6464,8649,4165,1600,7003,2135,
               1608,7432,1659,9407,5468,9463,1531,
               5460};
        String[] code={"1321","6546","5463","4646","4654",
                "4654","6454","8649","4155","1654","7913","2135",
                "1658","0452","1659","9416","5468","9455","1531",
                "5465"};
        String[] city=new String[20];
        int [] rate={1,2,3,2,1,3,1,3,1,3,2,1,3,1,2,1,3,1,3,2};
        String[] cardNumber=new String[20];


        double[] credit={9300,9546,8463,9646,4380,
                9654,6464,8649,4165,2600,7003,2135,
                5608,7432,5659,9407,5468,9463,4531,
                8460};
        /* String name,
        String accountNumber,double balance,String code,String city,int rate,
        String cardNumber,double credit)
        */

        for (int i = 0; i <20 ; i++) {

            customers[i]=new Customer(names[rand()],accountNumber[rand()],balance[rand()],
                    code[rand()],city[rand()],rate[rand()],cardNumber[rand()],credit[rand()]
                    );
            System.out.println(customers[i].getName());
            System.out.println(customers[i].caklCustomerBalance());

        }





       }


       public static int rand(){


        return (int)(Math.random()*((19)+1));
       }


}


