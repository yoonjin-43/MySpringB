package com.kh.yjleec.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.yjleec.board.model.dao.BoardDao;
import com.kh.yjleec.board.model.domain.Board;

@Service("bService")
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDao bDao;

	@Override
	public int listCount() {
		return bDao.listCount();
	}

	@Override
	public int insertBoard(Board b) {
		return bDao.insertBoard(b);
	}

	@Override
	public List<Board> selectList(int startPage, int limit) {
		return bDao.selectList(startPage, limit);
	}

	@Override
	public Board selectOne(String board_num) {
		return bDao.selectOne(board_num);
	}
}
