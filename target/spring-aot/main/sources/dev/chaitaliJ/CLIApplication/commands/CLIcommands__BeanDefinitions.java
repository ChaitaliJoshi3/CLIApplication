package dev.chaitaliJ.CLIApplication.commands;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CLIcommands}
 */
public class CLIcommands__BeanDefinitions {
  /**
   * Get the bean definition for 'cLIcommands'
   */
  public static BeanDefinition getCLIcommandsBeanDefinition() {
    Class<?> beanType = CLIcommands.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(CLIcommands::new);
    return beanDefinition;
  }
}
