class Facebook extends Network {

    public Facebook(String username, String password) {
        super(username, password);
    }

    @Override
    void logIn(String username, String password) {
        System.out.println("Logging into Facebook with username: " + username);
    }

    @Override
    void sendData(String message) {
        System.out.println("Posting message on Facebook: " + message);
    }

    @Override
    void logOut() {
        System.out.println("Logging out of Facebook");
    }
}
