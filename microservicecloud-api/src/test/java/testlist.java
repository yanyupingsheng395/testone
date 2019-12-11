import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class testlist {

/**
 * @author zhangj
 * @date 2019/12/11 11:01
 * @Param: null
 * @return 
 * @throws 
 * @desc 
*/
    public static void main(String[] args) {
        List aaa=new ArrayList<>();
        String a="aaa";
        for (int i = 0; i < 20; i++) {
            System.out.println("111");
            aaa.add(i,i++);
            System.out.println("ss");
        }
    }
}
