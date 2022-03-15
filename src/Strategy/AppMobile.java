package Strategy;

public class AppMobile implements Strategy {

    private String user;
    private String password;

    public AppMobile(String user, String password){
        this.user=user;
        this.password=password;
    }

    @Override
    public void addingMoney(int amount) {
        System.out.println(amount + " $ to your account using the mobile application");
    }

}