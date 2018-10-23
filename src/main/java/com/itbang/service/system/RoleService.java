
package com.itbang.service.system;

import com.itbang.entity.system.SysUser;
import com.itbang.pojo.system.RolePojo;

import java.util.List;

/**
 * 角色service
 *
 * @author zcq
 * @date 2018/10/21 20:45
 */
public interface RoleService {

    /**
     * 查询用户角色
     *
     * @param sysUser
     * @param pageNumber
     * @param pageSize
     * @return java.util.List<com.itbang.pojo.system.RolePojo>
     * @author zcq
     * @date 2018/10/21 20:46
     */
    List<RolePojo> queryList(SysUser sysUser, int pageNumber, int pageSize);

}
