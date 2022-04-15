package com.spring.ioc.springIOC.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service("TelegramService")
@Lazy
public class TelegramServiceImpl implements MessageService{

	private String destination;
    private String text;

    public TelegramServiceImpl() {
        System.out.println("1.7. TelegramServiceImpl constructor called.");
    }

    private String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void send(String msg) {
        System.out.println("4.3. Telegram Service called and message is: " + msg + " destination: " + getDestination());
    }
}
