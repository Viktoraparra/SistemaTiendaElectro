package org.lab.repositories.socket;
import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.lab.entities.Llave;
import org.lab.repositories.interfaces.I_LlaveR;
public class LlaveR implements I_LlaveR{
    private GenericR<Llave> ll;

    public LlaveR(String host, List<Integer>ports)
    { ll= new GenericR(host,ports,new Llave()); }
    

    @Override public void save(Llave llave)   { ll.save(llave);      }
    @Override public void remove(Llave llave) { ll.remove(llave);    }
    @Override public void update(Llave llave) { ll.update(llave);    }
    @Override public List<Llave> getAll()     {  return ll.getAll(); }

    @Override
    public Llave getByLlave(String llave) {
    List<Llave> lista=getAll()
                .stream()
                .filter(a->a.getNombre()==llave)
                .collect(Collectors.toList());
    return (lista==null || lista.isEmpty())?null:lista.get(0);
    }

    @Override
    public List<Llave> getByNombreDate(String nombre, Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
