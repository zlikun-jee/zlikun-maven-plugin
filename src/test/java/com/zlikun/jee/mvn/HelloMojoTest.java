//package com.zlikun.jee.mvn;
//
//import org.apache.maven.plugin.testing.AbstractMojoTestCase;
//import org.junit.Ignore;
//import org.junit.Test;
//
//import java.io.File;
//
///**
// * 自定义插件单元测试
// *
// * @author zlikun
// * @date 2018-09-30 15:55
// */
//public class HelloMojoTest extends AbstractMojoTestCase {
//
//    @Override
//    protected void setUp() throws Exception {
//        super.setUp();
//    }
//
//    @Test @Ignore
//    public void execute() throws Exception {
//        File pom = new File(this.getBasedir(), "pom.xml");
//        System.out.println(pom);
//        HelloMojo mojo = (HelloMojo) this.lookupMojo("hello", pom);
//        assertNotNull(mojo);
//    }
//}