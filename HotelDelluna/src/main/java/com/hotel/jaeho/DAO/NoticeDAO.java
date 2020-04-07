package com.hotel.jaeho.DAO;

import java.util.List;

import com.hotel.jaeho.DTO.NoticeDTO;
import com.hotel.jaeho.page.Pagination;

public interface NoticeDAO {

	public void NoticeInsert(NoticeDTO dto);

	public List<NoticeDTO> NoticeSelect(int start,int end);

	public void NoticeCountUpdate(int b_no);
	
	public NoticeDTO SelectNotice(int b_no);
	
    public int SelectCount();
    
}
