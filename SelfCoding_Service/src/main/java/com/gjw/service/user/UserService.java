package com.gjw.service.user;

import com.gjw.common.vo.ResultVO;
import com.gjw.domain.user.User;

/**
 * @Auther: qq
 * @Date: 2019/1/14 21:51
 * @Description:
 */
public interface UserService {
    //注册
    ResultVO save(User user);
    //校验手机
    ResultVO checkPhone(String phone);
}
