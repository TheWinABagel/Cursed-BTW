package btw.community.runner;

import net.fabricmc.api.EnvType;
import net.fabricmc.loader.impl.launch.knot.Knot;

public class Runner {
    public static void main(String[] args) {
        tryLaunch(args, EnvType.CLIENT);
        tryLaunch(args, EnvType.SERVER);
    }

    private static void tryLaunch(String[] args, EnvType type) {
        Knot knot = new Knot(type);
        knot.init(args);
    }
}
