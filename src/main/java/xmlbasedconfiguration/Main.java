package xmlbasedconfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojobeans.AccountService;

/**
 * Created by E6430 on 06/01/17.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("xmlbasedconfiguration/beans.xml");
        AccountService accountService = applicationContext.getBean("accountService",
                AccountService.class);

        System.out.println("Before money transfer");
        System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());

        accountService.transferMoney(1, 2, 5.0);
        System.out.println("===========================");
        System.out.println("After money transfer");
        System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());
    }
}
