package za.ac.nwu.ac.logicConfig;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.ac.nwu.ac.translator.config.TranslatorConfig;

@Import({TranslatorConfig.class})
@Configuration

public class LogicConfig {
}
