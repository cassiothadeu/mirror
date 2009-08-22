package net.vidageek.mirror.thirdparty.org.objenesis.instantiator.basic;

import net.vidageek.mirror.thirdparty.org.objenesis.ObjenesisException;
import net.vidageek.mirror.thirdparty.org.objenesis.instantiator.ObjectInstantiator;

/**
 * The simplest instantiator - simply calls Class.newInstance(). This can deal
 * with default public constructors, but that's about it.
 * 
 * @see ObjectInstantiator
 */
@SuppressWarnings("all")
public class NewInstanceInstantiator implements ObjectInstantiator {

    private final Class type;

    public NewInstanceInstantiator(final Class type) {
        this.type = type;
    }

    public Object newInstance() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new ObjenesisException(e);
        }
    }

}