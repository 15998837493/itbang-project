
package com.itbang.web.shiro;

import com.itbang.utils.Md5;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

import java.security.NoSuchAlgorithmException;

/**
 * 用户名、密码一致性校验(shiro定义方法)
 *
 * @author zj
 * @version 1.0
 * <p>
 * 变更履历：
 * v1.0 2018年7月25日 zj 初版
 */
public class CredentialsMatcher extends SimpleCredentialsMatcher {

    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        UsernamePasswordToken utoken = (UsernamePasswordToken) token;
        // 获得用户输入的密码:(可以采用加盐(salt)的方式去检验)
        String inPassword = null;
        try {
            inPassword = Md5.getMD5Digest(new String(utoken.getPassword()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        // 获得数据库中的密码
        String dbPassword = (String) info.getCredentials();
        // 进行密码的比对
        return this.equals(inPassword, dbPassword);
    }

}
