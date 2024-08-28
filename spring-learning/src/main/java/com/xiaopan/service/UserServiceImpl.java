package com.xiaopan.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger log = LoggerFactory.getLogger(UserService.class);

	@Override
	public void show() {
		log.info("学习spring中bean的生命周期");
	}

}
