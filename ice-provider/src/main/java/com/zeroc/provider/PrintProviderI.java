package com.zeroc.provider;

import Ice.Current;
import com.zeroc.api._PrintProviderDisp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * <p>功 能：</p>
 * <p>版 权：Copyright (c) 2017</p>
 * <p>创建时间：2017年4月26日 下午3:22:25</p>
 *
 * @author 王建
 * @version 1.0
 */
public class PrintProviderI extends _PrintProviderDisp {
    private static final long serialVersionUID = 1L;
    private static final Logger LOG = LogManager.getLogger(PrintProviderI.class);

    public String print(boolean parBool, String parStr, Current __current) {
        if (LOG.isInfoEnabled())
            LOG.info("print接口调用成功，parBool：{}，parStr：{}", parBool, parStr);
        return "parBool : " + parBool + " parStr : " + parStr;
    }
}