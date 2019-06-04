package org.lab.repositories.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;
import org.lab.entities.Llave;
import org.lab.repositories.interfaces.I_GenericR;
import org.lab.repositories.interfaces.I_LlaveR;

public class LlaveR implements I_LlaveR{
    private I_GenericR<Llave> ll;
    public LlaveR(Connection conn){ ll=new GenericR(conn,new Llave());    }
    @Override public void save(Llave llave)   { ll.save(llave);       }
    @Override public void remove(Llave llave) { ll.remove(llave);     }
    @Override public void update(Llave llave) { ll.update(llave);     }
    @Override public List<Llave> getAll()     { return ll.getAll();   }

    @Override public Llave getByLlave(String llave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override public List<Llave> getByNombreDate(String nombre, Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
