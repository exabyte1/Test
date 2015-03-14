
import java.util.logging.Level;
import java.util.logging.Logger;
import tutorial.Domain.Event;
import tutorial.Helper.HibernateUtil;
import tutorial.Helper.MainHibernate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Exabyte
 */
public class Test {
    public static void main(String[] args) {
        try {
            Event get = (Event) HibernateUtil.get(Event.class, 51);
            System.out.println("get 51 " + get.getTitle());
        } catch (Exception ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
