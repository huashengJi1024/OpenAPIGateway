package encrypt.utils;

/**
 * @Author : 1hassan
 * @Date : 2024-04-09 星期二   下午2:36
 * @Description:
 **/
public interface EncryptUtil <T>{

    public T doEncrypt(T t);

    public T doDecrypt(T t);


}
