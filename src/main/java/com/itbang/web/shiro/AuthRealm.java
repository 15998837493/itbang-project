//package com.itbang.web.shiro;
//
//import com.itbang.entity.system.SysUser;
//import com.itbang.pojo.system.AuthPojo;
//import com.itbang.pojo.system.RolePojo;
//import com.itbang.service.system.AuthService;
//import com.itbang.service.system.RoleService;
//import com.itbang.service.system.SysUserService;
//import org.apache.shiro.authc.*;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.authz.SimpleAuthorizationInfo;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.subject.PrincipalCollection;
//import org.apache.shiro.util.CollectionUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//
///**
// * shiro权限管理业务实现类(对接权限管理数据设计)
// *
// * @author zj
// * @version 1.0
// * <p>
// * 变更履历：
// * v1.0 2018年7月25日 zj 初版
// */
//public class AuthRealm extends AuthorizingRealm {
//
//    @Autowired
//    private SysUserService sysUserService;
//
//    @Autowired
//    private RoleService roleService;
//
//    @Autowired
//    private AuthService authService;
//
//    // 认证.登录
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//        UsernamePasswordToken utoken = (UsernamePasswordToken) token;// 获取用户输入的token
//        String username = utoken.getUsername();
//        SysUser userCondition = new SysUser();
//        userCondition.setUserCode(username);
//        List<SysUser> userList = sysUserService.findList(userCondition);
//        SysUser user = null;
//        if (!CollectionUtils.isEmpty(userList)) {
//            user = userList.get(0);
//        } else {
//            return null;
//        }
//        // 放入shiro.调用CredentialsMatcher检验密码
//        return new SimpleAuthenticationInfo(user, user.getUserPassword(), this.getClass().getName());
//    }
//
//    // 授权
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
//        SysUser user = (SysUser) principal.getPrimaryPrincipal(); // 获取session中的用户
//        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        // 获取用户角色集合
//        List<RolePojo> list = roleService.queryList(user,1,10);
//        if (!CollectionUtils.isEmpty(list)) {
//            for (RolePojo role : list) {
//                info.addRole(role.getRoleName());
//            }
//        }
//        // 获取用户权限集合
//        List<AuthPojo> listAuth = authService.queryAuthList(user);
//        if (!CollectionUtils.isEmpty(listAuth)) {
//            for (AuthPojo auth : listAuth) {
//                // 将权限放入shiro中.
//                info.addStringPermission(auth.getResourceId());
//            }
//        }
//        return info;
//    }
//}
