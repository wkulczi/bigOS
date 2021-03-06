package filemodule;

/**
 *
 * @author Weronika Kowalska
 */
public class File {
    //public Semaphor s;                    //zmienna semaforowa
    private String name;                    //nazwa pliku
    private String userName;                //nazwa użytkownika
    private Integer size, index;            //rozmiar pliku i index początku pliku w tablicy FAT
    
    public File() {
        this.name = "";       //format nazwy pliku: pierwsza mała litera, potem cyfra
        this.userName = ""; //????????????
        this.size = -2;     //żeby przy alokacji mozna było rozpoznać czy ma już przydzielony indeks czy nie
        this.index = 0;
    }

    //gettery
    public Integer getIndex() { return index; }

    public String getName() { return name; }

    public String getUserName() { return userName; }

    public Integer getSize() { return size; }

    //settery
    public void setIndex(Integer index) { this.index = index; }

    public void setName(String name) { this.name = name; }

    public void setUserName(String userName) { this.userName = userName; }
     
    public void setSize(Integer size) { this.size = size; }
    
}
