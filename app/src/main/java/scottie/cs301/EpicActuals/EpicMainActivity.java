package scottie.cs301.EpicActuals;

import scottie.cs301.Imports.GameFramework.GameMainActivity;
import scottie.cs301.Imports.GameFramework.LocalGame;
import scottie.cs301.Imports.GameFramework.config.GameConfig;

/**
 * Created by zimmerms18 on 3/30/2016.
 *
 * For use in Epic Spell Wars cs301 class project.
 * Team 5: Scott Zimmerman, Markus Perry, Liz Mukai, Teresa Condon
 *
 * Main Activity to run Epic Spell Wars.
 */
public class EpicMainActivity extends GameMainActivity
{


    @Override public GameConfig createDefaultConfig() {



        return null; } //inherits and builds

    @Override public LocalGame createLocalGame() {return new LocalGameActual();} //inherited method to launch game
}
