package events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PrivateMessageReceiveEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private boolean canceled;


    private Player from;
    private Player to;
    private String message;

    public PrivateMessageReceiveEvent(String message,Player from,Player to){
        this.message = message;
        this.to = to;
        this.from = from;
    }

    public Player getTo() {
        return to;
    }

    public Player getFrom() {
        return from;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean isCancelled() {
        return canceled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.canceled = b;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
