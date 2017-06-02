package pojobeans;

/**
 * Created by E6430 on 06/01/17.
 */
public interface AccountRepository {
    void insert(Account account);
    void update(Account account);
    Account find(long acconutId);
}
