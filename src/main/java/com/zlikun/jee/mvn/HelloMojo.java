package com.zlikun.jee.mvn;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.net.URL;
import java.util.Date;

/**
 * @author zlikun
 * @date 2018-09-30 15:16
 */
@Mojo(name = "hello")
public class HelloMojo extends AbstractMojo {

    @Parameter
    private String name;
    @Parameter
    private boolean flag;
    @Parameter
    private Integer size;
    @Parameter
    private Double score;
    @Parameter
    private Date date;
    @Parameter
    private URL url;
    @Parameter
    private Gender gender;

    @Parameter
    private String[] tags;

//    // List集合遇到数组越界异常（暂未解决）
//    @Parameter
//    private List<?> lines;

//    // Map集合也遇到数组越界异常（暂未解决）
//    @Parameter
//    private Map<String, String> data;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        this.getLog().info("Hello Maven !");

        this.getLog().info("name => " + name);
        this.getLog().info("flag => " + flag);
        this.getLog().info("size => " + size);
        this.getLog().info("score => " + score);
        this.getLog().info("date => " + date);
        this.getLog().info("url => " + url);
        this.getLog().info("gender => " + gender);

        if (tags != null && tags.length > 0) {
            for (String tag : tags) {
                this.getLog().info("tag => " + tag);
            }
        }

//        if (lines != null && !lines.isEmpty()) {
//            lines.forEach(line -> this.getLog().info("line => " + line));
//        }

//        if (data != null && !data.isEmpty()) {
//            data.forEach((key, value) -> this.getLog().info("key => " + key + ", value => " + value));
//        }

    }
}
