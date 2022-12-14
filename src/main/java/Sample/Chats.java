package Sample;

import java.util.ArrayList;

public class Chats {
    public int ID;
    public String sender;
    public String receiver;
    public StringBuilder text;
    public int replied;
    public int forwarded;
    public static ArrayList<Chats> allChats = new ArrayList<Chats>();

    @Override
    public String toString() {
        return "Chats{" +
                "ID=" + ID +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", text=" + text +
                '}';
    }
}
