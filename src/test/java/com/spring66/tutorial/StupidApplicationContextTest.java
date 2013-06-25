package com.spring66.tutorial;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

public class StupidApplicationContextTest extends AbstractDependencyInjectionSpringContextTests{
    protected final Log log = LogFactory.getLog(getClass());
    @Override
    protected String[] getConfigLocations() {
               setAutowireMode(AUTOWIRE_BY_NAME);
        return new String[] {
                "classpath:/applicationContext.xml"
              //  "classpath*:/applicationContext.xml", // for modular projects
               // "classpath:**/applicationContext*.xml" // for web projects
            };
    }
    public void testLoadBean(){
        HelloWorld helloService = (HelloWorld)super.applicationContext.getBean("helloWorld");
        log.debug("Frucking");
        assertNotNull(helloService);
    }
}