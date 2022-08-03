package com.ung.web.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import com.ung.web.entity.Notice;

@AutoConfigureTestDatabase(replace =  Replace.NONE)
@MybatisTest
class NoticeDaoTest {

	@Autowired
	private NoticeDao noticeDao;
	
	@Test
	void test() {
		List<Notice> list = noticeDao.getViewList(0, 1, "title", "", false);
		
		System.out.println(list.get(0));
	}

}
