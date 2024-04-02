package org.springframework.shell.boot;

import java.lang.Class;
import org.jline.reader.LineReader;
import org.jline.reader.Parser;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.shell.Shell;
import org.springframework.shell.context.ShellContext;
import org.springframework.shell.jline.InteractiveShellRunner;
import org.springframework.shell.jline.NonInteractiveShellRunner;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.shell.jline.ScriptShellRunner;

/**
 * Bean definitions for {@link ShellRunnerAutoConfiguration}
 */
public class ShellRunnerAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.shell.boot.ShellRunnerAutoConfiguration'.
   */
  private static BeanInstanceSupplier<ShellRunnerAutoConfiguration> getShellRunnerAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ShellRunnerAutoConfiguration>forConstructor(Shell.class, PromptProvider.class, LineReader.class, Parser.class, ShellContext.class)
            .withGenerator((registeredBean, args) -> new ShellRunnerAutoConfiguration(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4)));
  }

  /**
   * Get the bean definition for 'shellRunnerAutoConfiguration'
   */
  public static BeanDefinition getShellRunnerAutoConfigurationBeanDefinition() {
    Class<?> beanType = ShellRunnerAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getShellRunnerAutoConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'interactiveApplicationRunner'.
   */
  private static BeanInstanceSupplier<InteractiveShellRunner> getInteractiveApplicationRunnerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<InteractiveShellRunner>forFactoryMethod(ShellRunnerAutoConfiguration.class, "interactiveApplicationRunner")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ShellRunnerAutoConfiguration.class).interactiveApplicationRunner());
  }

  /**
   * Get the bean definition for 'interactiveApplicationRunner'
   */
  public static BeanDefinition getInteractiveApplicationRunnerBeanDefinition() {
    Class<?> beanType = InteractiveShellRunner.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getInteractiveApplicationRunnerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'nonInteractiveApplicationRunner'.
   */
  private static BeanInstanceSupplier<NonInteractiveShellRunner> getNonInteractiveApplicationRunnerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<NonInteractiveShellRunner>forFactoryMethod(ShellRunnerAutoConfiguration.class, "nonInteractiveApplicationRunner", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ShellRunnerAutoConfiguration.class).nonInteractiveApplicationRunner(args.get(0)));
  }

  /**
   * Get the bean definition for 'nonInteractiveApplicationRunner'
   */
  public static BeanDefinition getNonInteractiveApplicationRunnerBeanDefinition() {
    Class<?> beanType = NonInteractiveShellRunner.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getNonInteractiveApplicationRunnerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'scriptApplicationRunner'.
   */
  private static BeanInstanceSupplier<ScriptShellRunner> getScriptApplicationRunnerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ScriptShellRunner>forFactoryMethod(ShellRunnerAutoConfiguration.class, "scriptApplicationRunner")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ShellRunnerAutoConfiguration.class).scriptApplicationRunner());
  }

  /**
   * Get the bean definition for 'scriptApplicationRunner'
   */
  public static BeanDefinition getScriptApplicationRunnerBeanDefinition() {
    Class<?> beanType = ScriptShellRunner.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getScriptApplicationRunnerInstanceSupplier());
    return beanDefinition;
  }
}
