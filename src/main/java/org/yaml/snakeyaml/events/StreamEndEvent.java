/*
 * See LICENSE file in distribution for copyright and licensing information.
 */
package org.yaml.snakeyaml.events;

import org.yaml.snakeyaml.error.Mark;

/**
 * @see PyYAML 3.06 for more information
 */
public class StreamEndEvent extends Event {
    public StreamEndEvent(Mark startMark, Mark endMark) {
        super(startMark, endMark);
    }
}
