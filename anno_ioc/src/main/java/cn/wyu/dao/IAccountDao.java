package cn.wyu.dao;

import cn.wyu.domain.Account;

import java.util.List;

/**
 * 账户持久层接口
 */
public interface IAccountDao {
    /**
     * 查询所有账户信息
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 查询一个账户
     * @param accountId
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     * 保存用户信息
     * @param accountId
     */
    void saveAccount(Account account) ;

    /**
     * 更新账户信息
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 删除账户
     * @param accountId
     */
    void deleteAccount(Integer accountId);

}
