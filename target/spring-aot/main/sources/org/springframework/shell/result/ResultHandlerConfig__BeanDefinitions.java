package org.springframework.shell.result;

import java.lang.Class;
import org.jline.terminal.Terminal;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.shell.command.CommandCatalog;
import org.springframework.shell.command.CommandParserExceptionResolver;
import org.springframework.shell.context.ShellContext;

/**
 * Bean definitions for {@link ResultHandlerConfig}
 */
public class ResultHandlerConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'resultHandlerConfig'
   */
  public static BeanDefinition getResultHandlerConfigBeanDefinition() {
    Class<?> beanType = ResultHandlerConfig.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(ResultHandlerConfig.class);
    beanDefinition.setInstanceSupplier(ResultHandlerConfig$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'terminalSizeAwareResultHandler'.
   */
  private static BeanInstanceSupplier<TerminalSizeAwareResultHandler> getTerminalSizeAwareResultHandlerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TerminalSizeAwareResultHandler>forFactoryMethod(ResultHandlerConfig.class, "terminalSizeAwareResultHandler", Terminal.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ResultHandlerConfig.class).terminalSizeAwareResultHandler(args.get(0)));
  }

  /**
   * Get the bean definition for 'terminalSizeAwareResultHandler'
   */
  public static BeanDefinition getTerminalSizeAwareResultHandlerBeanDefinition() {
    Class<?> beanType = TerminalSizeAwareResultHandler.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getTerminalSizeAwareResultHandlerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'attributedCharSequenceResultHandler'.
   */
  private static BeanInstanceSupplier<AttributedCharSequenceResultHandler> getAttributedCharSequenceResultHandlerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<AttributedCharSequenceResultHandler>forFactoryMethod(ResultHandlerConfig.class, "attributedCharSequenceResultHandler", Terminal.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ResultHandlerConfig.class).attributedCharSequenceResultHandler(args.get(0)));
  }

  /**
   * Get the bean definition for 'attributedCharSequenceResultHandler'
   */
  public static BeanDefinition getAttributedCharSequenceResultHandlerBeanDefinition() {
    Class<?> beanType = AttributedCharSequenceResultHandler.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getAttributedCharSequenceResultHandlerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultResultHandler'.
   */
  private static BeanInstanceSupplier<DefaultResultHandler> getDefaultResultHandlerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DefaultResultHandler>forFactoryMethod(ResultHandlerConfig.class, "defaultResultHandler", Terminal.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ResultHandlerConfig.class).defaultResultHandler(args.get(0)));
  }

  /**
   * Get the bean definition for 'defaultResultHandler'
   */
  public static BeanDefinition getDefaultResultHandlerBeanDefinition() {
    Class<?> beanType = DefaultResultHandler.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getDefaultResultHandlerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'parameterValidationExceptionResultHandler'.
   */
  private static BeanInstanceSupplier<ParameterValidationExceptionResultHandler> getParameterValidationExceptionResultHandlerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ParameterValidationExceptionResultHandler>forFactoryMethod(ResultHandlerConfig.class, "parameterValidationExceptionResultHandler", Terminal.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ResultHandlerConfig.class).parameterValidationExceptionResultHandler(args.get(0)));
  }

  /**
   * Get the bean definition for 'parameterValidationExceptionResultHandler'
   */
  public static BeanDefinition getParameterValidationExceptionResultHandlerBeanDefinition() {
    Class<?> beanType = ParameterValidationExceptionResultHandler.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getParameterValidationExceptionResultHandlerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'commandParserExceptionResolver'.
   */
  private static BeanInstanceSupplier<CommandParserExceptionResolver> getCommandParserExceptionResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CommandParserExceptionResolver>forFactoryMethod(ResultHandlerConfig.class, "commandParserExceptionResolver")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ResultHandlerConfig.class).commandParserExceptionResolver());
  }

  /**
   * Get the bean definition for 'commandParserExceptionResolver'
   */
  public static BeanDefinition getCommandParserExceptionResolverBeanDefinition() {
    Class<?> beanType = CommandParserExceptionResolver.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getCommandParserExceptionResolverInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'throwableResultHandler'.
   */
  private static BeanInstanceSupplier<ThrowableResultHandler> getThrowableResultHandlerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ThrowableResultHandler>forFactoryMethod(ResultHandlerConfig.class, "throwableResultHandler", Terminal.class, CommandCatalog.class, ShellContext.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ResultHandlerConfig.class).throwableResultHandler(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'throwableResultHandler'
   */
  public static BeanDefinition getThrowableResultHandlerBeanDefinition() {
    Class<?> beanType = ThrowableResultHandler.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getThrowableResultHandlerInstanceSupplier());
    return beanDefinition;
  }
}
