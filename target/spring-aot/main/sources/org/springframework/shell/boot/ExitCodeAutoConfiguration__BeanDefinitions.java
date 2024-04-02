package org.springframework.shell.boot;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.shell.exit.ExitCodeExceptionProvider;

/**
 * Bean definitions for {@link ExitCodeAutoConfiguration}
 */
public class ExitCodeAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'exitCodeAutoConfiguration'
   */
  public static BeanDefinition getExitCodeAutoConfigurationBeanDefinition() {
    Class<?> beanType = ExitCodeAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(ExitCodeAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'shellExitCodeExceptionMapper'.
   */
  private static BeanInstanceSupplier<ExitCodeAutoConfiguration.ShellExitCodeExceptionMapper> getShellExitCodeExceptionMapperInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ExitCodeAutoConfiguration.ShellExitCodeExceptionMapper>forFactoryMethod(ExitCodeAutoConfiguration.class, "shellExitCodeExceptionMapper")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ExitCodeAutoConfiguration.class).shellExitCodeExceptionMapper());
  }

  /**
   * Get the bean definition for 'shellExitCodeExceptionMapper'
   */
  public static BeanDefinition getShellExitCodeExceptionMapperBeanDefinition() {
    Class<?> beanType = ExitCodeAutoConfiguration.ShellExitCodeExceptionMapper.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getShellExitCodeExceptionMapperInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'shellExitCodeMappingsExceptionMapper'.
   */
  private static BeanInstanceSupplier<ExitCodeAutoConfiguration.ShellExitCodeMappingsExceptionMapper> getShellExitCodeMappingsExceptionMapperInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ExitCodeAutoConfiguration.ShellExitCodeMappingsExceptionMapper>forFactoryMethod(ExitCodeAutoConfiguration.class, "shellExitCodeMappingsExceptionMapper")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ExitCodeAutoConfiguration.class).shellExitCodeMappingsExceptionMapper());
  }

  /**
   * Get the bean definition for 'shellExitCodeMappingsExceptionMapper'
   */
  public static BeanDefinition getShellExitCodeMappingsExceptionMapperBeanDefinition() {
    Class<?> beanType = ExitCodeAutoConfiguration.ShellExitCodeMappingsExceptionMapper.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getShellExitCodeMappingsExceptionMapperInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'exitCodeExceptionProvider'.
   */
  private static BeanInstanceSupplier<ExitCodeExceptionProvider> getExitCodeExceptionProviderInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ExitCodeExceptionProvider>forFactoryMethod(ExitCodeAutoConfiguration.class, "exitCodeExceptionProvider")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ExitCodeAutoConfiguration.class).exitCodeExceptionProvider());
  }

  /**
   * Get the bean definition for 'exitCodeExceptionProvider'
   */
  public static BeanDefinition getExitCodeExceptionProviderBeanDefinition() {
    Class<?> beanType = ExitCodeExceptionProvider.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getExitCodeExceptionProviderInstanceSupplier());
    return beanDefinition;
  }
}
