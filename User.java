class User {
    String username;
    String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    boolean login(String u, String p) {
        return username.equals(u) && password.equals(p);
    }
}