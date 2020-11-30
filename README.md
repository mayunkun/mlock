# mlock
方法级基于注释的分布式方法锁

Annotation based distributed method lock at method level


项目已经上传中央仓库，您可以通过pom引入如下代码

The project has been uploaded to the central warehouse. You can import the following code through POM

```
<dependency>
  <groupId>com.aeert</groupId>
  <artifactId>mlock</artifactId>
  <version>2.3.0.RELEASE</version>
</dependency>
```

启动类加上组件的路径(com.aeert)扫描即可，路径(com.aeert)需要放在最后面

The path of the startup class plus the component（ com.aeert ）Scan, path（ com.aeert ）It needs to be at the back
```
@SpringBootApplication(scanBasePackages = {"com.example.vfilterdemo", "com.aeert"})
public class VfilterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VfilterDemoApplication.class, args);
    }

}
```

通过一行注解即可使用，用法类似Spring cache

It can be used through one line of annotation, similar to spring cache

```
    @Override
    @MLock(key = "targetClass + methodName + ':' + #p0 + #p1 + #p2", expires = 20000L, registryKey = "redis-key",message = "当前操作正在执行！", automatic = true)
    public String getInfo(String param1, String param2, String param3) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return param1 + param2 + param3;
    }
```
