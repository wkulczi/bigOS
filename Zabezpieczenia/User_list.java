import com.sun.jmx.remote.internal.ClientCommunicatorAdmin;

import java.util.*;
//user list     - no lista użytkowników {lista, obecnie zalogowany użytkownik};     login, logout, create_acc, del_acc

public class User_list implements Iterable<User> //czemu iterable? not sure, może się trzeba pozbyć
{
    private List<User> UL;
    private User current_user;

    public User_list() {
        UL=Collections.<User>emptyList();
        UL.add(new User(SaID.SYSTEM,"SYSTEM","SYS"));
        UL.add(new User(SaID.HIGH, "admin","admin"));
        current_user=new User(SaID.HIGH, "admin","admin");

    }
    public SaID get_current_user_said()
    {
        return current_user.getSaID();
    }

    public boolean login(String name_, String pwd_) {
        for (User u : UL) {
            if (u.getUsername().equals(name_)) {
                if (u.getPassword().equals(pwd_)) {
                    System.out.println("Access granted.");
                    current_user=u;
                    return true;
                } else {
                    System.out.println("Wrong password.");
                    return false;
                }
            }
        }
        System.out.println("User not found");
        return false;
    }

    //public boolean logout(){}
//
// case "create_acc":
//
//        Scanner userIn=new Scanner();
//            System.out.print("Enter username:");
//        String usrname=userIn.next();
//            System.out.print("Enter password:");
//        String passwrd=userIn.next();//todo password masking
//            System.out.print("Repeat password:");
//        String passwrd_1=userIn.next();
//            if(passwrd.equals(passwrd_1))
//        {
//            System.out.print("Enter SaID:");
//            int said=userIn.nextInt();
//            if (current_user.getSaID().getSec_level())
//            //że jak jest na gościu to nie może utworzyć sobie admina
//        }
//
//    case "del_acc":
//    Scanner userIn=new Scanner();
//    System.out.print("Enter username:");
//    String usrname=userIn.next();
//    if (usrname.equals(current_user.getUsername))
//        System.out.print("Enter password:");
//        String password=userIn.next();
//        if (password=current_user.getPassword())
//            //delete
//    else
//    {
//        //trzeba sprawdzić, czy ten user, którego nazwa została wprowadzona nie ma uprawnień większych od aktywnego
//        //jak nie ma to tylko hasło obecnego użytkownika do potwierdzenia
//    }

    public void add_user(User u_) //create_acc handled in switch-case
    {
        if (this.find(u_.getUsername())) throw new IllegalStateException("user with this name aleready exists");
    else{
            UL.add(u_);
        }
    }

    private boolean find(String username)
    {
        for(User u: UL)
        {
            if(u.getUsername().equals(username)) return true;
        }
        return false;
    }

    public int user_list_size() {return UL.size();}

    public void erase(String usrname)
    {
        for (User u: UL)
        {
            if (u.getUsername().equals(usrname))
            {
                UL.remove(u);
                break;
            }
        }
    }


    public void printAll(){
        for (User p : UL){
            System.out.println(p.toString());
            System.out.println();
        }
    }
    @Override
    public Iterator<User> iterator() {
        return UL.iterator();
    }
}
