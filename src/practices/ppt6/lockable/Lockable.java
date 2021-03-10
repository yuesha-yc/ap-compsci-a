package practices.ppt6.lockable;

public interface Lockable {
    void setKey(int key);
    void lock(int key);
    void unlock(int key);
    boolean locked(int key);
}
