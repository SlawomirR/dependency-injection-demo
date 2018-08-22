package io.github.slawomirr.config;

import io.github.slawomirr.examplebeans.FakeDataSource;
import io.github.slawomirr.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {

    @Value("${data.username}")
    String name;

    @Value("${data.password}")
    String password;

    @Value("${data.dburl}")
    String url;

    @Value("${data.jms.username}")
    String jmsName;

    @Value("${data.jms.password}")
    String jmsPassword;

    @Value("${data.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setName(name);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setName(jmsName);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }
}
