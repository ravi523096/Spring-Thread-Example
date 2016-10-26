package com.threadUtils.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.threadUtils.util.Constants;

@Configuration
@ComponentScan(basePackages = "com.threadUtils.config")
public class AppConfig {
	@Bean
	public ThreadPoolTaskExecutor taskExecutor() {
		ThreadPoolTaskExecutor pool = new ThreadPoolTaskExecutor();
		pool.setCorePoolSize(Constants.THREAD_CORE_POOL_SIZE);
		pool.setMaxPoolSize(Constants.THREAD_MAX_POOL_SIZE);
		pool.setWaitForTasksToCompleteOnShutdown(true);
		return pool;
	}
}
