/*
 * See LICENSE file in distribution for copyright and licensing information.
 */
package org.yaml.snakeyaml.resolver;

import java.util.regex.Pattern;

class ResolverTuple {
    private String tag;
    private Pattern regexp;

    public ResolverTuple(String tag, Pattern regexp) {
        this.tag = tag;
        this.regexp = regexp;
    }

    public String getTag() {
        return tag;
    }

    public Pattern getRegexp() {
        return regexp;
    }
}