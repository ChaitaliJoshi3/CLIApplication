package org.springframework.shell.boot;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.shell.MethodTargetRegistrar;
import org.springframework.shell.command.CommandCatalog;
import org.springframework.shell.command.CommandRegistration;
import org.springframework.shell.standard.ValueProvider;

/**
 * Bean definitions for {@link StandardAPIAutoConfiguration}
 */
public class StandardAPIAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'standardAPIAutoConfiguration'
   */
  public static BeanDefinition getStandardAPIAutoConfigurationBeanDefinition() {
    Class<?> beanType = StandardAPIAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(StandardAPIAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'commandValueProvider'.
   */
  private static BeanInstanceSupplier<ValueProvider> getCommandValueProviderInstanceSupplier() {
    return BeanInstanceSupplier.<ValueProvider>forFactoryMethod(StandardAPIAutoConfiguration.class, "commandValueProvider", CommandCatalog.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(StandardAPIAutoConfiguration.class).commandValueProvider(args.get(0)));
  }

  /**
   * Get the bean definition for 'commandValueProvider'
   */
  public static BeanDefinition getCommandValueProviderBeanDefinition() {
    Class<?> beanType = ValueProvider.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getCommandValueProviderInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'enumValueProvider'.
   */
  private static BeanInstanceSupplier<ValueProvider> getEnumValueProviderInstanceSupplier() {
    return BeanInstanceSupplier.<ValueProvider>forFactoryMethod(StandardAPIAutoConfiguration.class, "enumValueProvider")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(StandardAPIAutoConfiguration.class).enumValueProvider());
  }

  /**
   * Get the bean definition for 'enumValueProvider'
   */
  public static BeanDefinition getEnumValueProviderBeanDefinition() {
    Class<?> beanType = ValueProvider.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getEnumValueProviderInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'fileValueProvider'.
   */
  private static BeanInstanceSupplier<ValueProvider> getFileValueProviderInstanceSupplier() {
    return BeanInstanceSupplier.<ValueProvider>forFactoryMethod(StandardAPIAutoConfiguration.class, "fileValueProvider")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(StandardAPIAutoConfiguration.class).fileValueProvider());
  }

  /**
   * Get the bean definition for 'fileValueProvider'
   */
  public static BeanDefinition getFileValueProviderBeanDefinition() {
    Class<?> beanType = ValueProvider.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getFileValueProviderInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'standardMethodTargetResolver'.
   */
  private static BeanInstanceSupplier<MethodTargetRegistrar> getStandardMethodTargetResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MethodTargetRegistrar>forFactoryMethod(StandardAPIAutoConfiguration.class, "standardMethodTargetResolver", ApplicationContext.class, CommandRegistration.BuilderSupplier.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(StandardAPIAutoConfiguration.class).standardMethodTargetResolver(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'standardMethodTargetResolver'
   */
  public static BeanDefinition getStandardMethodTargetResolverBeanDefinition() {
    Class<?> beanType = MethodTargetRegistrar.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getStandardMethodTargetResolverInstanceSupplier());
    return beanDefinition;
  }
}
