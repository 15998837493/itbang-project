
package com.itbang.service.system.impl;

import com.github.pagehelper.PageHelper;
import com.itbang.dao.system.RoleMapper;
import com.itbang.entity.system.SysUser;
import com.itbang.pojo.system.RolePojo;
import com.itbang.service.system.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 角色service
 *
 * @author zcq
 * @date 2018/10/21 20:45
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleDao;

    @Override
    public List<RolePojo> queryList(SysUser sysUser, int pageNumber, int pageSize) {
        PageHelper.startPage(pageNumber, pageSize);
        return roleDao.queryRoles(sysUser);
    }

}
