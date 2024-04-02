package org.springframework.boot.autoconfigure.web.reactive.function.client;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.http.client.reactive.JdkClientHttpConnector;

/**
 * Bean definitions for {@link ClientHttpConnectorConfiguration}
 */
public class ClientHttpConnectorConfiguration__BeanDefinitions {
  /**
   * Bean definitions for {@link ClientHttpConnectorConfiguration.JdkClient}
   */
  public static class JdkClient__BeanDefinitions {
    /**
     * Get the bean definition for 'jdkClient'
     */
    public static BeanDefinition getJdkClientBeanDefinition() {
      Class<?> beanType = ClientHttpConnectorConfiguration.JdkClient.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(ClientHttpConnectorConfiguration.JdkClient::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jdkClientHttpConnector'.
     */
    private static BeanInstanceSupplier<JdkClientHttpConnector> getJdkClientHttpConnectorInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<JdkClientHttpConnector>forFactoryMethod(ClientHttpConnectorConfiguration.JdkClient.class, "jdkClientHttpConnector")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ClientHttpConnectorConfiguration.JdkClient.class).jdkClientHttpConnector());
    }

    /**
     * Get the bean definition for 'jdkClientHttpConnector'
     */
    public static BeanDefinition getJdkClientHttpConnectorBeanDefinition() {
      Class<?> beanType = JdkClientHttpConnector.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setLazyInit(true);
      beanDefinition.setInstanceSupplier(getJdkClientHttpConnectorInstanceSupplier());
      return beanDefinition;
    }
  }
}
