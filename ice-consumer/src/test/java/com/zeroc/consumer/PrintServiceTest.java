package com.zeroc.consumer;

import com.zeroc.test.AbstractTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Administrator
 * @version 1.0
 */
public class PrintServiceTest extends AbstractTestCase {
    @Autowired
    private PrintService printService;

    @Test
    public void print() throws Exception {
        String result = printService.print(false, "testPrint111.11");
        System.out.println(result);
    }

}