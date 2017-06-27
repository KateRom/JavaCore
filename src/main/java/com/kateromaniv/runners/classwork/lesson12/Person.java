package com.kateromaniv.runners.classwork.lesson12;

/*Created by katr on 01.06.2017.
 */
public class Person {
    protected String name;

    public Person (String name){
        this.name = name;
    }

    public String getResponse (String question){
        return "My answer is" + question;
    }

    public final Person homework (){
        String homework = "Done";
        return this;
    }
}
