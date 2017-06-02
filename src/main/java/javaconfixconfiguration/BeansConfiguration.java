package javaconfixconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pojobeans.AccountRepository;
import pojobeans.AccountRepositoryIml;
import pojobeans.AccountService;
import pojobeans.AccountServiceIml;

/**
 * Created by E6430 on 06/01/17.
 */
@Configuration
public class BeansConfiguration {
    @Bean
    public AccountService accountService() {
        AccountServiceIml bean = new AccountServiceIml();
        // inject dependency
        bean.setAccountRepository(accountDao());
        return bean;
    }
    @Bean
    public AccountRepository accountDao() {
        AccountRepositoryIml bean = new AccountRepositoryIml();
        return bean;
    }
}
