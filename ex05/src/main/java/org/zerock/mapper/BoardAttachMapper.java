package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardAttachVO;

public interface BoardAttachMapper {

	public void insert(BoardAttachVO vo);
	public void insert(String uuid);
	public List<BoardAttachVO> findByBno(Long bno);
	
}
