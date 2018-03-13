package com.zeroc.consumer;

import com.zeroc.api.PrintProviderPrx;
import com.zeroc.factory.IceClientHolder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


/**
 * <p>功 能：</p>
 * <p>版 权：Copyright (c) 2017</p>
 * <p>创建时间：2017年4月26日 下午3:26:09</p>
 *
 * @author 王建
 * @version 1.0
 */
@Service
public class PrintService extends IceClientHolder<PrintProviderPrx> {
    private static final Logger LOG = LogManager.getLogger(PrintService.class);

    protected PrintProviderPrx getProviderPrx() {
        return getObjPrx("print");
    }

    public String print(boolean parBool, String parStr) {
        String result = null;
        try {
            result = getProviderPrx().print(parBool, parStr);
        } catch (Exception e) {
            LOG.error("ICE_PrintProvider_print方法调用失败", e);
        }
        return result;
    }
}