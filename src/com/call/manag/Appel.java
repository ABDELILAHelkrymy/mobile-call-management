package com.call.manag;

import java.util.Date;

public abstract class Appel {
    protected int numero;
    protected Date dateAppel;
    protected double dureeAppel;
    protected Contact contact;


    public Appel() {
        super();
    }

    public Appel(int numero, Date dateAppel, double dureeAppel) {
        super();
        this.numero = numero;
        this.dateAppel = dateAppel;
        this.dureeAppel = dureeAppel;
    }

    public abstract double cout();

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDateAppel() {
        return dateAppel;
    }

    public void setDateAppel(Date dateAppel) {
        this.dateAppel = dateAppel;
    }

    public double getDureeAppel() {
        return dureeAppel;
    }

    public void setDureeAppel(double dureeAppel) {
        this.dureeAppel = dureeAppel;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
