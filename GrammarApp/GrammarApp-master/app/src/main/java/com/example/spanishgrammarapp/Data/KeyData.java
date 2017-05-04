package com.example.spanishgrammarapp.Data;

/**
 * Created by JAESEOKAN on 11/03/2016.
 * Data for LANGUAGE, LEVEL, TOPIC, SUBTOPIC
 */
public class KeyData {
    private String language;
    private String level;
    private String topic;
    private String subtopic;
    int id;

    //constructor
    public KeyData()
    {
    }

    public KeyData(String language, String level, String topic, String subtopic)
    {
        this.language = language;
        this.level = level;
        this.topic = topic;
        this.subtopic = subtopic;
    }
    public KeyData(int id,String language, String level, String topic, String subtopic)
    {
        this.id=id;
        this.language = language;
        this.level = level;
        this.topic = topic;
        this.subtopic = subtopic;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }
    public void setLanguage(String language){
        this.language = language;
    }public void setLevel(String level){
        this.level = level;
    }public void setTopic(String topic){
        this.topic = topic;
    }public void setSubtopic(String subtopic){
        this.subtopic = subtopic;
    }
    public String getLanguage(){
        return language;
    }

    public String getLevel() {
        return level;
    }

    public String getTopic() {
        return topic;
    }

    public String getSubtopic() {
        return subtopic;
    }
    public int getId() {
        return id;
    }


    @Override
    public String toString(){
        return "ID ="+id+" LANGUAGE = ."+language + ". LEVEL, TOPIC = " + level+" "+topic+" SUBTOPIC = "+subtopic ;
    }

}
