package org.gabo.javabrains;

import java.util.list;
import java.util.ArrayList;


public class MessageService{

    public List<Message> getAllMessages(){

        Message m1 = new Message(1L,"Hello World", "Gabo");
        Message m2 = new Message(2L, "Hello Jersey", "Gabo");
        List<Message> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        return list;

        }

}


