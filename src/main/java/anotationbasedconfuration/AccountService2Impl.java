package anotationbasedconfuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojobeans.Account;
import pojobeans.AccountRepository;
import pojobeans.AccountService;

/**
 * Created by E6430 on 06/01/17.
 */
@Service("accountService")
    public class AccountService2Impl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void transferMoney(long fromAccountId, long toAccountId, double amount) {

    }

    @Override
    public void depositMoney(long accountId, double amount) throws Exception {

    }

    @Override
    public Account getAccount(long accountId) {
        return null;
    }
}
