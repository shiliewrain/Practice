参考 [Spring源码剖析——核心IOC容器原理](http://blog.csdn.net/lisongjia123/article/details/52129340)

IOC容器使用步骤：

1.创建Ioc配置文件的抽象资源，这个抽象资源包含了BeanDefinition的定义信息

2.创建一个BeanFactory，这里使用了DefaultListableBeanFactory

3.创建一个载入BeanDefinition的读取器，这里使用XmlBeanDefinitionReader来载入XML文件形式的BeanDefinition

4.然后将上面定位好的Resource，通过一个回调配置给BeanFactory

5.从定位好的资源位置读入配置信息，具体的解析过程由XmlBeanDefinitionReader完成

6.完成整个载入和注册Bean定义之后，需要的Ioc容器就初步建立起来了