# 自定义maven插件

#### 参考资料
- http://maven.apache.org/guides/plugin/guide-java-plugin-development.html
- http://maven.apache.org/plugin-developers/plugin-testing.html
- http://maven.apache.org/developers/mojo-api-specification.html

#### 运行插件
```
# 全路径，<goal>由@Mojo的name属性指定
$ mvn com.zlikun.jee:zlikun-maven-plugin:1.0.0:hello

# 短路径，命名符合规则（<plugin_name>-maven-plugin）才能使用短路径
$ mvn zlikun:hello
```

#### 客户端配置
```
<plugin>
    <groupId>com.zlikun.jee</groupId>
    <artifactId>zlikun-maven-plugin</artifactId>
    <version>1.0.0</version>
    <!-- 自定义配置参数，List和Map暂时测试未通过 -->
    <configuration>
        <name>zlikun</name>
        <flag>true</flag>
        <size>16</size>
        <score>70.5</score>
        <url>https://zlikun.com</url>
        <date>2018-9-30 16:00:00.0</date>
        <gender>MALE</gender>
        <tags>
            <param>X</param>
            <param>Y</param>
            <param>Z</param>
        </tags>
    </configuration>
    <!-- 可以为插件绑定生命周期，这里绑定为：编译阶段 -->
    <executions>
        <execution>
            <goals>
                <goal>hello</goal>
            </goals>
            <phase>compile</phase>
        </execution>
    </executions>
</plugin>
```