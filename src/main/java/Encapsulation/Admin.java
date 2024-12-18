package Encapsulation;
//Encapsulation is the process no one can access the data members in same class also. if you want to access the private data members it should have to create method. Without method, you don't have to access.
//for this we create get and set method


public class Admin {

    public static void main(String args[]){

        login lg=new login("Poonam","Auth@123");
        System.out.println("Before setting the username..."+lg.getUsername());

        lg.setUsername("Gaikwad");
        System.out.println("After setting the username..."+lg.getUsername());


        lg.setPassword("Test@123",true);
        System.out.println("After setting the password..."+lg.getPassword());
    }
}

class login{

    private String username;
    private String password;

    public login(String us, String pw){
        this.username=us;
        this.password=pw;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAuth) {
        if(isAuth) {
            this.password = password;
        }
        else {
            System.out.println("Not allowed...");
        }
    }
}
