package aplicativoexercicio;

public class Exercise {
    //Attributes
    private String type, description, name;
    private int countdown, repetiton;
    
    //Constructor
    public Exercise(String n, String t, String d, int c){
        this.setName(n);
        this.setType(t);
        this.setDescription(d);
        this.setCountdown(c);
    }
    
    //Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCountdown() {
        return countdown;
    }

    public void setCountdown(int countdown) {
        this.countdown = countdown;
    }

    public int getRepetiton() {
        return repetiton;
    }

    public void setRepetiton(int repetiton) {
        this.repetiton = repetiton;
    }
    
}
