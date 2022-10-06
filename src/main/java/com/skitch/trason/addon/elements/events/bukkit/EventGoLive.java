package com.skitch.trason.addon.elements.events.bukkit;

import com.github.twitch4j.events.ChannelGoLiveEvent;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class EventGoLive extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final ChannelGoLiveEvent event;
    private final String ChannelName;

    public EventGoLive(ChannelGoLiveEvent event) {
        this.event = event;
        this.ChannelName = event.getChannel().getName();
    }

    public ChannelGoLiveEvent getEvent() {
        return event;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

}
