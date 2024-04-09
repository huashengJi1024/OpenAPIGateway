package auth.jwt;

import auth.Auth;
import auth.utils.JWTUtil;

/**
 * @Author : 1hassan
 * @Date : 2024-04-09 星期二   下午2:30
 * @Description:
 **/
public class JWTAuthImpl implements Auth<String> {


    JWTUtil jwtUtil=new JWTUtil();

    /**
     * check jwt string is legal
     * @param authValue jwtStr
     * @return true or false for legal result
     */
    @Override
    public boolean doAuth(String authValue) {
        jwtUtil.isLegalI(authValue);
        return false;
    }
}
