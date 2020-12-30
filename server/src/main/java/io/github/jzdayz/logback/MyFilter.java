package io.github.jzdayz.logback;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.AbstractMatcherFilter;
import ch.qos.logback.core.spi.FilterReply;

import java.util.Objects;

public class MyFilter extends AbstractMatcherFilter<ILoggingEvent> {

    String contextName;

    @Override
    public FilterReply decide(ILoggingEvent event) {
        if (Objects.equals(event.getLoggerContextVO().getName(),contextName)){
            return onMatch;
        }
        return onMismatch;
    }

    public void setContextName(String contextName) {
        this.contextName = contextName;
    }
}
