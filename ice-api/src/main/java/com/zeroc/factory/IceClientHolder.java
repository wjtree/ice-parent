package com.zeroc.factory;

import Ice.ObjectPrx;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>功 能：ICE客户端代理对象获取类</p>
 * <p>版 权：Copyright (c) 2017</p>
 * <p>创建时间：2017年2月15日 下午5:34:43</p>
 *
 * @author 王建
 * @version 1.0
 */
public abstract class IceClientHolder<T extends ObjectPrx> {
    private IceClientFactory iceClientFactory;

    @Autowired
    public void setIceClientFactory(IceClientFactory iceClientFactory) {
        this.iceClientFactory = iceClientFactory;
    }

    public IceClientFactory getIceClientFactory() {
        return iceClientFactory;
    }

    /**
     * 获取 ObjectPrx 代理对象
     *
     * @param objPrxKey
     * @return
     */
    @SuppressWarnings("unchecked")
    public T getObjPrx(String objPrxKey) {
        return (T) iceClientFactory.getPrxByKey(objPrxKey);
    }

    /**
     * 获取代理对象
     *
     * @return
     */
    protected abstract T getProviderPrx();
}