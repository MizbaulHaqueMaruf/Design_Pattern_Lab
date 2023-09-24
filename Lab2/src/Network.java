abstract class Network {
    protected String username;
    protected String password;

    public Network(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public final void post(String message) {
        logIn(username, password);
        sendData(message);
        logOut();
    }

    abstract void logIn(String username, String password);
    abstract void sendData(String message);
    abstract void logOut();
}
