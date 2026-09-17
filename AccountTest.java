public class AccountTest
{
    public static void main(String[] args)
    {
       
        Account account = new Account("John", 1000);

        System.out.println( account.getName());
        System.out.println(account.getBalance());
        
    
        account.setName("Oliver");
        System.out.println("New name: " + account.getName());


        Account account2 =new Account("jason", 5000);
        account2.deposit(-500);
        System.out.println(account2.getBalance());
            



    }
}