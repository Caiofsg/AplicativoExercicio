package aplicativoexercicio;
public class User extends Pessoa{
    //Attributes
    private String nick, password;
    private float progress;    
    
    //Constructor
    public User(String name, String nick, String password,int age, float height, float weight) {
        super(name, age, height, weight);
        this.setNick(nick);
        this.setPassword(password);
        this.setProgress(0);
        
    }
    
    //Getters e Setters
    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getProgress() {
        return progress;
    }

    public void setProgress(float progress) {
        this.progress = progress;
    }
    
}
