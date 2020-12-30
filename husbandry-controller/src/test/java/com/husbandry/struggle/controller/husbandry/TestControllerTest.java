package com.husbandry.struggle.controller.husbandry;

import com.husbandry.struggle.controller.ControllerApplication;
import com.husbandry.struggle.controller.TestListener;
import com.husbandry.struggle.controller.husbandry.dao.TestDao;
import com.husbandry.struggle.controller.husbandry.thread.MyThread;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;


/**
 * @Author ratelhu
 * @Date 2020/12/29 9:58
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@TestExecutionListeners(listeners = {TestListener.class, DependencyInjectionTestExecutionListener.class})
@SpringBootTest(classes = ControllerApplication.class)
@Slf4j
public class TestControllerTest {
    @Autowired
    private TestDao dao;
//    @Autowired
//    private MyThread thread;
    @Test
    public void test() throws InterruptedException {
//        com.husbandry.struggle.controller.husbandry.model.entity.Test t1 = dao.getDataById(1);
//        com.husbandry.struggle.controller.husbandry.model.entity.Test t2 = dao.getDataById(1);
//        t1.setAge(12);
//        t2.setAge(14);
//
//        dao.upDate(t2);
//        dao.upDate(t1);
//        MyThread thread = new MyThread();
//        Thread read1 = new MyThread();
//        Thread read2 = new MyThread();
//        read1.run();
//        read2.run();
//        read1.join();
//        read2.join();

    }
}