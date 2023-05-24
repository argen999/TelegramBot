package org.example.service.serviceimpl;

import lombok.extern.log4j.Log4j;
import org.example.service.AnswerConsumer;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

@Service
@Log4j
public class AnswerConsumerImpl implements AnswerConsumer {

    @Override
    public void consume(SendMessage sendMessage) {

    }

}
