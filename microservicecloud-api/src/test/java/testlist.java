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
        int c=0;
        for (int i = 0; i < 20; i++) {
            c++;
            aaa.add(i);
            aaa.add(i,i++);
            System.out.println("ss");
        }
    }
}
