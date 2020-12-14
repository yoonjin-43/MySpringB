package com.kh.yjleec.board.model.service;

import java.util.List;

import com.kh.yjleec.board.model.domain.Board;

public interface BoardService {
	public int listCount();
	
	public int insertBoard(Board b);
	
	public List<Board> selectList(int startPage, int limit);
	
	public Board selectOne(String board_num);
}
