package org.yaml.snakeyaml.parser;

import org.yaml.snakeyaml.events.Event;

interface Production {
    public Event produce();
}
