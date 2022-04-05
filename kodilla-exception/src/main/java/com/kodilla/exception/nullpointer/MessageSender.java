package com.kodilla.exception.nullpointer;

public class MessageSender {
    public void sendMessageTo(User user, String message) throws MessageNotSentException {
        if (user != null) {
            System.out.println("Sending message: " + message + " to: " + user.getUsername());
         } else {
            throw new MessageNotSentException ("Objec User was null");
        }
        }
    }

