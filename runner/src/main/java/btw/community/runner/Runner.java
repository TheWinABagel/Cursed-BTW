package btw.community.runner;

import net.fabricmc.api.EnvType;
import net.fabricmc.loader.impl.launch.knot.Knot;

import java.util.Objects;

public class Runner {
    public static void main(String[] args) {
        if (Objects.equals(args[0], "CLIENT")) {
            tryLaunch(args, EnvType.CLIENT);
        }
        else if (Objects.equals(args[0], "SERVER")) {
            tryLaunch(args, EnvType.SERVER);
        }
        else {
            System.err.println("Invalid argument: " + args[0]);
        }
    }

    private static void tryLaunch(String[] args, EnvType type) {
        Knot knot = new Knot(type);
        knot.init(args);
    }
}
