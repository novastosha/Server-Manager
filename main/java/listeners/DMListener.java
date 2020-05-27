package listeners;

import events.PrivateMessageReceiveEvent;
import events.PrivateMessageSentEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

public class DMListener implements Listener {
    /*
    THIS IS A TEST LISTENER
     */
    public void onDMSend(PrivateMessageSentEvent event){
        Bukkit.broadcastMessage(event.getMessage());
        event.setMessage("OK");
    }
    public void onDMGet(PrivateMessageReceiveEvent event){
        Bukkit.broadcastMessage(event.getMessage());
    }
}
