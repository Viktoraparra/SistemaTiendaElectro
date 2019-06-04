package org.lab.services;
public class Services {
    public static void main(String[] args) {
        new Thread(new ServicioLlaveSave()).start();
        new Thread(new ServicioLlaveRemove()).start();
        new Thread(new ServicioLlaveGetAll()).start();
    }
}
