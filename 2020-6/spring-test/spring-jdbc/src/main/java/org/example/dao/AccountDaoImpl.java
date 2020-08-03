package org.example.dao;

import com.mysql.jdbc.Statement;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountDaoImpl implements AccountDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addAccountNoKey(Account account) {
        int result = 0;
        String sql = "insert into account(aname, type, money, remark, user_id, create_time, update_time) "
                + " values(?,?,?,?,?,?,?)";
        result = jdbcTemplate.update(sql, account.getAname(), account.getType(), account.getMoney(),
                account.getType(), account.getUserId(), account.getCreateTime(), account.
                        getUpdateTime());
        return result;
    }

    @Override
    public int addAccountHasKey(Account account) {

        String sql = "insert into account(aname, type, money, remark, user_id, create_time, update_time) "
                + " values(?,?,?,?,?,?,?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, account.getAname());
                ps.setString(2, account.getType());
                ps.setDouble(3, account.getMoney());
                ps.setString(4, account.getRemark());
                ps.setInt(5, account.getUserId());
                ps.setObject(6, account.getCreateTime());
                ps.setObject(7, account.getUpdateTime());
                return ps;
            }
        }, keyHolder);
        return keyHolder.getKey().intValue();
    }

    public int addAccountBatch(final List<Account> accounts) {
        String sql = "insert into account(aname,type,money,remark,user_id,create_time,update_time)"
                + " values(?,?,?,?,?,?,?)";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws
                    SQLException {
                ps.setString(1, accounts.get(i).getAname());
                ps.setString(2, accounts.get(i).getType());
                ps.setDouble(3, accounts.get(i).getMoney());
                ps.setString(4, accounts.get(i).getRemark());
                ps.setInt(5, accounts.get(i).getUserId());
                ps.setObject(6, accounts.get(i).getCreateTime());
                ps.setObject(7, accounts.get(i).getUpdateTime());
            }

            @Override
            public int getBatchSize() {
                return accounts.size();
            }
        }).length;
    }

    @Override
    public int queryAccountCount(Integer uid) {
        String sql = "select count(1) from account where user_id=?";

        return jdbcTemplate.queryForObject(sql, Integer.class, uid);
    }

    @Override
    public Account queryAccountByAid(Integer aid) {
        String sql = "select id,aname,type,money,user_id as userId,"
                + " remark,create_time as createTime,update_time as updateTime "
                + " from account where id=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{aid}, new RowMapper<Account>() {


            @Override
            public Account mapRow(ResultSet rs, int rowNum) throws
                    SQLException {
                Account account = new Account();
                account.setId(rs.getInt("id"));
                account.setAname(rs.getString("aname"));
                account.setType(rs.getString("type"));
                account.setMoney(rs.getDouble("money"));
                account.setRemark(rs.getString("remark"));
                account.setUserId(rs.getInt("userId"));
                account.setCreateTime(rs.getDate("createTime"));
                account.setUpdateTime(rs.getDate("updateTime"));
                return account;
            }
        });


    }


    @Override
    public List<Account> queryAccountsByParams(Integer uid, String aname,
                                               String type, String time) {
        StringBuffer sb = new StringBuffer(" select id,aname,type,remark,user_id as userId,create_time as createTime,update_time as updateTime,money "
                + " from account where user_id= ?");
        List list = new ArrayList();
        list.add(uid);
        if (null != aname && !"".equals(aname)) {
            sb.append(" and aname like ? ");
            list.add("%" + aname + "%");
        }
        if (null != type && !"".equals(type)) {
            sb.append(" and type =?");
            list.add(type);
        }
        if (null != time && !time.equals("")) {
            sb.append(" and create_time <=?");
            list.add(time);
        }
        return jdbcTemplate.query(sb.toString(), new RowMapper<Account>() {
            @Override
            public Account mapRow(ResultSet rs, int rowNum) throws
                    SQLException {
                Account account = new Account();
                account.setId(rs.getInt("id"));
                account.setAname(rs.getString("aname"));
                account.setType(rs.getString("type"));
                account.setMoney(rs.getDouble("money"));
                account.setRemark(rs.getString("remark"));
                account.setUserId(rs.getInt("userId"));
                account.setCreateTime(rs.getDate("createTime"));
                account.setUpdateTime(rs.getDate("updateTime"));
                return account;
            }
        }, list.toArray());
    }

    @Override
    public List<Account> queryAccountsByParams(Integer uid, String aname,
                                               String type, String time, Integer pageNum, Integer pageSize) {
        StringBuffer sb = new StringBuffer(" select id,aname,type,remark,user_id as userId,create_time as createTime,update_time as updateTime,money "
                + " from account where 1=1");
        List list = new ArrayList();
        if (null != uid && !"".equals(uid)) {
            sb.append(" user_id= ? ");
            list.add(uid);
        }

        if (null != aname && !"".equals(aname)) {
            sb.append(" and aname like ? ");
            list.add("%" + aname + "%");
        }
        if (null != type && !"".equals(type)) {
            sb.append(" and type =?");
            list.add(type);
        }
        if (null != time && !time.equals("")) {
            sb.append(" and create_time <=?");
            list.add(time);
        }
        sb.append(" limit ?,?");
        list.add((pageNum - 1) * pageSize);
        list.add(pageSize);

        return jdbcTemplate.query(sb.toString(), new RowMapper<Account>() {
            @Override
            public Account mapRow(ResultSet rs, int rowNum) throws
                    SQLException {
                Account account = new Account();
                account.setId(rs.getInt("id"));
                account.setAname(rs.getString("aname"));
                account.setType(rs.getString("type"));
                account.setMoney(rs.getDouble("money"));
                account.setRemark(rs.getString("remark"));
                account.setUserId(rs.getInt("userId"));
                account.setCreateTime(rs.getDate("createTime"));
                account.setUpdateTime(rs.getDate("updateTime"));
                return account;
            }
        }, list.toArray());
    }


    @Override
    public int updateAccountById(Account account) {
        String sql = "update account set aname=?,type=?,remark=?,money=?,update_time=? where id=?";
        return jdbcTemplate.update(sql,
                account.getAname(), account.getType(), account.getRemark()
                , account.getMoney(), account.getUpdateTime(), account.getId());
    }

    @Override
    public int updateAccountBatch(List<Account> accounts) {
        String sql = "update account set aname=?,type=?,remark=?,money=?,update_time=? where id=?";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws
                    SQLException {
                ps.setString(1, accounts.get(i).getAname());
                ps.setString(2, accounts.get(i).getType());
                ps.setString(3, accounts.get(i).getRemark());
                ps.setDouble(4, accounts.get(i).getMoney());
                ps.setObject(5, accounts.get(i).getUpdateTime());
                ps.setInt(6, accounts.get(i).getId());
            }

            @Override
            public int getBatchSize() {
                return accounts.size();

            }
        }).length;

    }

    @Override
    public Integer delAccoutById(Integer aid) {
        String sql = "delete from account where id=?";
        return jdbcTemplate.update(sql, aid);
    }

    @Override
    public int delAccountBatch(Integer... ids) {
        String sql = "delete from account where id=?";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws
                    SQLException {
                ps.setInt(1, ids[i]);
            }

            @Override
            public int getBatchSize() {
                return ids.length;
            }
        }).length;
    }

    @Override
    public int outAccount(Integer sourceAId, double money) {
        String sql="update account set money=money-? where id=?";
        return jdbcTemplate.update(sql,money,sourceAId);
    }

    @Override
    public int inAccount(Integer targeAId, double money) {
        String sql="update account set money=money+? where id=?";
        return jdbcTemplate.update(sql,money,targeAId);
    }


}
