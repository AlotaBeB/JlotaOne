package com.alota.jlota;

import com.alota.jlota.JlotaOneApp;
import com.alota.jlota.config.AsyncSyncConfiguration;
import com.alota.jlota.config.EmbeddedElasticsearch;
import com.alota.jlota.config.EmbeddedKafka;
import com.alota.jlota.config.EmbeddedMongo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { JlotaOneApp.class, AsyncSyncConfiguration.class })
@EmbeddedMongo
@EmbeddedElasticsearch
@EmbeddedKafka
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
