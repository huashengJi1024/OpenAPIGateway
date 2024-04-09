package auth;

/**
 * @Author : 1hassan
 * @Date : 2024-04-09 星期二   下午2:03
 * @Description:
 **/
public interface Auth <T>{

    public boolean doAuth(T authValue);

}
