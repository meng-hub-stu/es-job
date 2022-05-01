package com.bfxy.esjob.config;

import com.bfxy.esjob.task.MyTwoSimpleJob;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Mengdexin
 * @date 2022 -04 -30 -22:33
 */
@Configuration
public class MyTwoSimpleJobConfig extends MySimpleJobConfig{

    @Bean
    @Override
    public SimpleJob simpleJob(){
        return new MyTwoSimpleJob();
    }

}
