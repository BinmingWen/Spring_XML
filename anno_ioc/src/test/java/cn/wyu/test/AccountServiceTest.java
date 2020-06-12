package cn.wyu.test;

import cn.wyu.config.SpringConfiguration;
import cn.wyu.domain.Account;
import cn.wyu.service.IAccountService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class AccountServiceTest {
    //ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

     //private ApplicationContext ac;
    @Autowired
    private IAccountService as;

     /*@Before
     public void init(){
         ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
         as = ac.getBean("accountService", IAccountService.class);
     }*/



    @Test
    public void testFindAll() {
        //ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
       // IAccountService as = ac.getBean("accountService",IAccountService.class);
        List<Account> allAccount = as.findAllAccount();
        allAccount.forEach((o) -> {
            System.out.println(o);
        });
    }
    @Test
    public void testFindAccountById(){
      //  ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
       // IAccountService as = ac.getBean("accountService",IAccountService.class);
        Account account = as.findAccountById(1);
        System.out.println(account);
    }
    @Test
    public void testSaveAcccount(){
        Account account = new Account();
        account.setName("至尊宝");
        account.setMoney(3444.3f);
        as.saveAccount(account);
    }
    @Test
    public void testUpdateAccount(){
        Account account = new Account(5,"紫霞",333.4f);
        as.updateAccount(account);
    }
    @Test
    public void testDeleteAccount(){
        as.deleteAccount(5);
        //ok
    }
}
