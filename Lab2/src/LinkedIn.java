class LinkedIn extends Network {

    public LinkedIn(String username, String password) {
        super(username, password);
    }

    @Override
    void logIn(String username, String password) {
        System.out.println("Logging into LinkedIn with username: " + username);
    }

    @Override
    void sendData(String message) {
        System.out.println("Posting message on LinkedIn: " + message);
    }

    @Override
    void logOut() {
        System.out.println("Logging out of LinkedIn");
    }
}
