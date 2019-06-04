package org.lab.repositories.interfaces;
import java.util.List;

/*
    Declaro una interfaz generica que brinda la facilidad
    de hacer la implementacion de un objeto o varios como una lista
*/

public interface I_GenericR <E> {
    void save(E e);
    void remove(E e);
    void update(E e);
    List<E> getAll();
}