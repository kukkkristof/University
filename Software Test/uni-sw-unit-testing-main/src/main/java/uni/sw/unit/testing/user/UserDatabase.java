package uni.sw.unit.testing.user;

public class UserDatabase {
    @SuppressWarnings("unused")
    private UserListener userListener;
    @SuppressWarnings("unused")
    private User user;

    public void addListener(UserListener userListener) {
        this.userListener = userListener;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
