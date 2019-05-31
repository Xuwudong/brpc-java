package com.baidu.brpc.protocol.standard;

import com.baidu.brpc.protocol.Options;
import com.baidu.brpc.protocol.Protocol;
import com.baidu.brpc.protocol.ProtocolFactory;

public class BaiduRpcProtocolFactory implements ProtocolFactory {

    @Override
    public Integer getProtocolType() {
        return Options.ProtocolType.PROTOCOL_BAIDU_STD_VALUE;
    }

    @Override
    public Protocol createProtocol(String encoding) {
        return new BaiduRpcProtocol();
    }
}
