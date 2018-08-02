/**
 * BBD Service Inc
 * All Rights Reserved @2017
 */
package com.light.springboot.web.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


/**
 * @author jiapingWang
 * @version $Id: MybatisConfig.java, v0.1 ${DATA} 2:09 jiapingWang Exp $$
 */
@Configuration
@MapperScan("com.light.springboot.biz.domain.dao")
public class MybatisConfig {


}
