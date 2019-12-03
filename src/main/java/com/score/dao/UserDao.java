package com.score.dao;

import com.score.bean.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper //标识为mybatis数据层接口
public interface UserDao {

    /**
     * 全量查询用户
     */
    List<User> getUser(User user);
}
