package com.g30.jpa.service;

import com.g30.jpa.entity.Score;
import com.g30.jpa.repository.ScoreRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dmanrique
 */
@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;
    
    public List<Score> getScore(){
        return scoreRepository.findAll();
    }
    
    public Score getScoreById(Long idScore){
        return scoreRepository.findById(idScore).get();
    }
    
    public Score saveScore(Score score){
        return scoreRepository.save(score);
    }
}
