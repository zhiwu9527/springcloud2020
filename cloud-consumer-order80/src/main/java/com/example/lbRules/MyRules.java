package com.example.lbRules;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhu_wm
 * @date 2021/8/2 22:20
 */
@Configuration
public class MyRules {

    @Bean
    public IRule myRule() {
//        return new RandomRule();
        return new RoundRobinRule();
    }


}
