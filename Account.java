public class Account {

        private String name;
       private double balance;


        public Account(String name, double balance)
        {
            this.name=name;
            this.balance=balance;
        }


        public void Account(String name,double balance){
        if(balance>0){
            this.balance=balance;
        }else{
            balance=0;
        }
        }



        public void deposit(double depositAmount)
        {
            if(depositAmount>0){
                balance+=depositAmount;
            }
    }

    public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }


        public double getBalance()
        {
            return balance;
        }

        public void setBalance(double balance)
        {
            this.balance = balance;
        }
}
