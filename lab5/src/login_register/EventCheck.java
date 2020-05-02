/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_register;

/**
 *
 * @author Patryk
 */
class EventCheck {
    private int id;
    private String eventName, participation, feed, whoJoin, wasAccepted;
    
    public EventCheck(int id, String eventName, String participation, String feed, String whoJoin, String wasAccepted){
        this.id = id;
        this.eventName = eventName;
        this.participation = participation;
        this.feed = feed;
        this.whoJoin = whoJoin;
        this.wasAccepted = wasAccepted;
    }
    public int getid(){
        return id;
    }
    
    public String geteventName(){
        return eventName;
    }
    
    public String getparticipation(){
        return participation;
    }
    
    public String getfeed(){
        return feed;
    }
    
    public String getwhoJoin(){
        return whoJoin;
    }
    
    public String getwasAccepted(){
        return wasAccepted;
    }
    
}
