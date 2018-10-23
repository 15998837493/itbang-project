
package com.itbang.controller.system;

import com.github.pagehelper.PageInfo;
import com.itbang.entity.system.SysUser;
import com.itbang.model.WebResult;
import com.itbang.pojo.system.RolePojo;
import com.itbang.service.system.RoleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 角色Controller
 *
 * @author zcq
 * @date 2018/10/23 20:58
 */
@RestController
@RequestMapping(value = "/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @ApiOperation(value = "获取角色列表接口(分页)", notes = "", response = WebResult.class)
    @RequestMapping(value = "/findPageList", method = RequestMethod.POST)
    public WebResult<PageInfo> findPageList(@RequestBody RolePojo role) {
        SysUser sysRole = new SysUser();
        BeanUtils.copyProperties(role, sysRole);
        List<RolePojo> list = roleService.queryList(sysRole, role.getPageNumber(), role.getPageSize());
        PageInfo<RolePojo> pager = new PageInfo<RolePojo>(list);
        WebResult<PageInfo> webResult = new WebResult<PageInfo>(pager);
        return webResult;
    }


}
