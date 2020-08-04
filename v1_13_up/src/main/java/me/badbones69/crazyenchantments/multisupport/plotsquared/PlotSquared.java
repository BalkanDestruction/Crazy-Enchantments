package me.badbones69.crazyenchantments.multisupport.plotsquared;

import com.plotsquared.bukkit.util.BukkitUtil;
import com.plotsquared.core.player.PlotPlayer;
import com.plotsquared.core.plot.Plot;
import org.bukkit.entity.Player;

public class PlotSquared implements PlotSquaredVersion {

    public boolean inTerritory(Player player) {
        PlotPlayer<Player> plotPlayer = BukkitUtil.getPlayer(player);
        Plot plot = plotPlayer.getCurrentPlot();
        if (plot == null) {
            return false;
        }
        return plot.isAdded(plotPlayer.getUUID());
    }

}
