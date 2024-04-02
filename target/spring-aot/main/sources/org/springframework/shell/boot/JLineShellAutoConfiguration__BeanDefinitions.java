package org.springframework.shell.boot;

import java.lang.Class;
import org.jline.reader.Parser;
import org.jline.terminal.Terminal;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.shell.jline.PromptProvider;

/**
 * Bean definitions for {@link JLineShellAutoConfiguration}
 */
public class JLineShellAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'jLineShellAutoConfiguration'
   */
  public static BeanDefinition getJLineShellAutoConfigurationBeanDefinition() {
    Class<?> beanType = JLineShellAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(JLineShellAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'terminal'.
   */
  private static BeanInstanceSupplier<Terminal> getTerminalInstanceSupplier() {
    return BeanInstanceSupplier.<Terminal>forFactoryMethod(JLineShellAutoConfiguration.class, "terminal", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(JLineShellAutoConfiguration.class).terminal(args.get(0)));
  }

  /**
   * Get the bean definition for 'terminal'
   */
  public static BeanDefinition getTerminalBeanDefinition() {
    Class<?> beanType = Terminal.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setDestroyMethodNames("close");
    beanDefinition.setInstanceSupplier(getTerminalInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'promptProvider'.
   */
  private static BeanInstanceSupplier<PromptProvider> getPromptProviderInstanceSupplier() {
    return BeanInstanceSupplier.<PromptProvider>forFactoryMethod(JLineShellAutoConfiguration.class, "promptProvider")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(JLineShellAutoConfiguration.class).promptProvider());
  }

  /**
   * Get the bean definition for 'promptProvider'
   */
  public static BeanDefinition getPromptProviderBeanDefinition() {
    Class<?> beanType = PromptProvider.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getPromptProviderInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'parser'.
   */
  private static BeanInstanceSupplier<Parser> getParserInstanceSupplier() {
    return BeanInstanceSupplier.<Parser>forFactoryMethod(JLineShellAutoConfiguration.class, "parser")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(JLineShellAutoConfiguration.class).parser());
  }

  /**
   * Get the bean definition for 'parser'
   */
  public static BeanDefinition getParserBeanDefinition() {
    Class<?> beanType = Parser.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getParserInstanceSupplier());
    return beanDefinition;
  }
}
