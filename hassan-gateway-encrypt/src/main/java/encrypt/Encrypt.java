package encrypt;

/**
 * @Author : 1hassan
 * @Date : 2024-04-09 星期二   下午2:37
 * @Description:
 **/
public interface Encrypt<T> {

    public T encrypt(T t);

    public T decrypt(T t);

}
