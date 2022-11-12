public class PaidUser extends UserPrivate{

    public String membership;

    public void setUserInfo(){
//        email = "hey";  -> 'email' has private access in 'UserPrivate'
    }

    public void login() {
        System.out.println("Paid User Login");

    }


}
