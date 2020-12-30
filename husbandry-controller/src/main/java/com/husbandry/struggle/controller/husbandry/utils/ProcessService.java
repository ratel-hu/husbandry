package com.husbandry.struggle.controller.husbandry.utils;



import com.husbandry.struggle.controller.husbandry.model.dto.TextMessage;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
/**
 * @Author ratelhu
 * @Date 2020/12/30 14:22
 * @Version 1.0
 */
public class ProcessService {
    public static String dealRequest(HttpServletRequest request) throws IOException{
        //响应的XML串
        String respXml = "";

        //要响应的文本内容
        String respContent = "未知的消息类型";
        Map<String,String> requestMap = MessageUtil.parseXml(request);
        String fromUserName = requestMap.get("FromUserName");
        String toUserName = requestMap.get("ToUserName");
        String MsgType = requestMap.get("MsgType");
        String Content = requestMap.get("Content");

        System.out.println("用户给公众号发的消息为：" + Content);

        //构建一条文本消息
        TextMessage textMessage = new TextMessage();
        textMessage.setToUserName(fromUserName);
        textMessage.setFromUserName(toUserName);
        textMessage.setCreateTime(new Date().getTime());
        textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);

        if(MsgType.equals(MessageUtil.RESP_MESSAGE_TYPE_TEXT)){
            respContent = "王天泽的公众号收到了您的一条文本消息：" + Content + "，时间戳是：" + (new Date().getTime());
        }
        textMessage.setContent(respContent);
        respXml = MessageUtil.messageToXml(textMessage);

        System.out.println("respXml:"+respXml);

        return respXml;
    }
}
