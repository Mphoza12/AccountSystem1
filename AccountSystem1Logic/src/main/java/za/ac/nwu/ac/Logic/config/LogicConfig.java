package za.ac.nwu.ac.Logic.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.translator.config.TranslatorConfig;


@Import({TranslatorConfig.class})
@Configuration
@ComponentScan(basePackages = {"za.ac.nwu.ac.logic.flow"})
public class LogicConfig {
}
