package encrypt.utils;

/**
 * @Author : 1hassan
 * @Date : 2024-04-09 星期二   下午2:42
 * @Description:
 **/
public interface SignatureUtil <T> {

    public String doSign(T data);


    public boolean checkSignIsLegal(String signatureString);

}
