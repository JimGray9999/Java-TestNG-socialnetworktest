package models;

public class Thoughts {

    private String username;
    private String thoughtText;

    public Thoughts(String username, String thoughtText){
        setUsername(username);
        setThoughtText(thoughtText);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getThoughtText() {
        return thoughtText;
    }

    public void setThoughtText(String thoughtText) {
        this.thoughtText = thoughtText;
    }
}
