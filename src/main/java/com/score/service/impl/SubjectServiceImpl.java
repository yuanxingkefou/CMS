package com.score.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.score.bean.TSubject;
import com.score.dao.TSubjectMapper;
import com.score.service.TSubjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SubjectServiceImpl implements TSubjectService {

    @Autowired
    private TSubjectMapper subjectMapper;

    @Override
    public PageInfo<TSubject> getAll(TSubject subject, int page, int size) {
        // 首先开启PageHelper的分页
        PageHelper.startPage(page, size);
        // 查询分页信息 调用方式与普通方式一致
        List<TSubject> list = subjectMapper.selectAll(subject);
        //生成PageInfo对象
        PageInfo<TSubject> pageInfo = new PageInfo<TSubject>(list);
        return pageInfo;
    }

    /**
     * 查询是否存在
     */
    public TSubject selectByNo(int subjectId) {
        TSubject subject = subjectMapper.selectByPrimaryKey(subjectId);
        return subject;
    }

    /**
     * 增加课程信息
     */
    public Integer addSubject(TSubject subject) {
        Integer total = subjectMapper.insert(subject);
        return total;
    }

    /**
     * 修改课程信息
     */
    public Integer updateSubject(TSubject subject) {
        Integer total = subjectMapper.updateByPrimaryKey(subject);
        return total;
    }


    /**
     * 删除课程信息
     */
    public Integer deleteSubject(int subjectId) {
        Integer total = subjectMapper.deleteByPrimaryKey(subjectId);
        return total;
    }

    /**
     * 全量查询用户为下拉框
     */
    public List<TSubject> selectAllSubject() {
        return subjectMapper.selectAll(null);
    }

//    /**
//     * 查询学生账号信息
//     * @param record
//     * @return
//     */
//    public List<TStudent> selectloginStudent(TStudent student){
//        return subjectMapper.selectloginStudent(student);
//    }
}
