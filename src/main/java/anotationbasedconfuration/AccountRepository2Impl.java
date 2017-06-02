package anotationbasedconfuration;

import com.sun.javafx.collections.MappingChange;
import org.springframework.stereotype.Repository;
import pojobeans.Account;
import pojobeans.AccountRepository;
import pojobeans.AccountService;

import java.util.Map;

/**
 * Created by E6430 on 06/01/17.
 */

    @Repository
    public class AccountRepository2Impl implements AccountRepository {

        private Map<Long, Account> accountMap;

    @Override
    public void insert(Account account) {

    }

    @Override
    public void update(Account account) {

    }

    @Override
    public Account find(long acconutid) {
        return null;
    }
}

