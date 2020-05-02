package login_register;

/**
 *
 * @author Patryk
 */
class Events {
    private int id;
    private String eventName, agenda, date;
    
    public Events(int id,String eventName, String agenda, String date){
        this.id = id;
        this.eventName = eventName;
        this.agenda = agenda;
        this.date = date;
    }
    public int getid(){
        return id;
    }
    
    public String geteventName(){
        return eventName;
    }
    
    public String getagenda(){
        return agenda;
    }
    
    public String getdate(){
        return date;
    }
}
