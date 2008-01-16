package org.xmdl.lib.helper;

import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.apache.commons.chain.Chain;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.impl.ContextBase;
import org.apache.log4j.Logger;

/**
 * CommonsChainFactoryTest.
 *
 * @author tr1a3571
 * @version 1.0
 */
public class CommonsChainFactoryTest extends TestCase{
    private static final Logger LOGGER = Logger.getLogger(CommonsChainFactoryTest.class);
    private static final ClassPathXmlApplicationContext applicationContext
            = new ClassPathXmlApplicationContext("classpath:org/xmdl/core/lib/helper/chain-test-context.xml");

     public void testChain1(){
         Chain chain = (Chain) applicationContext.getBean("chain1");
         try {
             ContextBase base = new ContextBase();
             chain.execute(base);
             assertEquals(base.get("log message 1"),new Boolean(true));
             assertEquals(base.get("log message 2"),new Boolean(true));
             assertEquals(base.get("log message 3"),new Boolean(true));
         } catch (Exception e) {
             LOGGER.warn("!!", e);
             assertNull(e);
         }
     }
     public void testChain2(){
         Chain chain = (Chain) applicationContext.getBean("chain2");
         try {
             ContextBase base = new ContextBase();
             chain.execute(base);
             assertEquals(base.get("log message 1"),new Boolean(true));
             assertEquals(base.get("log message 2"),new Boolean(true));
             assertEquals(base.get("log message 3"),new Boolean(true));
         } catch (Exception e) {
             LOGGER.warn("!!", e);
             assertNull(e);
         }
     }
     public void testCommannd1(){
         Command chain = (Command) applicationContext.getBean("command1");
         try {
             ContextBase base = new ContextBase();
             chain.execute(base);
             assertEquals(base.get("log message 1"),new Boolean(true));
         } catch (Exception e) {
             LOGGER.warn("!!", e);
             assertNull(e);
         }
     }
}
