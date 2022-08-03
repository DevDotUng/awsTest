package com.ung.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;

import com.ung.web.entity.Notice;

@Mapper
public interface NoticeDao {

	@Result(property = "writerId", column = "writer_id")
	List<Notice> getViewList(int offset, int size, String field, String query, boolean pub);
	int getCount();
	Notice getView(int id);
	
	Notice getNext(int id);
	Notice getPrev(int id);

	int update(Notice notice);
	int insert(Notice notice);
	int delete(int id);
	
	int deleteAll(int[] ids);
	int updatePubAll(int[] pubIds, int[] closeIds);
	int updatePubAll(int[] ids, boolean pub);

}
