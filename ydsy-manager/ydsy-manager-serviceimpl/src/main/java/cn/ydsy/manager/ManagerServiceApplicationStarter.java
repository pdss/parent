package cn.ydsy.manager;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;


@MapperScan(value = "cn.ydsy.manager.mapper")
@ComponentScan("cn.ydsy")
@SpringBootApplication
@EnableDubbo
@EnableCaching
public class ManagerServiceApplicationStarter {

    public static void main(String[] args) throws InterruptedException {
        new SpringApplicationBuilder()
                .sources(ManagerServiceApplicationStarter.class)
                .web(WebApplicationType.NONE)
                .run(args);

//        CountDownLatch countDownLatch = new CountDownLatch(1);
////        countDownLatch.await();
    }
}