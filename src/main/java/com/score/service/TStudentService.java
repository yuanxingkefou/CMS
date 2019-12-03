package com.score.service;


import com.github.pagehelper.PageInfo;
import com.score.bean.TStudent;
import java.util.List;

public interface TStudentService {

    /**
     * 全量查询用户
     */
    PageInfo<TStudent> getAll(TStudent student, int page, int size);

    /**
     * 查询是否存在
     */
    TStudent selectByNo(int studentNo);

    /**
     * 增加学生信息
     */
    Integer addStudent(TStudent student);


    /**
     * 修改学生信息
     */
    Integer updateStudent(TStudent student);


    /**
     * 删除学生信息
     */
    Integer deleteStudent(int studentNo);

    /**
     * 全量查询用户为下拉框
     */
    List<TStudent> selectAllStudent();

    /**
     * 查询学生账号信息
     */
    List<TStudent> selectloginStudent(TStudent student);

}
