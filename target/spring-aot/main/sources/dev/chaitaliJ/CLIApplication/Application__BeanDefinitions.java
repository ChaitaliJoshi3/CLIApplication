package dev.chaitaliJ.CLIApplication;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link Application}
 */
public class Application__BeanDefinitions {
  /**
   * Get the bean definition for 'application'
   */
  public static BeanDefinition getApplicationBeanDefinition() {
    Class<?> beanType = Application.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(Application.class);
    beanDefinition.setInstanceSupplier(Application$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
