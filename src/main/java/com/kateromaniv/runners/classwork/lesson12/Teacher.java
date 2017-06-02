package com.kateromaniv.runners.classwork.lesson12;

/*Created by katr on 01.06.2017.
 */
public class Teacher extends Person{
    private String university;
    private String response = "What was teh question?";
    private String isHomework;


    public Teacher (String name, String university){
        super(name);
        this.university = university;
        isHomework = String.valueOf(homework());
    }

    public static void main(String[] args) {
        Teacher t = new Teacher("Kate", "KNU");

        System.out.println(t.isHomework);
    }

}
