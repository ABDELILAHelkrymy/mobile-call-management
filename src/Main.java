import com.call.manag.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {

        IAppareil appareil = new Appareil();
        appareil.enregistrer(new Contact(1, "C1", "0698287617"));
        appareil.enregistrer(new Contact(2, "C2", "0697887619"));
        appareil.enregistrer(new AppelEmi(1, new Date(), 66),"0698287617");
        appareil.enregistrer(new AppelEmi(2, new Date(), 125),"0698287617");
        appareil.enregistrer(new AppelEmi(3, new Date(), 122),"0697887619");
        appareil.enregistrer(new AppelRecu(4, new Date(), 98),"0698287617");

        System.out.println("----------------------------");
        System.out.println("Consulter un contact sachant son numéro");
        try {
            Contact c = appareil.consulter(1);
            System.out.println(c.toString());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("----------------------------");
        System.out.println("Consulter les contacts par un mot clé");
        List<Contact> contacts = appareil.consulter("C1");
        for (Contact c:contacts){
            System.out.println(c.toString());
        }

        System.out.println("----------------------------");
        System.out.println("Consulter le cout total des appels");
        System.out.println("Le cout total est : "+ appareil.couAppels());

        System.out.println("----------------------------");
        System.out.println("Consulter le cout total des appels d'un contact");
        System.out.println("Le cout total de contact 1 est : "+ appareil.couAppels(1));

        System.out.println("----------------------------");
        System.out.println("Consulter le cout total des appels entre deux date");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d1 = sdf.parse("21/10/2022");
        Date d2 = sdf.parse("25/10/2022");
        System.out.println("Le cout total est : "+ appareil.couAppels(d1, d2));
    }
}