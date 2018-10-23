
package com.itbang.dao.system;

import com.itbang.entity.system.SysUser;
import com.itbang.pojo.system.RolePojo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 角色Mapper
 *
 * @author zcq
 * @date 2018/10/23 20:56
 */
@Mapper
public interface RoleMapper {

    List<RolePojo> queryRoles(SysUser sysUser);

}
