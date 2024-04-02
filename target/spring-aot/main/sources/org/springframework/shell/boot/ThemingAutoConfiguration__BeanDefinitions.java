package org.springframework.shell.boot;

import java.lang.Class;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.shell.style.TemplateExecutor;
import org.springframework.shell.style.ThemeActive;
import org.springframework.shell.style.ThemeRegistry;
import org.springframework.shell.style.ThemeResolver;

/**
 * Bean definitions for {@link ThemingAutoConfiguration}
 */
public class ThemingAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'themingAutoConfiguration'
   */
  public static BeanDefinition getThemingAutoConfigurationBeanDefinition() {
    Class<?> beanType = ThemingAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(ThemingAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'themeActive'.
   */
  private static BeanInstanceSupplier<ThemeActive> getThemeActiveInstanceSupplier() {
    return BeanInstanceSupplier.<ThemeActive>forFactoryMethod(ThemingAutoConfiguration.class, "themeActive")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ThemingAutoConfiguration.class).themeActive());
  }

  /**
   * Get the bean definition for 'themeActive'
   */
  public static BeanDefinition getThemeActiveBeanDefinition() {
    Class<?> beanType = ThemeActive.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getThemeActiveInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'themeRegistry'.
   */
  private static BeanInstanceSupplier<ThemeRegistry> getThemeRegistryInstanceSupplier() {
    return BeanInstanceSupplier.<ThemeRegistry>forFactoryMethod(ThemingAutoConfiguration.class, "themeRegistry", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ThemingAutoConfiguration.class).themeRegistry(args.get(0)));
  }

  /**
   * Get the bean definition for 'themeRegistry'
   */
  public static BeanDefinition getThemeRegistryBeanDefinition() {
    Class<?> beanType = ThemeRegistry.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getThemeRegistryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'shellThemeResolver'.
   */
  private static BeanInstanceSupplier<ThemeResolver> getShellThemeResolverInstanceSupplier() {
    return BeanInstanceSupplier.<ThemeResolver>forFactoryMethod(ThemingAutoConfiguration.class, "shellThemeResolver", ThemeRegistry.class, SpringShellProperties.class, ThemeActive.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ThemingAutoConfiguration.class).shellThemeResolver(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'shellThemeResolver'
   */
  public static BeanDefinition getShellThemeResolverBeanDefinition() {
    Class<?> beanType = ThemeResolver.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getShellThemeResolverInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'templateExecutor'.
   */
  private static BeanInstanceSupplier<TemplateExecutor> getTemplateExecutorInstanceSupplier() {
    return BeanInstanceSupplier.<TemplateExecutor>forFactoryMethod(ThemingAutoConfiguration.class, "templateExecutor", ThemeResolver.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ThemingAutoConfiguration.class).templateExecutor(args.get(0)));
  }

  /**
   * Get the bean definition for 'templateExecutor'
   */
  public static BeanDefinition getTemplateExecutorBeanDefinition() {
    Class<?> beanType = TemplateExecutor.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getTemplateExecutorInstanceSupplier());
    return beanDefinition;
  }
}
