package com.github.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author yuzhuangzhuang
 * @create 2020/12/09 22:01
 *
 * com.github.mapper: 自动生成的mapper
 * com.github.dao: 自定义dao（mapper）
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.github.mapper", "com.github.dao"})
public class MyBatisConfig {
}
