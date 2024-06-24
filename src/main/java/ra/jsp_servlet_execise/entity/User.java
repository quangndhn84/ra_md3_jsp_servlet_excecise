package ra.jsp_servlet_execise.entity;

public class User {
    private String userName;
    private String password;
    private boolean status;

    public User() {
    }

    public User(String userName, String password, boolean status) {
        this.userName = userName;
        this.password = password;
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
