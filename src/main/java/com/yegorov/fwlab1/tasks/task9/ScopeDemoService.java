package com.yegorov.fwlab1.tasks.task9;

import com.yegorov.fwlab1.tasks.task9.beans.PrototypeBean;
import com.yegorov.fwlab1.tasks.task9.beans.SingletonBean;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScopeDemoService {

    private final SingletonBean singletonBeanA;
    private final SingletonBean singletonBeanB;

    private final ObjectFactory<PrototypeBean> prototypeFactory;

    @Autowired
    public ScopeDemoService(SingletonBean singletonBeanA,
                            SingletonBean singletonBeanB,
                            ObjectFactory<PrototypeBean> prototypeFactory) {
        this.singletonBeanA = singletonBeanA;
        this.singletonBeanB = singletonBeanB;
        this.prototypeFactory = prototypeFactory;
    }

    public String demoOnce() {
        PrototypeBean p1 = prototypeFactory.getObject();
        PrototypeBean p2 = prototypeFactory.getObject();
        return new StringBuilder()
                .append("Singleton A id: ").append(singletonBeanA.getId()).append("\n")
                .append("Singleton B id: ").append(singletonBeanB.getId()).append("\n")
                .append("→ They are the SAME: ").append(singletonBeanA.getId().equals(singletonBeanB.getId())).append("\n\n")
                .append("Prototype #1 id: ").append(p1.getId()).append("\n")
                .append("Prototype #2 id: ").append(p2.getId()).append("\n")
                .append("→ They are DIFFERENT: ").append(!p1.getId().equals(p2.getId()))
                .toString();
    }
}
