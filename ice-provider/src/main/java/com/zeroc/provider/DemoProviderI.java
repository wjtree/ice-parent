package com.zeroc.provider;

import Ice.Current;
import com.zeroc.api._DemoProviderDisp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * <p>功 能：</p>
 * <p>描 述：</p>
 * <p>版 权：Copyright (c) 2017</p>
 * <p>创建时间：2017年4月26日 上午1:37:39</p>
 *
 * @author WangJian
 * @version 1.0
 */
public class DemoProviderI extends _DemoProviderDisp {
    private static final long serialVersionUID = 1L;
    private static final Logger LOG = LogManager.getLogger(DemoProviderI.class);

    public String sayHelo(int parInt, String parStr, Current __current) {
        if (LOG.isInfoEnabled())
            LOG.info("sayHelo接口调用成功，parInt：{}，parStr：{}", parInt, parStr);

        return "parInt : " + parInt + " parStr : " + parStr;
    }
}