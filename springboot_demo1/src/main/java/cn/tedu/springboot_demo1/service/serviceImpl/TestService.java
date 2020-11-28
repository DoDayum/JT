package cn.tedu.springboot_demo1.service.serviceImpl;


import cn.tedu.springboot_demo1.service.Service1;
import org.springframework.stereotype.Service;

@Service
public class TestService implements Service1 {
    @Override
    public void test1() {
        System.out.println("hello");
    }
}
