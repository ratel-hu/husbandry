package com.husbandry.struggle.controller.husbandry.service.impl;


import com.husbandry.struggle.controller.husbandry.utils.ProcessService;
import com.husbandry.struggle.controller.husbandry.utils.ValidationUtil;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @Author ratelhu
 * @Date 2020/12/30 14:24
 * @Version 1.0
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("get请求。。。。。。");

        //1.获得微信签名的加密字符串
        String signature = request.getParameter("signature");

        //2.获得时间戳信息
        String timestamp = request.getParameter("timestamp");

        //3.获得随机数
        String nonce = request.getParameter("nonce");

        //4.获得随机字符串
        String echostr = request.getParameter("echostr");

        System.out.println("获得微信签名的加密字符串："+signature);
        System.out.println("获得时间戳信息："+timestamp);
        System.out.println("获得随机数："+nonce);
        System.out.println("获得随机字符串："+echostr);

        PrintWriter out = response.getWriter();

        //验证请求确认成功原样返回echostr参数内容，则接入生效，成为开发者成功，否则失败
        if(ValidationUtil.checkSignature(signature, timestamp, nonce)){
            out.print(echostr);
        }

        out.close();
        out = null;
    }

    /**
     * 接受微信服务器发过来的XML数据包（通过post请求发送过来的）
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        //获取微信加密的签名字符串
        String signature = request.getParameter("signature");

        //获取时间戳
        String timestamp = request.getParameter("timestamp");

        //获取随机数
        String nonce = request.getParameter("nonce");

        PrintWriter out = response.getWriter();

        if(ValidationUtil.checkSignature(signature,timestamp,nonce)){
            String respXml = "";
            try {
                respXml = ProcessService.dealRequest(request);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            out.print(respXml);
        }
        out.close();
        out = null;
    }

}
