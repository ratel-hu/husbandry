package com.husbandry.struggle.controller.husbandry.test;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;

/**
 * @Author ratelhu
 * @Date 2020/12/30 11:28
 * @Version 1.0
 */
public class WeChatSend {

    public static void main(String[] args) throws InterruptedException {
        // 好友昵称
//        String friendNickName = "文件传输助手";
        String friendNickName = "大漂亮";

        searchMyFriendAndSend(friendNickName);
    }

    private static void searchMyFriendAndSend(String friendNickName) throws InterruptedException {
        // 创建Robot对象
        Robot robot = getRobot();
        //打开微信 Ctrl+Alt+W
        assert robot != null;
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_W);
        //释放Ctrl按键，像Ctrl，退格键，删除键这样的功能性按键，在按下后一定要释放
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_ALT);

        // 该延迟不能少，否则无法搜索
        robot.delay(1000);

        // Ctrl + F 搜索指定好友
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // 将好友昵称发送到剪切板
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable tText = new StringSelection(friendNickName);
        clip.setContents(tText, null);
        // 以下两行按下了ctrl+v，完成粘贴功能
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(1000);

        // 发送消息
        sendMsg();
    }

    private static void sendMsg() throws InterruptedException {
        String[] mottoes = {
                "我只爱你四天，春天夏天秋天冬天！",
                "我只爱你三天，昨天,今天,明天！",
                "我只爱你两天，白天，黑天！",
                "我只爱你一天，每一天！",
                "[玫瑰]爱你么么哒！",
                "[呲牙][坏笑]",
                "[奸笑]"
        };
        for (String motto : mottoes) {
            sendOneMsg(motto);
        }
        Thread.sleep(2000);

        sendOneMsg("[得意]就问你，腻不腻害！");
    }

    private static void sendOneMsg(String msg) {
        // 创建Robot对象
        Robot robot = getRobot();
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        // 将字符串复制到剪切板
        Transferable tText = new StringSelection(msg);
        clip.setContents(tText, null);
        // 以下两行按下了ctrl+v，完成粘贴功能
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        // 回车发送
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(1000);
    }

    private static Robot getRobot(){
        // 创建Robot对象
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        return robot;
    }
}
