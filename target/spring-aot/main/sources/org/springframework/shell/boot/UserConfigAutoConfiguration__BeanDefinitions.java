package org.springframework.shell.boot;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.shell.config.UserConfigPathProvider;

/**
 * Bean definitions for {@link UserConfigAutoConfiguration}
 */
public class UserConfigAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'userConfigAutoConfiguration'
   */
  public static BeanDefinition getUserConfigAutoConfigurationBeanDefinition() {
    Class<?> beanType = UserConfigAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(UserConfigAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'userConfigPathProvider'.
   */
  private static BeanInstanceSupplier<UserConfigPathProvider> getUserConfigPathProviderInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<UserConfigPathProvider>forFactoryMethod(UserConfigAutoConfiguration.class, "userConfigPathProvider", SpringShellProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(UserConfigAutoConfiguration.class).userConfigPathProvider(args.get(0)));
  }

  /**
   * Get the bean definition for 'userConfigPathProvider'
   */
  public static BeanDefinition getUserConfigPathProviderBeanDefinition() {
    Class<?> beanType = UserConfigPathProvider.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getUserConfigPathProviderInstanceSupplier());
    return beanDefinition;
  }
}
