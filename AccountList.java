public  class AccountList{


public Account[] accounts;
private  int count;


public AccountList(int size){
   accounts=new Account[size];
}

public boolean appendAccount(Account account) {

    if (count < accounts.length) {

        accounts[count] = account;
        count++;

        return true;

    } else {

        return false;
    }
}

public Account getAccount(int idx) {

    if (idx < count) {

        return accounts[idx];

    } else {

        System.out.println("Input index exceeds the number of appended elements");
        return null;
    }
}
}