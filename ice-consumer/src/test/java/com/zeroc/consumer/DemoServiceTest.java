package com.zeroc.consumer;

import com.zeroc.test.AbstractTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Administrator
 * @version 1.0
 */
public class DemoServiceTest extends AbstractTestCase {
    @Autowired
    private DemoService demoService;

    @Test
    public void sayHelo() throws Exception {
        String result = demoService.sayHelo(1, "test111");
        System.out.println(result);
    }

}