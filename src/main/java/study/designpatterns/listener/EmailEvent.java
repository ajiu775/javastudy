package study.designpatterns.listener;

import java.util.EventObject;

public class EmailEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public EmailEvent(Object source) {
        super(source);
    }

    public void sendEmail(){
        System.out.println("发送邮件成功");
    }
}
