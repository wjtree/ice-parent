package com.zeroc.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.Assert;

import java.util.Map;

/**
 * <p>功 能：ICE服务端启动与销毁管理</p>
 * <p>版 权：Copyright (c) 2017</p>
 * <p>创建时间：2017年2月13日 上午11:41:11</p>
 *
 * @author 王建
 * @version 1.0
 */
public class IceServerFactory extends Ice.Application {
    private transient static final Logger LOG = LogManager.getLogger(IceClientFactory.class);

    /**
     * ICE服务端参数
     */
    private IceParameter iceParameter;

    /**
     * ICE服务配置
     */
    public int run(String[] args) {
        int status = 0;
        try {
            // 获取ICE服务端点
            String endpoints = communicator().getProperties().getProperty("IceServer");
            // 获取指定的ICE服务适配器
            Ice.ObjectAdapter adapter = communicator().createObjectAdapterWithEndpoints(iceParameter.getIceAdapterName(), endpoints);
            // 设置适配器中的服务标识
            for (Map.Entry<String, Ice.Object> entry : iceParameter.getIceServantMap().entrySet())
                adapter.add(entry.getValue(), communicator().stringToIdentity(entry.getKey()));
            // 启动指定服务
            adapter.activate();
            // 阻塞线程，保持服务开启状态
            communicator().waitForShutdown();
        } catch (Exception e) {
            status = -1;
            LOG.error("ICE服务配置出错", e);
        }
        return status;
    }

    /**
     * 启动ICE服务端
     */
    public void init() {
        // ICE服务启动线程
        new Thread() {
            public void run() {
                try {
                    // 前置条件判断
                    Assert.requireNonEmpty(iceParameter, "ICE配置文件路径不能为空");
                    Assert.requireNonEmpty(iceParameter.getIceCfgFilePath(), "ICE服务端配置文件路径不能为空");
                    Assert.requireNonEmpty(iceParameter.getIceServantMap(), "ICE服务名称集合不能为空");
                    // 启动ICE服务端
                    if (LOG.isInfoEnabled())
                        LOG.info("ICE服务端线程已启动...");

                    main(iceParameter.getIceAppName(), new String[]{}, iceParameter.getIceCfgFilePath());
                } catch (Exception e) {
                    LOG.error("ICE服务端线程启动出错", e);
                }
            }
        }.start();
    }

    /**
     * 停止ICE服务端
     */
    public void destroy() {
        try {
            if (null != communicator())
                communicator().destroy();
        } catch (Exception e) {
            LOG.error("停止ICE服务端线程出错", e);
        }
    }

    /**
     * 获取ICE服务端参数
     *
     * @return
     */
    public IceParameter getIceParameter() {
        return iceParameter;
    }

    /**
     * 设置ICE服务端参数
     *
     * @param iceParameter
     */
    public void setIceParameter(IceParameter iceParameter) {
        this.iceParameter = iceParameter;
    }
}