package beanscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojobeans.Account;

/**
 * Created by E6430 on 06/05/17.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beanscopes/beans.xml");

        Account accountSingleton1 = applicationContext.getBean("account1", Account.class);
        accountSingleton1.setOwnerName("XXXXXXXXXXXXXXXXX");
        Account accountSingleton2 = applicationContext.getBean("account1", Account.class);
        System.out.println("accountsingleton2:"+accountSingleton2.getOwnerName());

        Account accountPrototype1 = applicationContext.getBean("account2", Account.class);
        accountPrototype1.setOwnerName("XXXXXXXXXXXXXX");
        Account accountPrototype2 = applicationContext.getBean("account2", Account.class);
        System.out.println("accountPrototype2:"+accountPrototype2.getOwnerName());

     }
}
