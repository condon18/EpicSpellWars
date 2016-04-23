package scottie.cs301.EpicActuals.Players;

import android.view.View;

import scottie.cs301.EpicActuals.Resources.Actions.CHOICE;
import scottie.cs301.EpicActuals.Resources.Actions.SendSpell;
import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;
import scottie.cs301.Imports.GameFramework.GameHumanPlayer;
import scottie.cs301.Imports.GameFramework.GameMainActivity;
import scottie.cs301.Imports.GameFramework.R;
import scottie.cs301.Imports.GameFramework.infoMsg.GameInfo;

/**
 * Created by Zimmerms18 on 3/30/2016.
 *
 * For use in Epic Spell Wars cs301 class project.
 * Team 5: Scott Zimmerman, Markus Perry, Liz Mukai, Teresa Condon
 *
 * This is the Human Player class for Epic.
 * Receive info and build the GUI.
 * Handle UI and send actions back to Local.
 */
public class Human extends GameHumanPlayer implements View.OnClickListener, View.OnLongClickListener
{
    protected GameStateActual myRecentState; //full copy of most recently received Game State for easier access
    protected GameMainActivity myActivity;

    public Human(String name) { super(name); } //default constructor
    @Override public View getTopView() {
        return null;
    } //inherited from Game Framework

    @Override public void receiveInfo(GameInfo info) {
        if (info instanceof GameStateActual) {
            this.myRecentState = (GameStateActual) info; //cast it and store



        }
    } //inherited from Game Framework

    public void setAsGui(GameMainActivity activity) {
        myActivity = activity;

        //activity.setContentView(R.layout.);

    } //parse through Recent State and set up GUI elements
    public void onClick(View v) {} //handle various UI actions
    public boolean onLongClick(View v) {
        return false;
    } //for use in zoom-in on element

    public boolean onReadyClicked() { return false; } //visual feedback for card selection
    public CHOICE respondToQuestion(CHOICE[] validAnswers) { return null; } // contextual response
}
