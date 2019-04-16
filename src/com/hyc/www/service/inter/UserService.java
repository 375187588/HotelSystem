/*
 * Copyright (c) 2019.  黄钰朝
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hyc.www.service.inter;

import com.hyc.www.service.constant.ServeConsts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author <a href="mailto:kobe524348@gmail.com">黄钰朝</a>
 * @program XHotel
 * @description 负责用户相关的业务逻辑，包括用户注册登陆的功能
 * @date 2019-04-13 17:01
 */
public interface UserService {

    /**
     * 负责用户的注册功能
     *
     * @name regist
     * @notice none
     * @author <a href="mailto:kobe524348@gmail.com">黄钰朝</a>
     * @date 2019/4/13
     */
    ServeConsts.Status regist(HttpServletRequest req, HttpServletResponse resp);

    /**
     * 负责用户的登陆功能
     *
     * @name login
     * @author <a href="mailto:kobe524348@gmail.com">黄钰朝</a>
     * @date 2019/4/13
     */
    ServeConsts.Status login(HttpServletRequest req, HttpServletResponse resp);


    /**
     * 负责返回用户的个人信息
     *
     * @name myInfo
     * @notice none
     * @author <a href="mailto:kobe524348@gmail.com">黄钰朝</a>
     * @date 2019/4/16
     */
    ServeConsts.Status myInfo(HttpServletRequest req, HttpServletResponse resp);

    /**
     * 负责更新用户信息的功能
     *
     * @name updateInfo
     * @notice none
     * @author <a href="mailto:kobe524348@gmail.com">黄钰朝</a>
     * @date 2019/4/13
     */
    ServeConsts.Status updateInfo(HttpServletRequest req, HttpServletResponse resp);

    /**
     * 负责用户更新登陆密码的功能
     *
     * @name updatePwd
     * @notice none
     * @author <a href="mailto:kobe524348@gmail.com">黄钰朝</a>
     * @date 2019/4/13
     */
    ServeConsts.Status updatePwd(HttpServletRequest req, HttpServletResponse resp);

    /**
     * 负责用户更新支付密码的功能
     *
     * @name updatePayPwd
     * @notice none
     * @author <a href="mailto:kobe524348@gmail.com">黄钰朝</a>
     * @date 2019/4/13
     */
    ServeConsts.Status updatePayPwd(HttpServletRequest req, HttpServletResponse resp);
}
