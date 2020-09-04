package aplicativoexercicio;

public class Routine {
    //Attributes
    private int week, time;
    private float initial, meta;
    private User person;
    private String objective;
    
    //Constructor
    public Routine(User p, String ob){
        this.setPerson(p);
        this.setObjective(ob);
    }
    
    //Getters e Setters
    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public float getInitial() {
        return initial;
    }

    public void setInitial(float initial) {
        this.initial = initial;
    }

    public float getMeta() {
        return meta;
    }

    public void setMeta(float meta) {
        this.meta = meta;
    }

    public User getPerson() {
        return person;
    }

    public void setPerson(User person) {
        this.person = person;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }
    
    //Manipulação de Variáveis Globais
    public static Exercise v[] = new Exercise[5]; 
    public static Exercise em[] = new Exercise [5];
    
    //Métodos Manipuladores
    public void montarRoutine(){
        this.getObjective();
        if(this.objective == "Emagrecer"){
        
        }
        if(this.objective == "Ganhar Músculos"){
        
        }
    }
}
