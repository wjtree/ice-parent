package com.zeroc.consumer;

import com.zeroc.api.DemoProviderPrx;
import com.zeroc.factory.IceClientHolder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


/**
 * <p>功 能：</p>
 * <p>描 述：</p>
 * <p>版 权：Copyright (c) 2017</p>
 * <p>创建时间：2017年4月26日 上午2:21:16</p>
 *
 * @author WangJian
 * @version 1.0
 */
@Service
public class DemoService extends IceClientHolder<DemoProviderPrx> {
    private static final Logger LOG = LogManager.getLogger(DemoService.class);

    protected DemoProviderPrx getProviderPrx() {
        return getObjPrx("demo");
    }

    /**
     * @param parInt
     * @param parStr
     * @return
     */
    public String sayHelo(int parInt, String parStr) {
        String result = null;
        try {
            result = getProviderPrx().sayHelo(parInt, parStr);
        } catch (Exception e) {
            LOG.error("ICE_DemoProvider_sayHelo方法调用失败", e);
        }
        return result;
    }
}