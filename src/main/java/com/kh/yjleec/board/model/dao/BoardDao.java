package com.kh.yjleec.board.model.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.yjleec.board.model.domain.Board;

@Repository("bDao")
public class BoardDao {
	@Autowired
	private SqlSession sqlSession;
	
	public int listCount() {
		return sqlSession.selectOne("Board.listCount");
	}
	public int insertBoard(Board b) {
		return sqlSession.insert("Board.insertBoard", b);
	}
	public List<Board> selectList(int startPage, int limit){
		int startRow = (startPage - 1) * limit;
		RowBounds row = new RowBounds(startRow, limit);
		return sqlSession.selectList("Board.selectList", null, row);
	}
	
	public Board selectOne(String board_num){
		return sqlSession.selectOne("Board.searchOne", board_num);	//mapper의 id의 이름과 같고 return갑과 board가 같아야함
	}
}
