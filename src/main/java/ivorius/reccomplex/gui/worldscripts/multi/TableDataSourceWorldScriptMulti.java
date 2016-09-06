/*
 *  Copyright (c) 2014, Lukas Tenbrink.
 *  * http://ivorius.net
 */

package ivorius.reccomplex.gui.worldscripts.multi;

import ivorius.reccomplex.gui.table.TableDataSourceSegmented;
import ivorius.reccomplex.gui.table.TableDelegate;
import ivorius.reccomplex.gui.table.TableNavigator;
import ivorius.reccomplex.scripts.world.WorldScriptMulti;

/**
 * Created by lukas on 06.09.16.
 */
public class TableDataSourceWorldScriptMulti extends TableDataSourceSegmented
{
    public TableDataSourceWorldScriptMulti(WorldScriptMulti script, TableDelegate delegate, TableNavigator navigator)
    {
        addManagedSection(0, new TableDataSourceWorldScriptList(script.scripts, delegate, navigator));
    }
}