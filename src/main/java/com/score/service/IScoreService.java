package com.score.service;

import com.github.pagehelper.PageInfo;
import com.score.bean.ResultObject;
import com.score.bean.TScore;

public interface IScoreService {

    /**
     * 模糊查询学生成绩
     */
    public PageInfo<TScore> getAllScore(TScore score, int limit, int page);

    /**
     * 增加学生成绩
     */
    public ResultObject<Object> insertScore(TScore score);

    /**
     * 更改学生成绩
     */
    public Integer updateScore(TScore score);

    /**
     * 删除学生学生成绩
     */
    public Integer deleteScore(int scoreId);

    /**
     * 根据编号查询学生成绩
     */
    public PageInfo<TScore> getScoreByName(int studentId, int limit, int page);

//	public PageInfo<TStudent> getAllFinalScore(TStudent student, int limit, int page);
}
