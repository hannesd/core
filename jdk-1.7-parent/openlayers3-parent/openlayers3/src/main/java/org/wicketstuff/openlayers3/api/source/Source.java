package org.wicketstuff.openlayers3.api.source;

import org.wicketstuff.openlayers3.api.JavascriptObject;

import java.io.Serializable;

/**
 * Provides an object that models a source of map data.
 */
public abstract class Source extends JavascriptObject implements Serializable {

    public abstract String getJsType();

    public abstract String renderJs();
}
