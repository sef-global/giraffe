package org.sefglobal.giraffe.api.service.api;

import org.sefglobal.giraffe.api.beans.PaginatedResult;
import org.sefglobal.giraffe.api.beans.PaginatedScoreResult;
import org.sefglobal.giraffe.api.beans.Score;
import org.sefglobal.giraffe.api.dao.ScoreDAO;
import org.sefglobal.giraffe.api.exception.GiraffeAPIException;
import org.sefglobal.giraffe.api.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

@RestController
public class ScoreManagementAPI {
    @Autowired
    private ScoreDAO scoreDAO;

    @GetMapping("/entities/{entityId}/scores")
    public PaginatedResult getAllScores(
            @PathVariable int entityId,
            @RequestParam int limit,
            @RequestParam int offset
    ) throws ResourceNotFoundException {
        return scoreDAO.getPaginatedScoreByEntityId(entityId, limit, offset);
    }

    @PostMapping("/entities/{entityId}/scores")
    public Score addScore(@RequestBody Score score, @PathVariable int entityId) throws GiraffeAPIException {
        score.setEntityId(entityId);
        return scoreDAO.addScore(score);
    }

    @DeleteMapping("/scores/{id}")
    public void removeScore(@PathVariable int id, HttpServletResponse response) throws GiraffeAPIException {
        scoreDAO.removeScore(id, response);
    }
}
