import com.gzyijian.action.UserAction;
import com.gzyijian.dao.UserDao;
import com.gzyijian.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: zmjiangi
 * @date: 2019-1-24
 */
public class SpringTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserAction userAction = (UserAction) ctx.getBean("userAction");
        System.out.println(userAction);

        UserService userService = (UserService) ctx.getBean("userService");
        System.out.println(userService);

        UserDao userDao = (UserDao) ctx.getBean("userDao");
        System.out.println(userDao);

    }
}
