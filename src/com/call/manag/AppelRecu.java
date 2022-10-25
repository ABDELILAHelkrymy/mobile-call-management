package com.call.manag;

import java.util.Date;

public class AppelRecu extends Appel{

    @Override
    public double cout() {
        return 0;
    }

    public AppelRecu() {
        super();
    }

    public AppelRecu(int numero, Date dateAppel, double dureeAppel) {
        super(numero, dateAppel, dureeAppel);
    }
}
