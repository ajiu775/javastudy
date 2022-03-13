package study.designpatterns.listener;

import java.util.EventListener;

public interface MonitorListener extends EventListener {

    public void handleEvent(EmailEvent event);
}
