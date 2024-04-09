package auth.utils;

import auth.model.AuthModel;

/**
 * @Author : 1hassan
 * @Date : 2024-04-09 星期二   下午2:33
 * @Description:
 **/
public interface AuthUtil<T> {


    public T createAuthStr(AuthModel authInfo);



    public boolean isLegalI(T authValue);

}
