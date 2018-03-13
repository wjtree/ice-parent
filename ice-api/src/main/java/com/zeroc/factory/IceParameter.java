package com.zeroc.factory;

import java.io.Serializable;
import java.util.Map;

/**
 * <p>功 能：ICE参数实体类</p>
 * <p>版 权：Copyright (c) 2017</p>
 * <p>创建时间：2017年2月14日 上午11:52:11</p>
 *
 * @author 王建
 * @version 1.0
 */
public class IceParameter implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * <公共参数> ICE配置文件路径
     */
    private String iceCfgFilePath;

    /**
     * <公共参数> ICE应用名称
     */
    private String iceAppName;

    /**
     * <服务端参数> ICE适配器名称，默认为 IceAdapter
     */
    private String iceAdapterName = "IceAdapter";

    /**
     * <服务端参数> ICE服务键值对
     */
    private Map<String, Ice.Object> iceServantMap;

    /**
     * <客户端参数> ICE客户端连接协议类型，可选项：tcp，udp，ssl，默认tcp
     */
    private String iceType = "tcp";

    /**
     * <客户端参数> ICE服务端IP
     */
    private String iceIP = "127.0.0.1";

    /**
     * <客户端参数> ICE服务端连接端口
     */
    private String icePort = "10000";

    /**
     * <客户端参数> ICE客户端服务代理类集合
     */
    private Map<String, String> icePrxMap;

    /**
     * <客户端参数> ICE连接超时时间，单位：毫秒，默认-1
     */
    private Integer iceTimeOut = -1;

    /**
     * <客户端参数> ICE连接是否启用SSL，默认false
     */
    private Boolean iceSecure = false;

    /**
     * <公共参数> ICE配置文件路径
     *
     * @return
     */
    public String getIceCfgFilePath() {
        return iceCfgFilePath;
    }

    /**
     * <公共参数> ICE配置文件路径
     *
     * @param iceCfgFilePath
     */
    public void setIceCfgFilePath(String iceCfgFilePath) {
        this.iceCfgFilePath = iceCfgFilePath;
    }

    /**
     * <公共参数> ICE应用名称
     *
     * @return
     */
    public String getIceAppName() {
        return iceAppName;
    }

    /**
     * <公共参数> ICE应用名称
     *
     * @param iceAppName
     */
    public void setIceAppName(String iceAppName) {
        this.iceAppName = iceAppName;
    }

    /**
     * <服务端参数> ICE适配器名称，默认为 IceAdapter
     *
     * @return the iceAdapterName
     */
    public String getIceAdapterName() {
        return iceAdapterName;
    }

    /**
     * <服务端参数> ICE适配器名称，默认为 IceAdapter
     *
     * @param iceAdapterName the iceAdapterName to set
     */
    public void setIceAdapterName(String iceAdapterName) {
        this.iceAdapterName = iceAdapterName;
    }

    /**
     * <服务端参数> ICE服务键值对
     *
     * @return the iceServantMap
     */
    public Map<String, Ice.Object> getIceServantMap() {
        return iceServantMap;
    }

    /**
     * <服务端参数> ICE服务键值对
     *
     * @param iceServantMap the iceServantMap to set
     */
    public void setIceServantMap(Map<String, Ice.Object> iceServantMap) {
        this.iceServantMap = iceServantMap;
    }

    /**
     * <客户端参数> ICE客户端连接协议类型，可选项：tcp，udp，ssl，默认tcp
     *
     * @return the iceType
     */
    public String getIceType() {
        return iceType;
    }

    /**
     * <客户端参数> ICE客户端连接协议类型，可选项：tcp，udp，ssl，默认tcp
     *
     * @param iceType the iceType to set
     */
    public void setIceType(String iceType) {
        this.iceType = iceType;
    }

    /**
     * <客户端参数> ICE服务端IP
     *
     * @return the iceIP
     */
    public String getIceIP() {
        return iceIP;
    }

    /**
     * <客户端参数> ICE服务端IP
     *
     * @param iceIP the iceIP to set
     */
    public void setIceIP(String iceIP) {
        this.iceIP = iceIP;
    }

    /**
     * <客户端参数> ICE服务端连接端口
     *
     * @return the icePort
     */
    public String getIcePort() {
        return icePort;
    }

    /**
     * <客户端参数> ICE服务端连接端口
     *
     * @param icePort the icePort to set
     */
    public void setIcePort(String icePort) {
        this.icePort = icePort;
    }

    /**
     * <客户端参数> ICE客户端服务代理类集合
     *
     * @return the icePrxMap
     */
    public Map<String, String> getIcePrxMap() {
        return icePrxMap;
    }

    /**
     * <客户端参数> ICE客户端服务代理类集合
     *
     * @param icePrxMap the icePrxMap to set
     */
    public void setIcePrxMap(Map<String, String> icePrxMap) {
        this.icePrxMap = icePrxMap;
    }

    /**
     * <客户端参数> ICE连接超时时间，单位：毫秒，默认-1
     *
     * @return the iceTimeOut
     */
    public Integer getIceTimeOut() {
        return iceTimeOut;
    }

    /**
     * <客户端参数> ICE连接超时时间，单位：毫秒，默认-1
     *
     * @param iceTimeOut the iceTimeOut to set
     */
    public void setIceTimeOut(Integer iceTimeOut) {
        this.iceTimeOut = iceTimeOut;
    }

    /**
     * <客户端参数> ICE连接是否启用SSL，默认false
     *
     * @return the iceSecure
     */
    public Boolean getIceSecure() {
        return iceSecure;
    }

    /**
     * <客户端参数> ICE连接是否启用SSL，默认false
     *
     * @param iceSecure the iceSecure to set
     */
    public void setIceSecure(Boolean iceSecure) {
        this.iceSecure = iceSecure;
    }
}