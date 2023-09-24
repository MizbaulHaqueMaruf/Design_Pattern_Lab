class Reddit extends Network {

    public Reddit(String username, String password) {
        super(username, password);
    }

    @Override
    void logIn(String username, String password) {
        System.out.println("Logging into Reddit with username: " + username);
    }

    @Override
    void sendData(String message) {
        System.out.println("Posting message on Reddit: " + message);
    }

    @Override
    void logOut() {
        System.out.println("Logging out of Reddit");
    }
}
