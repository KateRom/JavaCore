package com.kateromaniv.app.homework.lesson12;

/*Created by katr on 20.06.2017.
 */
public class WhiteCollar extends Human {
    private String cName;

    public WhiteCollar(int age, String name, String cName){
        super(age, name);
        this.cName = cName;
    }

    public String getcName(){
        return cName;
    }

    public void setCompany(String cName){
        boolean flag = true;
        for (char c:cName.toCharArray()){
            if ((c>=65 && c<=90) || (c>=97&&c<=122) || c==44 || c==45 || c==32) {
                flag = true;
            }else {
                flag = false;
                break;
            }
        } if (flag) this.cName = cName;
        else {
            System.out.println("Company name is invalid");
        }

    }
}
