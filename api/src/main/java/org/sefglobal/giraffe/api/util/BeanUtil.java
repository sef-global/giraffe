package org.sefglobal.giraffe.api.util;

import org.sefglobal.giraffe.api.beans.Board;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BeanUtil {
    public static Board getBoardFromResultSet(ResultSet resultSet) throws SQLException {
        Board board = new Board();

        board.setId(resultSet.getInt("id"));
        board.setTitle(resultSet.getString("title"));
        board.setImage(resultSet.getString("image"));
        board.setDescription(resultSet.getString("description"));
        board.setStatus(resultSet.getString("status"));

        return board;
    }
}
