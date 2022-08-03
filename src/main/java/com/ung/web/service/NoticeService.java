package com.ung.web.service;

import java.util.List;

import com.ung.web.entity.Notice;

public interface NoticeService {
	
	List<Notice> getViewList(boolean pub);
	
	List<Notice> getViewList(String field, String query, boolean pub);
	
	List<Notice> getViewList(int page, String field, String query, boolean pub);

	int getCount();
	int getCount(String field, String query);
	
	Notice getView(int id);
	Notice getNext(int id);
	Notice getPrev(int id);
	
	int updatePubAll(int[] pubIds, int[] closeIds);
	
	int deleteAll(int[] ids);
	
	int update(Notice notice);
	int delete(int id);
	int insert(Notice notice);

}
