package com.call.manag;

import java.util.Date;
import java.util.List;

public interface IAppareil {
    public  void enregistrer(Contact c);
    public  void enregistrer(Appel appel, String numTel);
    public  Contact consulter(int numero) throws Exception;
    public  List<Contact> consulter(String mc);
    public  double couAppels();
    public  double couAppels(Date d1, Date d2);
    public  double couAppels(int numeroContact);

}
