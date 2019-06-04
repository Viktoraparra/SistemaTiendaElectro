package org.lab.repositories.interfaces;

import java.sql.Date;
import java.util.List;
import org.lab.entities.Llave;

public interface I_LlaveR {
    void save(Llave llave);
    void remove(Llave llave);
    void update(Llave llave);
    List<Llave>getAll();
    Llave getByLlave(String llave);
    List<Llave>getByNombreDate(String nombre, Date date);    
}
