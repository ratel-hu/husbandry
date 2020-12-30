package com.husbandry.struggle.controller.husbandry.model.dto;

/**
 * @Author ratelhu
 * @Date 2020/12/30 14:14
 * @Version 1.0
 */
public class BaseMessage {
    //接收方
    private String ToUserName;
    //发送方
    private String FromUserName;
    //消息的创建时间
    private long CreateTime;
    //消息类型
    private String MsgType;

    public String getToUserName() {
        return ToUserName;
    }
    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }
    public String getFromUserName() {
        return FromUserName;
    }
    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }
    public long getCreateTime() {
        return CreateTime;
    }
    public void setCreateTime(long createTime) {
        CreateTime = createTime;
    }
    public String getMsgType() {
        return MsgType;
    }
    public void setMsgType(String msgType) {
        MsgType = msgType;
    }
}
