
public class User
{


    private boolean active;
    private SaID said;
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }
    public SaID getSaID()
    {
        return said;
    }

    public String getPassword() {
        return password;
    }

    public User(SaID said_, String username, String password) { //sprawdzanie wprowadzonych danych
        this.active=false;
        this.said = said_;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString(){
        return super.toString() + "USERNAME:" + username +"\nSAID"+ said.getSec_level()+
                "\n" + (active? "STATUS: ACTIVE\n": "STATUS: INACTIVE\n");
    }

}
