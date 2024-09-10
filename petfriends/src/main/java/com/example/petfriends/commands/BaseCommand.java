package com.example.petfriends.commands;

import java.util.UUID;

public abstract class BaseCommand {
    private final String commandId;

    public BaseCommand() {
        this.commandId = UUID.randomUUID().toString();
    }

    public String getCommandId() {
        return commandId;
    }
}
