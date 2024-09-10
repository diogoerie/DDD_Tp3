package com.example.petfriends.events;

import java.time.Instant;
import java.util.UUID;

public abstract class BaseEvent {
    private final String eventId;
    private final long timestamp;

    public BaseEvent() {
        this.eventId = UUID.randomUUID().toString();
        this.timestamp = Instant.now().toEpochMilli();
    }

    public String getEventId() {
        return eventId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public abstract String getEventDetails();
}


