package org.sefglobal.giraffe.api.util;

import org.sefglobal.giraffe.api.beans.Board;
import org.sefglobal.giraffe.api.beans.Entity;
import org.sefglobal.giraffe.api.beans.Score;

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

    public static Entity getEntityFromResultSet(ResultSet resultSet) throws SQLException {
        Entity entity = new Entity();

        entity.setId(resultSet.getInt("id"));
        entity.setName(resultSet.getString("name"));
        entity.setImage(resultSet.getString("image"));
        entity.setBoardId(resultSet.getInt("board_id"));
        entity.setStatus(resultSet.getString("status"));

        return entity;
    }

    public static Score getScoreFromResultSet(ResultSet resultSet) throws SQLException {
        Score score = new Score();

        score.setId(resultSet.getInt("id"));
        score.setEntityId(resultSet.getInt("entity_id"));
        score.setDescription(resultSet.getString("description"));
        score.setPoints(resultSet.getInt("points"));
        score.setStatus(resultSet.getString("status"));

        return score;
    }
}
