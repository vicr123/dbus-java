package org.freedesktop.dbus;

import java.util.Objects;

public class ObjectPath extends DBusPath {
    private String source;

    public ObjectPath(String _source, String _path) {
        super(_path);
        this.source = _source;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String _source) {
        source = _source;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(source);
        return result;
    }

    @Override
    public boolean equals(Object _obj) {
        if (this == _obj) {
            return true;
        } else if (!super.equals(_obj) || getClass() != _obj.getClass()) {
            return false;
        }
        return Objects.equals(source, ((ObjectPath) _obj).source);
    }

}
