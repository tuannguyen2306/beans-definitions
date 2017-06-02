package pojobeans;

/**
 * Created by E6430 on 06/01/17.
 */
public class AccountServiceIml implements AccountService {

    private AccountRepository accountRepository;

    public void setAccountRepository(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }


    @Override
    public void transferMoney(long fromAccountId, long toAccountId, double amount) {
        Account sourceAccount = accountRepository.find(fromAccountId);
        Account targetAccount = accountRepository.find(toAccountId);
        sourceAccount.setBalancel(sourceAccount.getBalancel() - amount);
        targetAccount.setBalancel(targetAccount.getBalancel() + amount);
        accountRepository.update(sourceAccount);
        accountRepository.update(targetAccount);
    }

    @Override
    public void depositMoney(long accountId, double amount) throws Exception {
        Account account = accountRepository.find(accountId);
        account.setBalancel(account.getBalancel() + amount);
        accountRepository.update(account);
    }

    @Override
    public Account getAccount(long accountId) {
        return accountRepository.find(accountId);
    }
}
