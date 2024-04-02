package org.springframework.shell.boot;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.shell.context.ShellContext;

/**
 * Bean definitions for {@link ShellContextAutoConfiguration}
 */
public class ShellContextAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'shellContextAutoConfiguration'
   */
  public static BeanDefinition getShellContextAutoConfigurationBeanDefinition() {
    Class<?> beanType = ShellContextAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(ShellContextAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'shellContext'.
   */
  private static BeanInstanceSupplier<ShellContext> getShellContextInstanceSupplier() {
    return BeanInstanceSupplier.<ShellContext>forFactoryMethod(ShellContextAutoConfiguration.class, "shellContext")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ShellContextAutoConfiguration.class).shellContext());
  }

  /**
   * Get the bean definition for 'shellContext'
   */
  public static BeanDefinition getShellContextBeanDefinition() {
    Class<?> beanType = ShellContext.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getShellContextInstanceSupplier());
    return beanDefinition;
  }
}
