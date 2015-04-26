/*
 *  Copyright (c) 2014, Lukas Tenbrink.
 *  * http://lukas.axxim.net
 */

package ivorius.reccomplex.structures.generic.maze;

/**
 * Created by lukas on 26.04.15.
 */
public class SavedConnector
{
    public String id;

    public Connector toConnector(ConnectorFactory factory)
    {
        return factory.get(id);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SavedConnector that = (SavedConnector) o;

        return !(id != null ? !id.equals(that.id) : that.id != null);

    }

    @Override
    public int hashCode()
    {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString()
    {
        return "SavedConnector{" +
                "id='" + id + '\'' +
                '}';
    }
}
