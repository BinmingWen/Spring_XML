package cn.wyu.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

//@Configuration
@ComponentScan(basePackages = "cn.wyu")
@Import(jdbcConfiguration.class)
@PropertySource("classpath:pro.properties")
public class SpringConfiguration {

}
