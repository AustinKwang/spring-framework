org.springframework.context.support.AbstractApplicationContext#resourcePatternResolver  = PathMatch...

propertyResolver  = PropertySourcesPropertyResolver

strictHelper = PropertyPlaceholderHelper

**obtainFreshBeanFactory方法中处理如下**:
    doRegisterBeanDefinitions

    用以解析xml中的Beandefinition
    BeanDefinitionParserDelegate



    registerBeanDefinitionParser("property-placeholder", new PropertyPlaceholderBeanDefinitionParser());
    registerBeanDefinitionParser("property-override", new PropertyOverrideBeanDefinitionParser());
    registerBeanDefinitionParser("annotation-config", new AnnotationConfigBeanDefinitionParser());
    registerBeanDefinitionParser("component-scan", new ComponentScanBeanDefinitionParser());
    registerBeanDefinitionParser("load-time-weaver", new LoadTimeWeaverBeanDefinitionParser());
    registerBeanDefinitionParser("spring-configured", new SpringConfiguredBeanDefinitionParser());
    registerBeanDefinitionParser("mbean-export", new MBeanExportBeanDefinitionParser());
    registerBeanDefinitionParser("mbean-server", new MBeanServerBeanDefinitionParser());



    ContextAnnotationAutowireCandidateResolver

    在loadBean Defini中先注册了如下bean调用了
    <context:annotation-config />配置添加了如下的BeanPostProcessor到BeanMap中
    nnotationConfigUtils.registerAnnotationConfigProcessors()方法
    org.springframework.context.annotation.internalConfigurationAnnotationProcessor  ConfigurationClassPostProcessor
    org.springframework.context.annotation.internalAutowiredAnnotationProcesso  AutowiredAnnotationBeanPostProcessor
    org.springframework.context.annotation.internalCommonAnnotationProcessor   CommonAnnotationBeanPostProcessor
    org.springframework.context.event.internalEventListenerProcessor   EventListenerMethodProcessor
    org.springframework.context.event.internalEventListenerFactory  DefaultEventListenerFactory

**prepareBeanFactory方法中处理**

**invokeBeanFactoryPostProcessors执行BFPP**

interface org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor  可寻找到  ConfigurationClassPostProcessor
执行如上类中: postProcessBeanDefinitionRegistry 方法
执行postProcessBeanFactory()