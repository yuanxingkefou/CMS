package com.score.dao;

import com.score.bean.TSubject;
import java.util.List;

public interface TSubjectMapper {

    int deleteByPrimaryKey(Integer subjectId);

    int insert(TSubject record);

    TSubject selectByPrimaryKey(Integer subjectId);

    List<TSubject> selectAll(TSubject record);

    int updateByPrimaryKey(TSubject record);

//    Map<String,Object> selectFinalScore(TSubject subject);

//    List<TStudent> selectloginStudent(TStudent student);
}
