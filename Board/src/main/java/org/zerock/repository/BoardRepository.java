package org.zerock.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.zerock.dto.BoardVO;

@Repository
public class BoardRepository {

	@Autowired
	private DataSource dataSource;

    public List<BoardVO> getAllBoards() {
        List<BoardVO> boards = new ArrayList<>();
        String sql = "SELECT num, pass, name, email, title, content, readcount, writedate FROM board ORDER BY num DESC";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                BoardVO board = new BoardVO();
                board.setNum(rs.getInt("num"));
                board.setPass(rs.getString("pass"));
                board.setName(rs.getString("name"));
                board.setEmail(rs.getString("email"));
                board.setTitle(rs.getString("title"));
                board.setContent(rs.getString("content"));
                board.setReadCount(rs.getInt("readcount"));
                board.setWriteDate(rs.getDate("writedate"));
                boards.add(board);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return boards;
    }
}
