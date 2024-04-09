package encrypt;

/**
 * @Author : 1hassan
 * @Date : 2024-04-09 星期二   下午2:41
 * @Description:
 **/
public interface Signature<T> {

    public String doSign(T data);


    public boolean checkSign(String signatureString);


}
