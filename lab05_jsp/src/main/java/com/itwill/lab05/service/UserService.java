package com.itwill.lab05.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.itwill.lab05.repository.User;
import com.itwill.lab05.repository.UserDao;

//서비스 (비즈니스) 계층 싱글턴 객체.
public enum UserService {
	INSTANCE;

	private static final Logger log = LoggerFactory.getLogger(UserService.class);

	private UserDao userDao = UserDao.INSTANCE;

	//TODO: 회원가입에 필요한 메서드.userDao에 insert()메서드를 호출하는 메서드 만들기.


	public int create(User user) {
		log.debug("create(user={})",user); //{}에 2번째넣은 아규먼트가 들어감?? 맞나?

		//Repository 계층의 메서드를 사용해서 DB 테이블에 행을 삽입(insert)
		int result = userDao.insert(user);

		//로그는 프로그램 동작에 필요없고 실행 흐름 보기 위해서 추가한 코드..
		log.debug("insert result = {}", result);

		return result;//insert된 행의 개수를 리턴.
	}
}