package com.falexo.reminder.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by newman on 08.02.2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.falexo.reminder.server")
public class WebConfig extends WebMvcConfigurerAdapter {

}
