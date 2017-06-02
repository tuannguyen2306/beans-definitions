package pojobeans;

/**
 * Created by E6430 on 06/01/17.
 */
public interface AccountService {
    void transferMoney(long fromAccountId, long toAccountId, double amount);
    void depositMoney(long accountId, double amount) throws Exception;
    Account getAccount(long accountId);
}
