package org.lab.repositories.interfaces;
import java.util.List;
public interface I_GenericR <E> {
    void save(E e);
    void remove(E e);
    void update(E e);
    List<E> getAll();
}