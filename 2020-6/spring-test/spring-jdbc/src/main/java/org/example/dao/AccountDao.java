package org.example.dao;

import org.example.dao.Account;

import java.util.List;

/**
 * 账户 dao 接口方法定义
 */
public interface AccountDao {
    /**
     * 添加账户 返回影响行数
     *
     * @param account
     * @return www.shsxt.com
     * 6
     */
    public int addAccountNoKey(Account account);

    /**
     * 添加纪录 返回记录主键
     *
     * @param account
     * @return
     */
    public int addAccountHasKey(Account account);

    /**
     * 批量添加账户记录
     *
     * @param accounts
     * @return
     */
    public int addAccountBatch(List<Account> accounts);

    /**
     * 查询用户账户记录
     *
     * @return
     */
    public int queryAccountCount(Integer uid);

    /**
     * 查询账户记录详情
     *
     * @param aid
     * @return
     */
    public Account queryAccountByAid(Integer aid);

    /**
     * 多条件查询用户账户记录
     *
     * @param uid
     * @return
     */
    public List<Account> queryAccountsByParams(Integer uid, String aname, String
            type, String time);


    List<Account> queryAccountsByParams(Integer uid, String aname,
                                        String type, String time, Integer pageNum, Integer pageSize);

    /**
     * 更新账户记录
     *
     * @param aid
     * @return
     */
    public int updateAccountById(Account account);

    /**
     * 批量更新
     *
     * @param accounts
     * @return
     */
    public int updateAccountBatch(List<Account> accounts);

    /**
     * 删除账户记录
     *
     * @param aid
     * @return
     */
    public Integer delAccoutById(Integer aid);

    /**
     * 批量删除账户记录
     *
     * @param ids
     * @return
     */
    public int delAccountBatch(Integer... ids);

    /**
     * 转账支持
     * @param sourceAId
     * @param money
     * @return
     */
    int outAccount(Integer sourceAId, double money);

    /**
     * 转账收入
     * @param targeAId
     * @param money
     * @return
     */
    int inAccount(Integer targeAId, double money);
}
