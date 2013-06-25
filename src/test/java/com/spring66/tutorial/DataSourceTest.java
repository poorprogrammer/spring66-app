/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring66.tutorial;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

/**
 *
 * @author Phongsak
 */
public class DataSourceTest extends AbstractDependencyInjectionSpringContextTests {

    protected final Log log = LogFactory.getLog(getClass());

    @Override
    protected String[] getConfigLocations() {
        setAutowireMode(AUTOWIRE_BY_NAME);
        return new String[]{
                    "classpath:/applicationContext.xml",
                    "classpath*:/applicationContext.xml" // for modular projects
                };
    }

    public void testLoadBean() {
        Object obj = super.applicationContext.getBean("dataSource");
        log.debug("Looking for Datasource");
        assertNotNull(obj);
    }

    public void testConnection() {
        Object obj = super.applicationContext.getBean("dataSource");
        log.debug("Looking for Datasource");
        BasicDataSource bs = (BasicDataSource) obj;
        try {
            Connection con = bs.getConnection();
            DatabaseMetaData metaData = con.getMetaData();
            log.debug("MetaData->" + metaData.getDatabaseProductName());
            assertNotNull(metaData);
        } catch (Exception error) {
            log.debug("Error->" + error.toString());
            fail("Error->" + error.toString());
        }
    }
    
}