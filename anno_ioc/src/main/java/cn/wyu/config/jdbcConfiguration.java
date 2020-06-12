package cn.wyu.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
//@Configuration
public class jdbcConfiguration {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String userName;
    @Value("${jdbc.password}")
    private String password;
    /**
     * 获取Runner对象
     * @param dataSource
     * @return
     */
    @Bean(name = "runner")
    @Scope("prototype")
    public QueryRunner createQueryRunner(DataSource dataSource){
        return new QueryRunner(dataSource);
    }

    /**
     * 获取datasource对象
     * @return
     */
    @Bean(name="dataSource")
    public DataSource createDataSource(){
        ComboPooledDataSource cd = new ComboPooledDataSource();
        try {
            cd.setDriverClass(driver);
            cd.setJdbcUrl(url);
            cd.setPassword(userName);
            cd.setUser(password);
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        return cd;

    }
}
