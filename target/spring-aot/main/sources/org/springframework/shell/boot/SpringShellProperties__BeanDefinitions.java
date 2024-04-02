package org.springframework.shell.boot;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SpringShellProperties}
 */
public class SpringShellProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'springShellProperties'
   */
  public static BeanDefinition getSpringShellPropertiesBeanDefinition() {
    Class<?> beanType = SpringShellProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(SpringShellProperties::new);
    return beanDefinition;
  }
}
