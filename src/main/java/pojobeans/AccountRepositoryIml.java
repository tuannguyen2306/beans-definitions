package pojobeans;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by E6430 on 06/01/17.
 */
public class AccountRepositoryIml implements AccountRepository {
    private Map<Long,Account> accountMap = new HashMap<>();
    {
        Account account1 = new Account();
        account1.setId(1L);
        account1.setName("john");
        account1.setBalancel(10.0);

        Account account2 = new Account();
        account2.setId(2L);
        account2.setName("Mary");
        account2.setBalancel(20.0);
    }
    @Override
    public void insert(Account account) {
        accountMap.put(account.getId(), account);
    }
    @Override
    public void update(Account account) {
        accountMap.put(account.getId(), account);
    }
    @Override
    public Account find(long acconutid) {
        return accountMap.get(acconutid);
    }
}
