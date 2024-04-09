package auth.utils;

import auth.model.AuthModel;

/**
 * @Author : 1hassan
 * @Date : 2024-04-09 星期二   下午2:32
 * @Description:
 **/
public class JWTUtil implements AuthUtil<String>{


    @Override
    public String createAuthStr(AuthModel authInfo) {
        return "";
    }

    @Override
    public boolean isLegalI(String authValue) {
        return false;
    }
}
