package javaconfixconfuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojobeans.AccountService;

import java.lang.annotation.Annotation;

/**
 * Created by E6430 on 06/01/17.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new
                AnnotationConfigApplicationContext(BeansConfiguration.class);
        AccountService accountService = applicationContext.getBean("accountService",
                AccountService.class);
        System.out.println("Before money transfer");
        System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalancel());
        System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalancel());

        accountService.transferMoney(1, 2, 5.0);
        System.out.println("===========================");
        System.out.println("After money transfer");
        System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalancel());
        System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalancel());
    }
   }
