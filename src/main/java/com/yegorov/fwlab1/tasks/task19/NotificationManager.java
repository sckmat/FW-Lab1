package com.yegorov.fwlab1.tasks.task19;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class NotificationManager {

    private final List<NotificationService> notificationServices;
    private final Map<String, NotificationService> notificationMap;

    @Autowired
    public NotificationManager(List<NotificationService> notificationServices,
                               Map<String, NotificationService> notificationMap) {
        this.notificationServices = notificationServices;
        this.notificationMap = notificationMap;
    }

    public void broadcast(String message) {
        System.out.println("Broadcasting message to all services:");
        notificationServices.forEach(s -> s.send(message));
    }

    public void sendToSpecific(String beanName, String message) {
        NotificationService service = notificationMap.get(beanName);
        if (service != null) {
            service.send(message);
        } else {
            System.out.println("No service found for type: " + beanName);
        }
    }
}
