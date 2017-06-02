package com.kateromaniv.runners.classwork.lesson12;

/*Created by katr on 01.06.2017.
 */
public class Student extends Person {
    private String university;
    private String response = "What was teh question?";

    public Student (String name, String university){
        super(name);
        this.university = university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getResponse (){
        return response;
    }

    public static void main(String[] args) {
//        System.out.println(Student.response);
    }
}
