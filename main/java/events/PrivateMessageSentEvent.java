package events;


import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PrivateMessageSentEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean canceled;
    private Player from;
    private Player to;
    private String message;


    public PrivateMessageSentEvent(Player from,Player to, String message){
        this.from = from;
        this.to = to;
        this.message = message;
    }

    @Override
    public boolean isCancelled() {
        return canceled;
    }

    @Override
    public void setCancelled(boolean b) {
        canceled = b;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public Player getFrom() {
        return from;
    }

    public Player getTo() {
        return to;
    }
    public String getMessage() {
        return message;
    }

    public void setFrom(Player from) {
        this.from = from;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTo(Player to) {
        this.to = to;
    }

}
