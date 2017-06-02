package pojobeans;

import java.util.Date;

/**
 * Created by E6430 on 06/01/17.
 */
public class Account {
    private long id;
    private String name;
    private double balancel;
    private Date accessTime;
    private boolean locked;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalancel() {
        return balancel;
    }

    public void setBalancel(double balancel) {
        this.balancel = balancel;
    }

    public Date getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(Date accessTime) {
        this.accessTime = accessTime;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
