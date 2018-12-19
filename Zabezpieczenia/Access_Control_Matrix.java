
import com.google.common.collect.Table;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

//ACM           - cały ACM              {table z guavy <R,C,V>};                    add, remove, view, edit

import java.util.Map;

public class Access_Control_Matrix {
    Table<SaID, String, Integer> ACM= HashBasedTable.create(); //znalazlem tablicę
    public Access_Control_Matrix(){
        ACM.put(SaID.HIGH,"file.txt",6); //tutaj jak jest init to muszę już zbudować tę macierz z tych wszystkich rzeczy, które już są dostępne na starcie systemu
        ACM.put(SaID.SYSTEM,"file.txt",6);}

    public boolean add2ACL(String fname, Integer value, SaID a) {
        if (ACM.containsColumn(fname))
        {
            System.out.println("That file already exists in ACL.");
            return false;
        }
        else
        {

        }
        return true;
    }



}


//nie wiem, czy chcecie, żeby uprawnienia były zależne od konkretnego użytkownika, czy od grupy
