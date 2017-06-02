package com.kateromaniv.app.classwork.lesson13;

/*Created by katr on 01.06.2017.
 */
public class GetterSetter {
    private String university;
    private String response = "What is question?";

    public String getResponse(String question){
        return response;
    }

    public boolean setResponse (String response){
        if (response.length()>=3){
            this.response = response;
            return true;
        }return  false;
    }
}
