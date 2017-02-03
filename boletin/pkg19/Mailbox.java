/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg19;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Adri
 */
public class Mailbox {

    private ArrayList<Mail> mailbox = new ArrayList<Mail>();

    public Mailbox() {

    }

    public int mailboxSize() {
        return mailbox.size();
    }

    public void add(Mail c) {
        mailbox.add(c);
    }

    public boolean toRead() {
        boolean aux = true;
        for (int i = 0; i < mailbox.size(); i++) {
            if (mailbox.get(i).isLeido()) {
                aux = false;
            } else {
                aux = true;
            }
        }
        return aux;
    }

    public String showFirstNonRead() {
        String aux = "";
        for (int i = 0; i < mailbox.size(); i++) {
            if (!mailbox.get(i).isLeido()) {
              aux = mailbox.get(i).getContenido();
            } 
        }
        return aux;
    }

    public String show(int num) {
        return mailbox.get(num).getContenido();
    }

    public void deleteMail(int num) {
        mailbox.remove(num);
    }
}
