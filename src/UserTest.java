public class UserTest {

    public static void main(String[] args) {

        PaidUser jane = new PaidUser();

//        jane.email = "jane@gmail.com";
//        jane.nickname = "jane";
//        jane.password = "janeonly";

//        jane.login();;
//        jane.printUserInfo();

        User jay = new User();
        EnterpriseUser jin = new EnterpriseUser();

        jay.login();
        jin.login();
        jane.login();

    }
}
