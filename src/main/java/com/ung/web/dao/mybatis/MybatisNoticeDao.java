package com.ung.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ung.web.dao.NoticeDao;
import com.ung.web.entity.Notice;

@Repository
public class MybatisNoticeDao implements NoticeDao {

	private NoticeDao mapper;
	
	@Autowired
	public MybatisNoticeDao(SqlSession sqlSession) {
		mapper = sqlSession.getMapper(NoticeDao.class);
	}
	
	@Override
	public List<Notice> getViewList(int offset, int size, String field, String query, boolean pub) {

		return mapper.getViewList(offset, size, field, query, pub);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mapper.getCount();
	}

	@Override
	public Notice getView(int id) {
		// TODO Auto-generated method stub
		return mapper.getView(id);
	}

	@Override
	public Notice getNext(int id) {
		// TODO Auto-generated method stub
		return mapper.getNext(id);
	}

	@Override
	public Notice getPrev(int id) {
		// TODO Auto-generated method stub
		return mapper.getPrev(id);
	}

	@Override
	public int update(Notice notice) {
		// TODO Auto-generated method stub
		return mapper.update(notice);
	}

	@Override
	public int insert(Notice notice) {
		// TODO Auto-generated method stub
		return mapper.insert(notice);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return mapper.delete(id);
	}

	@Override
	public int deleteAll(int[] ids) {
		// TODO Auto-generated method stub
		return mapper.deleteAll(ids);
	}

	@Override
	public int updatePubAll(int[] pubIds, int[] closeIds) {
		// TODO Auto-generated method stub
		return mapper.updatePubAll(pubIds, closeIds);
	}

	@Override
	public int updatePubAll(int[] ids, boolean pub) {
		// TODO Auto-generated method stub
		return mapper.updatePubAll(ids, pub);
	}
	
}
